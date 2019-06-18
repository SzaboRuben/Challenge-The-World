CREATE TABLE program (
id bigint auto_increment,
programCode varchar(100),
location varchar(100),
activityType varchar(100),
season varchar(15),
startDate date,
endDate date,
description varchar(2000),
price bigint,
candidateLimit int,
programStatus varchar(100),
constraint pk_program primary key(id)
)
engine = innodb character set = utf8 collate utf8_general_ci;

INSERT INTO `program`
(`location`, `programCode`, `activityType`, `season`, `startDate`, `endDate`, `price`, `candidateLimit`, `programStatus`) VALUES
('High Tatras', 'ctw1', 'HIKING','Summer', '2018-06-01', '2018-06-04', 40000, 15, 'POSTPONED'),
('Austrian Alps', 'ctw2', 'MOUNTAINEERING','Spring', '2018-05-01', '2018-05-04', 65000, 15, 'ACTIVE'),
('Julian Alps', 'ctw3', 'RAFTING','Autumn', '2018-09-01', '2018-09-05', 55000, 15, 'ACTIVE')