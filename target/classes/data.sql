drop database if exists newsDB;
create database if not exists newsDB default charset utf8;

use newsDB;

drop table if exists newsType;
create table if not exists newsType(
  TypeId int(4) not null primary key auto_increment,
  TypeName varchar(20) not null,
  Remark varchar(50)
)ENGINE InnoDB DEFAULT CHARSET utf8;
insert into newsType value (1, '国内新闻', '国内大事小事一览');

drop table if exists newsDetailType;
create table if not exists newsDetailType(
  DetailTypeId int(4) not null primary key auto_increment,
  TypeId int(4) not null,
  DetailTypeName varchar(20) not null,
  Remark varchar(50),
  constraint foreign key (TypeId) references newsType(TypeId)
)ENGINE InnoDB DEFAULT CHARSET utf8;
insert into newsDetailType value (1, 1, '经济新闻', '国内经济新闻');

drop table if exists newsMessage;
create table if not exists newsMessage(
  Id int(4) not null primary key auto_increment,
  Title varchar(50) not null,
  DetailType int(4) not null,
  Time datetime not null,
  Address varchar(20),
  Content varchar(200),
  constraint foreign key (DetailType) references newsDetailType(DetailTypeId)
)ENGINE InnoDB DEFAULT CHARSET utf8;
insert into newsMessage values (1, '央行降准消息今日发布', 1, now(), '#', '测试内容');

commit;