 create table historia(
	id_historia Bigint not null primary key auto_increment,
	nomehistoria VARCHAR(100),
	autor VARCHAR(100),
	descricao VARCHAR(150),
	conteudo VARCHAR(8000),
    tipo VARCHAR(150),
    imagem VARCHAR(150),
    conquista_id int not null
 );

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values ('Coraline','Neil Gaymer','desc', 'Enquanto explora sua nova casa à noite, a pequena Coraline descobre uma porta secreta que contém um mundo parecido com o dela, porém melhor em muitas maneiras. Todos têm botões no lugar dos olhos, os pais são carinhosos e os sonhos de Coraline viram realidade por lá. Ela se encanta com essa descoberta, mas logo percebe que segredos estranhos estão em ação: uma outra mãe e o resto de sua família tentam mantê-la eternamente nesse mundo paralelo.', 'HISTORIA', 'Ficção', '../../assets/img/historias/coraline.jpg', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values ('Aladdin', 'Antoine Galland', 'Um jovem humilde descobre uma lâmpada mágica com um gênio que pode conceder desejos. Agora, o rapaz quer conquistar a moça por quem se apaixonou, mas o que ele não sabe é que a jovem é uma princesa que já está comprometida. Com a ajuda do gênio, ele tenta se passar por um príncipe para fisgar o amor da moça e a confiança de seu pai.', 'HISTORIA', 'Ficção', '../../assets/img/historias/aladdin.jpg', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values ('Alice no país das Maravilhas', 'Lewis Carroll','“A única forma de chegar ao impossível e acreditar que é possível” Todos nós possuímos sonhos que, à primeira vista, parecem que são impossíveis. Isso porque no começo dispomos de pouca experiência e recursos para encarar tal empreitada', 'HISTORIA', 'Ficção', 'Histórias clássicas', '../../assets/img/historias/alice.jpg', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values ('Dumbo','Tim Burton','Dumbo é um bebê elefante de um circo que nasceu com orelhas enormes. Após ser ridicularizado por seu grupo de amigos, ele se transforma na principal atração de seu circo quando descobre que, usando suas orelhas, é capaz de fazer o que nenhum outro elefante consegue: voar.', 'HISTORIA', 'Histórias infantis', '../../assets/img/historias/alladin.jpg', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values ('O Pequeno Príncipe','autor','desc', 'hist', 'Histórias infantis', '../../assets/img/historias/principe.jpg', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values ('O Mágico De Oz', 'autor','desc', 'hist', 'Histórias infantis', '../../assets/img/historias/magico.jpg', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values ('Os Três Porquinhos', 'autor','desc', 'hist', 'Histórias infantis', '../../assets/img/historias/porquinhos.jpg', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values ('A Bela e a Fera', 'autor','desc', 'hist', 'Histórias infantis', '../../assets/img/historias/bela.jpg', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values ('Peter Pan', 'autor','desc', 'hist', 'Histórias clássicas', '../../assets/img/historias/peter.jpg', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values ('O Rei Leão','autor','desc', 'hist', 'Histórias clássicas', '../../assets/img/historias/leao.jpg', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values ('Dumbo','autor','desc', 'hist', 'Histórias clássicas', '../../assets/img/historias/dumbo.jpg', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values ('Saci-Pererê','autor','desc', 'hist', 'Folclore brasileiro',  '../../assets/img/historias/saci.jpeg', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values ('Boto','autor','desc', 'hist', 'Folclore brasileiro', '../../assets/img/historias/boto.jpg', 2);

