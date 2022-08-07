 create table historia(
	id_historia Bigint not null primary key auto_increment,
	nome VARCHAR(100),
	descricao VARCHAR(150),
	conteudo VARCHAR(250),
    tipo VARCHAR(15),
    conquista_id int not null
 );

insert into historia(nome, descricao, conteudo, tipo, conquista_id) values ('Coraline','Coraline luta contra o capeta q é a mae dela', 'historiaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA', 'Terror', 2);
