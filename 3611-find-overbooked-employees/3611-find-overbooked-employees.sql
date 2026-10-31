# Write your MySQL query statement below
with cte as (
    select e.*,
    sum(duration_hours) as total_meeting_hr
    from employees e join meetings m
    on e.employee_id = m.employee_id
    group by employee_id,week(meeting_date,1),year(meeting_date)
    having total_meeting_hr > 20
)




select employee_id,employee_name,department, 
count(*) as meeting_heavy_weeks 
from cte
group by employee_id
having meeting_heavy_weeks  >= 2
order by meeting_heavy_weeks  DESC ,employee_name