CREATE TABLE employee (
    emp_id INT PRIMARY KEY,
    fname VARCHAR(50),
    lname VARCHAR(50),
    desig VARCHAR(50),
    dept VARCHAR(50)
);

-- Insert Records
INSERT INTO employee (emp_id, fname, lname, desig, dept) VALUES
(101, 'Raju', 'Rastogi', 'Manager', 'Loan'),
(102, 'Sham', 'Mohan', 'Cashier', 'Cash'),
(103, 'Baburao', 'Apte', 'Associate', 'Loan'),
(104, 'Paul', 'Philip', 'Accountant', 'Account'),
(105, 'Alex', 'Watt', 'Associate', 'Deposit');

-- Display all records
SELECT * FROM employee
order by fname ;

+--------+---------+---------+------------+---------+
| emp_id | fname   | lname   | desig      | dept    |
+--------+---------+---------+------------+---------+
|    105 | Alex    | Watt    | Associate  | Deposit |
|    103 | Baburao | Apte    | Associate  | Loan    |
|    104 | Paul    | Philip  | Accountant | Account |
|    101 | Raju    | Rastogi | Manager    | Loan    |
|    102 | Sham    | Mohan   | Cashier    | Cash    |
+--------+---------+---------+------------+---------+






SELECT * FROM employee
order by dept desc ;

+--------+---------+---------+------------+---------+
| emp_id | fname   | lname   | desig      | dept    |
+--------+---------+---------+------------+---------+
|    101 | Raju    | Rastogi | Manager    | Loan    |
|    103 | Baburao | Apte    | Associate  | Loan    |
|    105 | Alex    | Watt    | Associate  | Deposit |
|    102 | Sham    | Mohan   | Cashier    | Cash    |
|    104 | Paul    | Philip  | Accountant | Account |
+--------+---------+---------+------------+---------+


---frist hgst salary->
SELECT emp_id, fname , salary FROM employee 
order by salary desc limit 1 ;

+--------+-------+--------+
| emp_id | fname | salary |
+--------+-------+--------+
|    104 | Paul  |    800 |
+--------+-------+--------+




/// search by any keyword or length ->


select * from employee where lname like "_____";
| emp_id | fname | lname | desig   | dept | salary |
+--------+-------+-------+---------+------+--------+
|    102 | Sham  | Mohan | Cashier | Cash |    200 |
+--------+-------+-------+---------+------+--------+



select * from employee where desig like "%ass%";

+--------+---------+-------+-----------+---------+--------+
| emp_id | fname   | lname | desig     | dept    | salary |
+--------+---------+-------+-----------+---------+--------+
|    103 | Baburao | Apte  | Associate | Loan    |    300 |
|    105 | Alex    | Watt  | Associate | Deposit |    500 |
+--------+---------+-------+-----------+---------+--------+
