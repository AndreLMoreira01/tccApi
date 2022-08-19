 create table conquista(
	id_conquista Bigint not null primary key auto_increment,
	nome VARCHAR(100),
	descricao VARCHAR(150)
 );

insert into conquista(nome, descricao) values ('Planeta Terra', 'Entre no apicativo pela primeira vez');
insert into conquista(nome, descricao) values ('Planeta Marte', 'Leia todas as histórias');
insert into conquista(nome, descricao) values ('Planeta Júpiter', 'Jogue o jogo dos Significados');
insert into conquista(nome, descricao) values ('Planeta Netuno', 'Jogue das Frutas');
insert into conquista(nome, descricao) values ('Lua', 'Jogue o Jogo da Velha');
insert into conquista(nome, descricao) values ('Sol', 'Conquiste 1500 troféus');
