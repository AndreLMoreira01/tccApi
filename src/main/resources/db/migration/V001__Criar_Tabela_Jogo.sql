 create table jogo(
	id_jogo int not null primary key auto_increment,
	nome VARCHAR(100),
	descricao VARCHAR(150)
 );

insert into jogo(nome) values ('Jogo da velha');
