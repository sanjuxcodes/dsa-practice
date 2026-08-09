-- union (only fetch unique valeus)
-- when have 2 or more select or condition with same data use union
-- lc 1789
-- # Write your MySQL query statement below
select employee_id , department_id from Employee group by employee_id having count(distinct department_id)=1

union
select employee_id , department_id from Employee where primary_flag='Y';


-- lc 602
-- union all(fetch all values with duplicates as well)
-- here used union as CTE then fetched required info from cte

select requester_id as id, count(*) as num from 
(select requester_id from RequestAccepted 
union all
select accepter_id from RequestAccepted)t 
 group by id 
 order by num desc limit 1;


 -- lc 1965
 -- finding missing info from 2 relational tbl

 # Write your MySQL query statement below

select employee_id from Employees 
where employee_id not in (SELECT employee_id
    FROM Salaries)

union

select employee_id from Salaries
where employee_id not in (SELECT employee_id
    FROM employees) 
order by employee_id;



