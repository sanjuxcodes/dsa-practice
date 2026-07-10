create table students(
  fname varchar(20),
  lname varchar(15),
  roll int primary key Auto_increment,
  dept varchar(10)  default 'CSE'

);

Insert into students(fname ,lname) values
('Sanju','Das'),
('Sanju','roy'),
('Sahan','Das');

Select * from students;

Select roll, CONCAT(fname,' ',lname)  as FullNAmes , 
Concat_WS('->',fname,dept) as NamDEpt
from Students;














