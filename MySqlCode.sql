create database Hotel_Project;
use Hotel_Project;

create table login(username varchar(25),password varchar(25));

insert into login values('aditya','123456');

create table room(roomnumber varchar(20), availability varchar(20),cleaning_status varchar(20), price varchar(20), bed_type varchar(20));
select * from room;

create table employee (name varchar(20), age varchar(20), gender varchar(12), job varchar(20), salary varchar(20), phone varchar(20), email varchar(20),aadhar varchar (14));
select * from employee;

create table driver(name varchar(20), age varchar(20), gender varchar(20),company varchar(20),carname varchar(20),available varchar(20),loaction varchar(20));

create table login2 (user_name varchar(20),password varchar(20));
insert into login2 values('kunal', '123456');

create table department(department varchar(20), budget varchar(30) );

insert into department values('foof', '500000');
insert into department values('office', '30000');
insert into department values('Housekeeping', '30000');
insert into department values('kitchen', '30000');
insert into department values('Security', '100000');


create table customer(document varchar(30), number varchar(30),name varchar(30), gender varchar(30), country varchar(30),room varchar(30),
checkintime varchar(40),  deposit varchar(20));
