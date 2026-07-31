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