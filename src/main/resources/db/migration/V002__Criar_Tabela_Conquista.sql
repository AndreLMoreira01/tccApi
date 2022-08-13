 create table conquista(
	id_conquista Bigint not null primary key auto_increment,
	nome VARCHAR(100),
	descricao VARCHAR(150)
 );

--cada conquista vale 300 troféus, para dar 1500 no final
insert into conquista(nome, descricao) values ('Planeta Terra', 'Entre no apicativo pela primeira vez');
insert into conquista(nome, descricao) values ('Planeta Marte', 'Leia todas as histórias');
insert into conquista(nome, descricao) values ('Planeta Júpiter', 'Jogue o jogo dos Significados');
insert into conquista(nome, descricao) values ('Planeta Netuno', 'Jogue o Genius');
insert into conquista(nome, descricao) values ('Lua', 'Jogue o Jogo da Velha');
insert into conquista(nome, descricao) values ('Sol', 'Conquiste 1500 troféus');
