create database hotel;

use hotel;

create table checkins(
    checkin_id int not null primary key,
    -- A column in a table that uniquely identifies each row.
    name varchar(20) not null,
);

insert into checkins 
values
(1, "Anna"),
(2, "Sudha");

create table checkout(
    checkin_id int,
    checkout_id int not null,
    phno int not null,
    address varchar(60) not null,
    foreign key (checkin_id) references checkins(checkin_id)
    -- A column in a table which refers to the primary key in another table. 
);

insert into checkout
values
(1, 10, 9090909090, "Channai"),
(2, 20, 8090909090, "Pune");

select * from checkins;
select * from checkout;

-- no deference in both of this desc and describe.
desc checkins;
describe checkout;

drop table checkins;
drop table checkout;

drop database hotel;