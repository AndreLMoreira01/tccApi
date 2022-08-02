 create table historia(
	id_historia Bigint not null primary key auto_increment,
	nome VARCHAR(100),
	descricao VARCHAR(150),
	conteudo VARCHAR(250),
    tipo VARCHAR(15)
 );

insert into historia(nome, descricao, conteudo, tipo) values ('Coraline', 'Muito amor', ': Certas portas não devem ser abertas. E Coraline descobre isso pouco tempo depois de chegar com os pais à sua nova casa, um apartamento em um casarão antigo ocupado por vizinhos excêntricos e envolto por uma névoa insistente, um mundo de estranhezas e magia, o tipo de universo que apenas Neil Gaiman pode criar.', 'terror');

