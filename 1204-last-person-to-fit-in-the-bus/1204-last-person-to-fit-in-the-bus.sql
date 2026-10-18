# Write your MySQL query statement below
with cte as (
    select
    person_name,
    SUM(weight) OVER (ORDER BY turn) AS total_weight
    from queue
)
select
person_name
from cte
where total_weight<=1000
ORDER BY total_weight DESC
LIMIT 1