


CREATE TABLE Candidates(
  id Integer Primary key,
  roll Integer,
  nam varchar(10),
  dept varchar(10) not null
);
Insert into Candidates(id,roll,nam,dept) values
(123, 12,"sanju","Cse");


Insert into Candidates(id,roll,nam,dept) values (124,11,"rahul","CST"),(125,10,"sana","IT");

Select nam from Candidates where dept="Cse";


Update Candidates
set roll=1
where nam="sanju";


Insert into Candidates(id,roll,nam,dept)values(131,13,"raman","CST");


Delete from Candidates
where id=131;
Select * from Candidates;














desc Candidates;
