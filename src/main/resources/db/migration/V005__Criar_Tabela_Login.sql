 create table login(
	id_login Bigint not null primary key auto_increment,
	username VARCHAR(100),
	senha VARCHAR(100)
 );

insert into login(username, senha) values ('JoaoPikaSeca', 'banana321');
insert into login(username, senha) values ('TIgas', 'cacete321');