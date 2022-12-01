 create table jogo(
	id_jogo Bigint not null primary key auto_increment,
	nomejogo VARCHAR(100),
	descricao VARCHAR(150),
	imagem VARCHAR(150),
	rota VARCHAR(150),
	conquistad VARCHAR(150),
    conquista_id int not null
 );

 insert into jogo(nomejogo, descricao, imagem, rota, conquistad, conquista_id) values ('Jogo da Velha', 'Desc', '../../assets/img/jogos/velha.png', '/j-velha', 'unlockMars()', 5);
 insert into jogo(nomejogo, descricao, imagem, rota, conquistad,  conquista_id) values ('Jogo Dos Significados', 'Desc', '../../assets/img/jogos/significados.png', '/j-significados', 'unlockMars()', 3);

