USE SpringTest

create table ROLE(
	id bigint identity,
	role_code nvarchar(30),
	role_name nvarchar(30),
	primary key (id)
)

create table USER_DETAIL(
	id bigint identity,
	name nvarchar(30),
	account nvarchar(30),
	password nvarchar(30),
	role_id bigint,
	primary key (id),
	foreign key (role_id) REFERENCES  ROLE(id)
)

insert into ROLE values ('ADMIN','管理者'),('USER','一般使用者')

insert into USER_DETAIL values
('Colin','colingood026','big',1),
('James','jamesbad1','small',2)