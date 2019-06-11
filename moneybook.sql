create database exercise;
use exercise;
create table moneybook (
date date,
item varchar(10),
amount int
);
show tables;
describe moneybook;
show create table moneybook;
insert into moneybook values('2019-05-01','交通費',430);
select*from moneybook;
select date,amount from moneybook;
select*from moneybook limit 5 offset 3;
select*from moneybook where item = '交通費';
select*from moneybook where amount between 200 and 500;
select*from moneybook where item　like '%費';
select*from moneybook order by item;
select*from moneybook order by item desc;
update moneybook
set amount = 500
where date = '2019-5-01' and item = '交通費';
select sum(amount),avg(amount),count(amount) from moneybook;
select item, sum(amount) from moneybook group by item order by item;
start transaction;
#commit or roleback;