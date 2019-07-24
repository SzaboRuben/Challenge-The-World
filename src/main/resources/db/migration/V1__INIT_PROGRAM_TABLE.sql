CREATE TABLE program (
id bigint auto_increment,
address varchar(100),
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
(`address`,`programCode`, `location`, `activityType`, `season`, `startDate`, `endDate`, `description`, `price`, `candidateLimit`, `programStatus`) VALUES
( 'high tatras-hiking', 'ctw1', 'High Tatras', 'HIKING','Summer', '2018-06-01', '2018-06-04', 'template program', 40000, 15, 'POSTPONED'),
( 'austrian alps-mountaineering', 'ctw2', 'Austrian Alps', 'MOUNTAINEERING','Spring', '2018-05-01', '2018-05-04', 'template program', 65000, 15, 'ACTIVE'),
( 'julian alps-rafting', 'ctw3', 'Julian Alps', 'RAFTING','Autumn', '2018-09-01', '2018-09-05', 'template program', 55000, 15, 'ACTIVE')