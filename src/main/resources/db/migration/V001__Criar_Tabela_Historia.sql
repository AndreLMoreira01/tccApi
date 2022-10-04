 create table historia(
	id_historia Bigint not null primary key auto_increment,
	nome VARCHAR(100),
	autor VARCHAR(100),
	descricao VARCHAR(150),
	conteudo VARCHAR(8000),
    tipo VARCHAR(150),
    imagem VARCHAR(150),
    conquista_id int not null
 );

insert into historia(nome, autor, descricao, conteudo, tipo, imagem, conquista_id) values ('Coraline', 'a', 'Coraline luta contra o capeta q é a mae dela', 'hist', 'Terror', '../../assets/imagem.png', 2);

insert into historia(nome, autor, descricao, conteudo, tipo, imagem, conquista_id) values ('Aladdin','b','desc', 'hist', 'Histórias infantis', '../../assets/imagem.png', 2);

insert into historia(nome, autor, descricao, conteudo, tipo, imagem, conquista_id) values ('Alice no país das Maravilhas', 'c','desc', 'hist', 'Histórias infantis', '../../assets/imagem.png', 2);

insert into historia(nome, autor, descricao, conteudo, tipo, imagem, conquista_id) values ('O Pequeno Príncipe','autor','desc', 'hist', 'Histórias infantis', '../../assets/imagem.png', 2);

insert into historia(nome, autor, descricao, conteudo, tipo, imagem, conquista_id) values ('O Mágico De Oz', 'autor','desc', 'hist', 'Histórias infantis', '../../assets/imagem.png', 2);

insert into historia(nome, autor, descricao, conteudo, tipo, imagem, conquista_id) values ('Os Três Porquinhos', 'autor','desc', 'hist', 'Histórias infantis', '../../assets/imagem.png', 2);

insert into historia(nome, autor, descricao, conteudo, tipo, imagem, conquista_id) values ('A Bela e a Fera', 'autor','desc', 'hist', 'Histórias infantis', '../../assets/imagem.png', 2);

insert into historia(nome, autor, descricao, conteudo, tipo, imagem, conquista_id) values ('Peter Pan', 'autor','desc', 'hist', 'Histórias clássicas', '../../assets/imagem.png', 2);

insert into historia(nome, autor, descricao, conteudo, tipo, imagem, conquista_id) values ('O Rei Leão','autor','desc', 'hist', 'Histórias clássicas', '../../assets/imagem.png', 2);

insert into historia(nome, autor, descricao, conteudo, tipo, imagem, conquista_id) values ('Dumbo','autor','desc', 'hist', 'Histórias clássicas', '../../assets/imagem.png', 2);

insert into historia(nome, autor, descricao, conteudo, tipo, imagem, conquista_id) values ('Curupira','autor','desc', 'hist', 'Folclore brasileiro', '../../assets/imagem.png', 2);

insert into historia(nome, autor, descricao, conteudo, tipo, imagem, conquista_id) values ('Saci-Pererê','autor','desc', 'hist', 'Folclore brasileiro',  '../../assets/imagem.png', 2);

insert into historia(nome, autor, descricao, conteudo, tipo, imagem, conquista_id) values ('Iara','autor','desc', 'hist', 'Folclore brasileiro', '../../assets/imagem.png', 2);

