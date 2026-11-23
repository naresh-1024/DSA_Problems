# Write your MySQL query statement below
SELECT id,
CASE
    WHEN p_id IS NULL THEN 'Root'
    WHEN id IN (
        SELECT DISTINCT a.id
        FROM tree a
        JOIN tree b
            ON a.id = b.p_id
        WHERE a.p_id IS NOT NULL
    ) THEN 'Inner'
    ELSE 'Leaf'
END AS type
FROM tree;