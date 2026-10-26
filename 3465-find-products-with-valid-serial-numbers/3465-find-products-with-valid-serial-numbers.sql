# Write your MySQL query statement below
select *
from products
where REGEXP_LIKE(description, '(^|[^A-Za-z0-9])SN[0-9]{4}-[0-9]{4}([^A-Za-z0-9]|$)', 'c')
order by product_id