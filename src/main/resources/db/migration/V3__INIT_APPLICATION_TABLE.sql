CREATE TABLE application(
id bigint auto_increment,
applicant_id bigint,
program_id bigint,
totalApplicants tinyint,
constraint pk_application primary key (id),
constraint fk_applicant foreign key (applicant_id) references applicant(id),
constraint fk_program foreign key (program_id) references program(id)
)
engine = innodb character set = utf8 collate utf8_general_ci;
