 create table jogo(
	id_historia Bigint not null primary key auto_increment,
	nome VARCHAR(100),
	descricao VARCHAR(150),
    conquista_id int not null
 );

 insert into jogo(nome, descricao, conquista_id) values ('Jogo Dos Significados', 'Desc', 3);
 insert into jogo(nome, descricao, conquista_id) values ('Genius', 'Desc', 4);