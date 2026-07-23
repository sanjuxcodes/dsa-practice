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