DROP DATABASE IF EXISTS test;
create database test;
create table test.conticorrenti(
	idConto int not null auto_increment,
    cin varchar(1) not null,
    abi varchar(5) not null,
    cab varchar(5) not null,
    numeroConto varchar(12) not null,
    nomeTitolare varchar(50) not null,
    cognomeTitolare varchar(50) not null,
    codiceFiscaleTitolare varchar(16) not null,
    primary key(idConto)
    );

insert into test.conticorrenti(cin, abi, cab, numeroConto, nomeTitolare, cognomeTitolare, codiceFiscaleTitolare)
values	('1', '01234','56789','012345678901','Alessio','Distefano','DSTLSS96B05H355W'),
	('1', '01234','56789','012345678901','Giovanni','Dalise','DLSGVN90B05H355W'),
    ('1', '01234','56789','012345678901','Davide','Usville','SVLDVD94B05H355W');