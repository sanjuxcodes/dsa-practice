-- union 
-- when have 2 or more select or condition with same data use union
-- lc 1789
-- # Write your MySQL query statement below
select employee_id , department_id from Employee group by employee_id having count(distinct department_id)=1

union
select employee_id , department_id from Employee where primary_flag='Y';


