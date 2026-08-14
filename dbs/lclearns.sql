-- LC 197
-- join on date diff 
select w1.id from Weather w1
join Weather w2
on datediff(w1.recordDate,w2.recordDate)=1
and
w2.temperature < w1.temperature;


-- we can use Min,max functions on date


-- for freq based problems like lc 586 
# Write your MySQL query statement below

SELECT customer_number
FROM (
    SELECT customer_number,
           COUNT(customer_number) AS no_order -- here freq counted
    FROM Orders
    GROUP BY customer_number
) t
ORDER BY no_order DESC -- just sorted the freq
LIMIT 1;


-- lc 607
-- join as a sub query
-- always use primary key to filter in this types of qus

select s.name from SalesPerson s
 where s.sales_id not in
(
select s.sales_id from SalesPerson s
left join Orders o
on s.sales_id=o.sales_id

join Company c
on o.com_id=c.com_id
and c.name ='RED' );


-- valid taringle 
# Write your MySQL query statement below

select x , y, z ,

case
    when x+y <= z then 'No'
    when x+z <= y then 'No'
    when z+y <= x then 'No'
else 'Yes'
end as triangle from Triangle ;


-- lc 619: low freq and high as value

# Write your MySQL query statement below


select max(num) as num from(
    -- for frq  use count and group by
select num , count(num) as freq from Mynumbers group by num) t
where freq=1 ;



-- update based on condition or swap gender types:

update Salary
set sex=
case
    when sex='m' then 'f'
    else 'm'
end;


-- lc 178 ->
-- use of window function
-- give rank without skip (DENSE_RANK):

# Write your MySQL query statement below
                                                    -- here see used key word rank as col name but with " "
select score, DENSE_RANK() OVER(ORDER BY score DESC) as 'rank' from Scores;

-- 2nd hgst salary ->(my concept is right bt)
-- here we have to handle one row test cases where no 2nd salary exists and also with multiple duplicate 2nd hght salary ->


# Write your MySQL query statement below
select ifnull(
(select distinct salary from(
    select 
    salary, dense_rank() over(order by salary desc ) as rnk from Employee
) t 
where rnk=2),null)as SecondHighestSalary ;


-- lc 1693
-- group on multiple colmn 
# Write your MySQL query statement below
select date_id , make_name , count(distinct lead_id) as unique_leads, count(distinct partner_id) 
as unique_partners from DailySales group by make_name,date_id;


-- lc 180 : use lead , lag  window functions as sub qry
# Write your MySQL query statement below
select distinct num as ConsecutiveNums from 
(select
num,
 lead(num,1) over(order by id) as nu,
  lag(num,1) over(order by id) as n2 from Logs ) t
   where num=nu and num=n2;



-- swap with adj seats ..if last dont swap 
-- see the usage of Coalesce function with Window functions along with case 

# Write your MySQL query statement below
select id , 
case 
    when id%2=1 then coalesce(lead(student,1) over(order by id) ,student)
    when id%2=0 then lag(student,1) over(order by id)
end as student from Seat;


-- when sub qry need to return multiple row use 'in' instead of '='

# Write your MySQL query statement below
select name from Employee where id in(
select  
managerId as id from Employee 
group by managerId having  count(managerId) >=5 );



-- when we have to join 2 tbls and instructed to show null if some values are missing or not matching 
-- dont use INNER JOIN
-- use left join
-- lc 1378

# Write your MySQL query statement below
select u.unique_id as unique_id,e.name from Employees e
left join EmployeeUNI u 
on u.id=e.id;


-- lc 1484
-- when have to group any ele of a column wrt any condition (date) use GROUP_CONCAT(colmn name)
# Write your MySQL query statement below
select sell_date , count( distinct product) as num_sold,group_concat( distinct product) as products  from Activities group by sell_date ;


-- lc 1890
-- when need of latest date of any year just use MAX() with date and also order by desc to sort 
# Write your MySQL query statement below
select user_id , max(time_stamp) as last_stamp from Logins
where year(time_stamp)='2020' group by user_id order by Month(time_stamp) desc;


-- lc 1633
-- calc percentage from 2 diff tbl

# Write your MySQL query statement below

select contest_id ,
 round((count(distinct r.user_id)/count(distinct u.user_id))*100,2) 
 as percentage from Register r ,Users u 
group by contest_id 
order by percentage desc ,contest_id asc;


-- lc 3793 
-- get at least one who have more token than its avg 
# Write your MySQL query statement below

select user_id, count(*) as prompt_count , round(avg(tokens),2) as avg_tokens from prompts 
group by user_id having count(*) >=3 and max(tokens)>avg(tokens) order by avg_tokens desc, user_id asc;