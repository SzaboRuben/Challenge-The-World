CREATE TABLE applicant(
id bigint auto_increment,
name varchar(20),
prefFirstName varchar(20),
address varchar(50),
email varchar(50),
dateOfBirth date,
sex varchar(20),
phone varchar(30),
constraint pk_applicant primary key (id)
)
engine = innodb character set = utf8 collate utf8_general_ci;
