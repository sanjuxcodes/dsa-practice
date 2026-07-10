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
SELECT * FROM employee;


select concat(fname,lname) as fllnm from employee;
select concat_ws(':',emp_id,concat(fname,' ',lname),desig,dept) 
as work1 from employee where emp_id=101;

select concat(left(dept,1),emp_id,' ',fname) as 
work2 from employee;

