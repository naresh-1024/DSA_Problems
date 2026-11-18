# Write your MySQL query statement below
select s.name 
from SalesPerson  as s
where s.sales_id  not in(
    select s2.sales_id
    from SalesPerson s2
    join Orders o 
    on s2.sales_id = o.sales_id
    join Company c
    on o.com_id= c.com_id
    where c.name="RED"
)