-- drop database if exists sms_managerengg;
create database sms;
use sms_managerengg;


create table contactinfo(
    id int(11) primary key auto_increment,
    name text,
    branch text,
    year text,
college text,
    email_id text,
    contact text,
 `entrydate` date
);

create table createcontact(
    id int(11) primary key auto_increment,
    name text,
    details text,
 entrydate date,
    active char(1)
);
