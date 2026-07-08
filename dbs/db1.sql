
create table bankinfo(
  id int primary key Auto_increment,
  name varchar(50),
  typ varchar(70) not null Default 'Savings'

);

Insert into bankinfo(name) values("rohan") ,("sanu");



Insert into bankinfo(id,name,typ)
values(12,"jammu","Curr");

Select * from  bankinfo;

Select id as 'Id num' from bankinfo;


Select * from bankinfo where id='12';

select id,name from bankinfo where id='1';

update bankinfo
set name ="snhy"
where name="jammu";

select * from bankinfo;












