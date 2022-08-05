 create table conquista(
	id_historia Bigint not null primary key auto_increment,
	nome VARCHAR(100),
	descricao VARCHAR(150),
 );

insert into conquista(nome, descricao) values ('Planeta Saturno', 'Abrir o App');
