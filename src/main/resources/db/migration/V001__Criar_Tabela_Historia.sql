 create table historia(
	id_historia Bigint not null primary key auto_increment,
	nome VARCHAR(100),
	descricao VARCHAR(150),
	conteudo VARCHAR(8000),
    tipo VARCHAR(150),
    imagem VARCHAR(150),
    conquista_id int not null
 );

insert into historia(nome, descricao, conteudo, tipo, imagem, conquista_id) values ('Coraline','Coraline luta contra o capeta q é a mae dela', 'hist', 'Terror', '../../assets/imagem.png', 2);

insert into historia(nome, descricao, conteudo, tipo, imagem, conquista_id) values ('Aladdin','desc', 'hist', 'Histórias infantis', '../../assets/imagem.png', 2);

insert into historia(nome, descricao, conteudo, tipo, imagem, conquista_id) values ('Alice no país das Maravilhas','desc', 'hist', 'Histórias infantis', '../../assets/imagem.png', 2);

insert into historia(nome, descricao, conteudo, tipo, imagem, conquista_id) values ('O Pequeno Príncipe','desc', 'hist', 'Histórias infantis', '../../assets/imagem.png', 2);

insert into historia(nome, descricao, conteudo, tipo, imagem, conquista_id) values ('O Mágico De Oz','desc', 'hist', 'Histórias infantis', '../../assets/imagem.png', 2);

insert into historia(nome, descricao, conteudo, tipo, imagem, conquista_id) values ('Os Três Porquinhos','desc', 'hist', 'Histórias infantis', '../../assets/imagem.png', 2);

insert into historia(nome, descricao, conteudo, tipo, imagem, conquista_id) values ('A Bela e a Fera','desc', 'hist', 'Histórias infantis', '../../assets/imagem.png', 2);

insert into historia(nome, descricao, conteudo, tipo, imagem, conquista_id) values ('Peter Pan','desc', 'hist', 'Histórias clássicas', '../../assets/imagem.png', 2);

insert into historia(nome, descricao, conteudo, tipo, imagem, conquista_id) values ('O Rei Leão','desc', 'hist', 'Histórias clássicas', '../../assets/imagem.png', 2);

insert into historia(nome, descricao, conteudo, tipo, imagem, conquista_id) values ('Dumbo','desc', 'hist', 'Histórias clássicas', '../../assets/imagem.png', 2);

insert into historia(nome, descricao, conteudo, tipo, imagem, conquista_id) values ('Curupira','desc', 'hist', 'Folclore brasileiro', '../../assets/imagem.png', 2);

insert into historia(nome, descricao, conteudo, tipo, imagem, conquista_id) values ('Saci-Pererê','desc', 'hist', 'Folclore brasileiro',  '../../assets/imagem.png', 2);

insert into historia(nome, descricao, conteudo, tipo, imagem, conquista_id) values ('Iara','desc', 'hist', 'Folclore brasileiro', '../../assets/imagem.png', 2);

