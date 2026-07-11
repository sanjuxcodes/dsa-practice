CREATE TABLE employee (
    emp_id INT PRIMARY KEY,
    fname VARCHAR(30),
    lname VARCHAR(30),
    desig VARCHAR(30),
    dept VARCHAR(30),
    salary INT
);

-- Insert Data
INSERT INTO employee (emp_id, fname, lname, desig, dept, salary)
VALUES
(101, 'Raju',    'Rastogi', 'Manager',    'Loan',     37000),
(102, 'Sham',    'Mohan',   'Cashier',    'Cash',     32000),
(103, 'Baburao', 'Apte',    'Associate',  'Loan',     25000),
(104, 'Paul',    'Philip',  'Accountant', 'Account',  45000),
(105, 'Alex',    'Watt',    'Associate',  'Deposit',  35000),
(106, 'Rick',    'Watt',    'Manager',    'Account',  65000),
(107, 'Leena',   'Jhonson', 'Lead',       'Cash',     25000),
(108, 'John',    'Paul',    'Manager',    'IT',       75000),
(109, 'Alex',    'Watt',    'Probation',  'Loan',     40000);

-- View Table
SELECT dept, count(dept) as dept_wise_no FROM employee group by dept;
+---------+--------------+
| dept    | dept_wise_no |
+---------+--------------+
| Loan    |            3 |
| Cash    |            2 |
| Account |            2 |
| Deposit |            1 |
| IT      |            1 |
+---------+--------------+


SELECT min(salary) as lowest_pay from employee;
| lowest_pay |
+------------+
|      25000 |





SELECT * from employee 
where salary=(SELECT max(salary) from employee);
+--------+-------+-------+---------+------+--------+
| emp_id | fname | lname | desig   | dept | salary |
+--------+-------+-------+---------+------+--------+
|    108 | John  | Paul  | Manager | IT   |  75000 |
+--------+-------+-------+---------+------+--------+




SELECT dept , sum(salary) from employee where dept='loan';
+------+-------------+
| dept | sum(salary) |
+------+-------------+
| Loan |      102000 |
+------+-------------+





SELECT dept, avg(salary) from employee group by dept;
+---------+-------------+
| dept    | avg(salary) |
+---------+-------------+
| Loan    |  34000.0000 |
| Cash    |  28500.0000 |
| Account |  55000.0000 |
| Deposit |  35000.0000 |
| IT      |  75000.0000 |



