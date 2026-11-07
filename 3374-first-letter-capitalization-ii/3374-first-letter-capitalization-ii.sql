WITH RECURSIVE
word_split AS (
    SELECT
        content_id,
        content_text,
        1 AS word_num,
        REGEXP_SUBSTR(content_text, '[^ ]+', 1, 1) AS word
    FROM user_content

    UNION ALL

    SELECT
        content_id,
        content_text,
        word_num + 1,
        REGEXP_SUBSTR(content_text, '[^ ]+', 1, word_num + 1)
    FROM word_split
    WHERE REGEXP_SUBSTR(content_text, '[^ ]+', 1, word_num + 1) IS NOT NULL
),
hyphen_parts AS (
    SELECT
        content_id,
        word_num,
        word,
        1 AS part_num,
        REGEXP_SUBSTR(word, '[^-]+', 1, 1) AS part
    FROM word_split
    WHERE word REGEXP '^[a-zA-Z]+(-[a-zA-Z]+)+$'

    UNION ALL

    SELECT
        content_id,
        word_num,
        word,
        part_num + 1,
        REGEXP_SUBSTR(word, '[^-]+', 1, part_num + 1)
    FROM hyphen_parts
    WHERE REGEXP_SUBSTR(word, '[^-]+', 1, part_num + 1) IS NOT NULL
),
hyphen_converted AS (
    SELECT
        content_id,
        word_num,
        GROUP_CONCAT(
            CONCAT(UPPER(LEFT(part, 1)), LOWER(SUBSTRING(part, 2)))
            ORDER BY part_num
            SEPARATOR '-'
        ) AS converted_word
    FROM hyphen_parts
    GROUP BY content_id, word_num
),
final_words AS (
    SELECT
        w.content_id,
        w.content_text,
        w.word_num,
        CASE
            WHEN w.word REGEXP '^[^a-zA-Z]' THEN w.word
            WHEN h.converted_word IS NOT NULL THEN h.converted_word
            ELSE CONCAT(UPPER(LEFT(w.word, 1)), LOWER(SUBSTRING(w.word, 2)))
        END AS converted_word
    FROM word_split w
    LEFT JOIN hyphen_converted h
        ON w.content_id = h.content_id
        AND w.word_num = h.word_num
)
SELECT
    u.content_id,
    u.content_text AS original_text,
    (
        SELECT GROUP_CONCAT(f.converted_word ORDER BY f.word_num SEPARATOR ' ')
        FROM final_words f
        WHERE f.content_id = u.content_id
    ) AS converted_text
FROM user_content u;