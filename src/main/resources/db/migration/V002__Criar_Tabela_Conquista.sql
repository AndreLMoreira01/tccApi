 create table conquista(
	id_conquista Bigint not null primary key auto_increment,
	nomeconquista VARCHAR(100),
	descricao VARCHAR(150)
 );

insert into conquista(nomeconquista, descricao) values ('Planeta Terra', 'Entre no apicativo pela primeira vez');
insert into conquista(nomeconquista, descricao) values ('Planeta Marte', 'Leia todas as histórias');
insert into conquista(nomeconquista, descricao) values ('Planeta Júpiter', 'Jogue o jogo dos Significados');
insert into conquista(nomeconquista, descricao) values ('Planeta Netuno', 'Jogue das Frutas');
insert into conquista(nomeconquista, descricao) values ('Lua', 'Jogue o Jogo da Velha');
insert into conquista(nomeconquista, descricao) values ('Sol', 'Conquiste 1500 troféus');
