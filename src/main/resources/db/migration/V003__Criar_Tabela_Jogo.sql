 create table jogo(
	id_jogo Bigint not null primary key auto_increment,
	nomejogo VARCHAR(100),
	descricao VARCHAR(150),
	imagem VARCHAR(150),
    conquista_id int not null
 );

 insert into jogo(nomejogo, descricao, imagem, conquista_id) values ('Jogo da Velha', 'Desc', '../../assets/img/jogos/velha.png', 5);
 insert into jogo(nomejogo, descricao, imagem, conquista_id) values ('Jogo Dos Significados', 'Desc', '../../assets/img/jogos/significados.png', 3);
 insert into jogo(nomejogo, descricao, imagem, conquista_id) values ('Jogo das Frutas', 'Desc', '../../assets/img/jogos/frutas.png', 4);
