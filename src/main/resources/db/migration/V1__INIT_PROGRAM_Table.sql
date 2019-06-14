create table program (
id bigint auto_increment,
location varchar(100),
activity_type varchar(100),
season varchar(15),
start_date date,
end_date date,
price bigint,
candidate_limit int,
program_status varchar(100),
constraint pk_program primary key(id)
)
engine = innodb character set = utf8 collate utf8_general_ci;

INSERT INTO `program`
(`location`, `activity_type`, `season`, `start_date`, `end_date`, `price`, `candidate_limit`, `program_status`) VALUES
('High Tatras','Excursion','Summer', '2018-06-01', '2018-06-04', 40000, 15, 'Postponed'),
('Austrian Alps','Mountaineering','Spring', '2018-05-01', '2018-05-04', 65000, 15, 'Activ'),
('Julian Alps','Mountaineering','Autumn', '2018-09-01', '2018-09-05', 55000, 15, 'Activ')