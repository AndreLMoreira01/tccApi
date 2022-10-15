 create table alternativa(
	id_alternativa Bigint not null primary key auto_increment,
	pergunta VARCHAR(150),
    alternativa_id int not null,
    resposta_id int not null
 );

 insert into pergunta(pergunta, alternativa_id, resposta_id) values ('Qual o significado da palavra abaixo? PURPLE', 1, 1);

