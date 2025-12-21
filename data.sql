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
    ph_no int not null,
    address varchar(60) not null,
    foreign key (checkin_id) references checkins(checkin_id)
    -- A column in a table which refers to the primary key in another table. 
);

insert into checkout
values
(1, 10, 9090909090, "Channai" "Anna"),
(2, 20, 8090909090, "Pune" "Sudha");

select * from checkins;

select * from checkout;

desc checkins;
-- no deference in both of this desc and describe.
describe checkout;