 create table historia(
	id Bigint not null primary key auto_increment,
	nomehistoria VARCHAR(100),
	autor VARCHAR(100),
	descricao VARCHAR(800),
	conteudo VARCHAR(8000),
    tipo VARCHAR(150),
    imagem VARCHAR(150),
    conquista_id int not null
 );

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values
('Coraline','Neil Gaiman', 'Um filme de animação stop-motion', 'Enquanto explora sua nova casa à noite, a pequena Coraline descobre uma porta secreta que contém um mundo parecido com o dela, porém melhor em muitas maneiras. Todos têm botões no lugar dos olhos, os pais são carinhosos e os sonhos de Coraline viram realidade por lá. Ela se encanta com essa descoberta, mas logo percebe que segredos estranhos estão em ação: uma outra mãe e o resto de sua família tentam mantê-la eternamente nesse mundo paralelo.', 'Histórias infantis', '../../assets/img/historias/coraline.jpg', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values
('Dumbo','Dick Huemer', 'Dumbo, baseado num livro de Helen Aberson e Harold Pear', 'Dumbo é um bebê elefante de um circo que nasceu com orelhas enormes. Após ser ridicularizado por seu grupo de amigos, ele se transforma na principal atração de seu circo quando descobre que, usando suas orelhas, é capaz de fazer o que nenhum outro elefante consegue: voar','Histórias infantis', '../../assets/img/historias/dumbo.jpg', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values
('Os Três Porquinhos', 'Joseph Jacobs', 'Uma fábula cujos personagens são exclusivamente animais', 'Era Uma Vez três porquinhos que viviam na floresta com a sua mãe. Um dia, como já estavam muito crescidos, decidiram ir viver cada um em sua casa. A mãe concordou. Os porquinhos procuraram um bom lugar para construir as suas casas e, assim que o encontraram, cada um começou a fazer a sua própria casa. O porquinho mais novo, que só pensava em brincar, fez a sua casa muito rapidamente, usando palha. O porquinho do meio, ansioso por ir brincar com o mais novo, juntou uns paus e depressa construiu uma casa de madeira. O porquinho mais velho, que era o mais ajuizado, construiu sua casa com tijolos. Até que um dia, um terrível lobo avistou a casa dos porquinhos e já que estava com muita fome, decidiu os caçar. O lobo, que estava cheio de fome, chegou ao pé da casa do porquinho mais novo, e disse: - Cheira-me a porquinho! Sai daí que eu vou-te comer! Se não saíres, deito a tua casa de palha abaixo… E vendo a casa de palha à sua frente, soprou tão forte, que fez a casinha ir pelo ar! O porquinho assustado correu para a casa do irmão do meio, que tinha uma casa de madeira. Quando o lobo lá chegou, gritou novamente: - Cheira-me a porquinho! E eu estou com tanta fome que vos vou comer aos dois… E com dois sopros, conseguiu deitar a casa de madeira abaixo. Os dois porquinhos mais novos correram então, apavorados, para a casa do irmão mais velho, que era de tijolo. O lobo, vendo que os três porquinhos estavam todos numa só casa, exclamou, louco de alegria: - Cheira-me a porquinho! E mais fome não vou eu ter, pois apanhei três porquinhos para comer! Então o lobo encheu o peito de ar e soprou com toda a força que tinha, mas a casinha de tijolos não se mexeu nem um bocadinho. Aliviados, os três porquinhos saltaram de contentes. Mas o lobo não desistiu, e disse: - Não consegui deitar a casa de tijolos abaixo nem derrubar a sua porta mas eu tenho outra ideia… esperem que já vão ver! E começou a subir o telhado, em direcção à chaminé. Os porquinhos mais novos ficaram aflitos mas o mais velho, que era muito esperto, colocou no fogão, por baixo da chaminé, um grande caldeirão de água a ferver. O lobo, ao entrar pela chaminé, caiu no caldeirão de água quente e queimou o rabo, fugindo o mais rápido que podia para o meio da floresta. Os dois porquinhos agradeceram ao seu irmão mais velho, e aprenderam a lição. Deste lobo mau, nunca mais se ouviu falar…', 'Histórias infantis', '../../assets/img/historias/porquinhos.jpg', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values
('Emília','Monteiro Lobato','Essa história foi escrita por Monteiro Lobato', 'Emília é uma boneca de pano feita por tia Nastácia, os olhos de linha preta. Narizinho gosta muito dela, tanto que não desgruda da boneca. Almoça e janta com ela ao seu lado, e ao se deitar tem o cuidado de acomodá-la em uma rede perto dos pés da cadeira. Emília era muda, mas doutor Caramujo deu a ela uma pílula falante e, ao engolir a pílula Emília desandou a falar, falar, falar muito. A primeira coisa que disse foi: ‘Estou com um horrível gosto de sapo na boca!’ Mas Emília falava tanto, tanto, tanto, "que Narizinho meio atordoada disse ao doutor que era melhor fazê-la vomitar aquela pílula e engolir outra mais fraca', 'Folclore brasileiro', '../../assets/img/historias/emilia.jpg', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values
('Aladdin', 'Antoine Galland' ,'Um jovem humilde descobre uma lâmpada mágica com um gênio que pode conceder desejos. Agora, o rapaz quer conquistar a moça por quem se apaixonou, mas o que ele não sabe é que a jovem é uma princesa que já está comprometida. Com a ajuda do gênio, ele tenta se passar por um príncipe para fisgar o amor da moça e a confiança de seu pai.', 'hist', 'Histórias infantis', '../../assets/img/historias/alladin.jpg', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values
('Alice no país das Maravilhas', 'Lewis Carroll','“A única forma de chegar ao impossível e acreditar que é possível” Todos nós possuímos sonhos que, à primeira vista, parecem que são impossíveis. Isso porque no começo dispomos de pouca experiência e recursos para encarar tal empreitada','conteudo', 'Histórias clássicas', '../../assets/img/historias/alice.jpg', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values
('O Pequeno Príncipe','Antoine de Saint-Exupery','O Pequeno Príncipe é uma obra literária do escritor francês Antoine de Saint-Exupéry, que conta a história da amizade entre um homem frustrado por ninguém compreender os seus desenhos, com um principezinho que habita um asteroide no espaço.', 'conteudo','Histórias infantis', '../../assets/img/historias/principe.jpg', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values
('O Mágico De Oz', 'L. Frank Baum','The Wonderful Wizard of Oz é um romance infantil, de alta fantasia, escrito por L. Frank Baum e ilustrado por W. W. Denslow, originalmente publicado pela George M. Hill Company em Chicago em 17 de maio de 1900. É o primeiro de uma série de catorze livros que relata as aventuras na fantástica Terra de Oz.', 'conteudo','Histórias infantis', '../../assets/img/historias/magico.jpg', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values
('Peter Pan', 'J. M. Barrie','Peter Pan é um personagem criado por J. M. Barrie na novel The Little White Bird, mais tarde foi usada na sua notória peça de teatro intitulada Peter and Wendy, que originou um livro homônimo para crianças publicado em 1911, e de várias adaptações destes para o cinema.', 'Histórias clássicas', 'conteudo','../../assets/img/historias/peter.jpg', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values
('O Patinho Feio', 'Hans Christian Andersen','ma das histórias infantis mais populares de todos os tempos e que todos conhecemos desde pequenos é a história do “Patinho Feio”, que conta as desventuras de um patinho que nasce diferente dos outros, tendo uma penugem escura enquanto os seus irmãos são lindos. O pobre patito cresce complexado e infeliz, sentindo-se diferente dos outros e achando-se feio e rejeitado por toda a gente. Não obstante, quando cresce transforma-se num bonito cisne, o que sempre tinha sido sem saber. Deste modo, transforma-se no mais bonito dos animais do lago, uma coisa que nem sequer sonhava.', 'conteudo','Histórias infantis', '../../assets/img/historias/patinho.jpg', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values
('A Bela e a Fera', 'Gabrielle-Suzanne de Villeneuve','Bela era uma jovem destemida que, em troca da liberdade do pai, oferece a sua companhia a um ser monstruoso que vive num castelo enfeitiçado. O que ela mais tarde vem a perceber é que, debaixo da sua estranha aparência, ele é na realidade um príncipe sob uma maldição. O feitiço apenas poderá ser quebrado se, apesar do seu aspecto ameaçador, ele conseguir conquistar o afecto de um coração puro. Apesar do receio inicial, a rapariga torna-se amiga dos empregados do castelo - também eles sob encantamento -, que a ajudarão a encontrar o caminho para o velho e cansado coração do Monstro.', 'conteudo','Histórias infantis', '../../assets/img/historias/bela.jpg', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values
('Os Três Porquinhos', 'autor','desc', 'conteudo', 'Histórias infantis', '../../assets/img/historias/porquinhos.jpg', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values
('João e Maria', 'Irmãos Grimm','Na história registrada pelos irmãos Jacob e Wilhelm Grimm, João e Maria são duas crianças de uma família muito pobre, que acabam abandonadas pelos pais em uma floresta. Conscientes dos planos da família, os dois jogam migalhas de pão pelo caminho de modo que, mais tarde, pudessem encontrar a trilha de volta para casa.', 'conteudo', 'Histórias infantis', '../../assets/img/historias/joão.jpg', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values
('Branca de Neve', 'Irmãos Grimm','Branca de Neve é um conto de fadas clássico originário da tradição oral alemã, que foi compilado pelos Irmãos Grimm e publicado entre os anos de 1817 e 1822, num livro com várias outras fábulas, intitulado "Kinder-und Hausmärchen"', 'conteudo', 'Histórias infantis', '../../assets/img/historias/branca.jpg', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values
('Chapéuzinho Vermelho', 'Charles Perrault','Capuchinho Vermelho ou Chapeuzinho Vermelho é um conto de fadas clássico, cujas origens podem ser traçadas a fábulas europeias do século X. O nome do conto vem da protagonista, uma menina que usa um capuz vermelho.', 'conteudo', 'Histórias infantis', '../../assets/img/historias/chapeuzinho.jpg', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values
('Pinóquio', 'Carlo Collodi','As Aventuras de Pinóquio é um romance escrito pelo italiano Carlo Collodi em Florença no ano de 1881 e publicado dois anos depois com ilustrações de Enrico Mazzanti. Trata-se de um clássico da literatura infanto-juvenil.', 'conteudo', 'Histórias infantis', '../../assets/img/historias/pinoquio.jfif', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values
('Cinderela', 'Irmãos Grimm','Cinderela é um dos contos de fadas mais populares da Humanidade. Sua origem tem diferentes versões. A versão mais conhecida é a do escritor francês Charles Perrault, de 1697, baseada num conto italiano popular chamado La gatta cenerentola. A mais antiga é originária da China, por volta de 860.', 'conteudo','Histórias infantis', '../../assets/img/historias/cinderela.png', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values
('Saci-Pererê','Monteiro Lobato','Muito brincalhão e travesso, o Saci surge como um redemoinho e gosta de assustar pessoas. Embora o Saci-pererê seja o mais conhecido, existem três tipos de saci: O Pererê, o Trique e o Saçurá.', 'conteudo', 'Folclore brasileiro',  '../../assets/img/historias/saci.jpeg', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values
('Curupira','José de Anchieta','O curupira é o personagem de uma lenda do folclore brasileiro conhecido por ter pequena estatura e perseguir aqueles que entram na floresta para destruí-la.', 'Histórias clássicas', 'conteudo', '../../assets/img/historias/curupira.jpg', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values
('Cuca','Monteiro Lobato','De origem portuguesa, a lenda da Cuca está associada muitas vezes com o “bicho papão”. Ela é uma personagem muito temida pelas crianças, representada por velha feia e malvada com cara de jacaré que raramente dorme.', 'conteudo', 'Histórias clássicas', '../../assets/img/historias/cuca.jpg', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values
('Mula sem Cabeça','Ilan Brenman','Mula sem cabeça é um personagem do folclore brasileiro. Na maioria dos contos, é um fantasma de uma mulher que foi amaldiçoada por ter se entregado com um padre e foi condenada a se transformar em uma mula sem cabeça que tem fogo ao invés de uma cabeça, galopando através dos campos desde o por do sol de quinta-feira até o nascer do sol de sexta-feira. O mito tem várias variações em relação ao pecado que transformou a mulher amaldiçoada em um monstro.', 'conteudo', 'Folclore brasileiro', '../../assets/img/historias/mula.jpg', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values
('Boitatá','José de Anchieta','O Boitatá é um personagem folclórico do Brasil que defende as matas. A serpente de fogo é um mito etiológico relacionado à ordem dos tesouros escusos, a defesa das florestas contra queimadas ou a encarnação de alma penada.', 'conteudo', 'Folclore brasileiro', '../../assets/img/historias/boitata.jpg', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values
('Boto-cor-de-rosa','Luís da Câmara Cascudo','Boto-cor-de-rosa é uma lenda do folclore que fala de botos que se transformavam em homens sedutores de mulheres, engravidando-as e desaparecendo depois.', 'conteudo', 'Folclore brasileiro', '../../assets/img/historias/boto.jpg', 2);

insert into historia(nomehistoria, autor, descricao, conteudo, tipo, imagem, conquista_id) values
('Emília','Monteiro Lobato','Emília é uma boneca de pano feita por tia Nastácia, os olhos de linha preta. Narizinho gosta muito dela, tanto que não desgruda da boneca. Almoça e janta com ela ao seu lado, e ao se deitar tem o cuidado de acomodá-la em uma rede perto dos pés da cadeira. Emília era muda, mas doutor Caramujo deu a ela uma pílula falante e, ao engolir a pílula Emília desandou a falar, falar, falar muito. A primeira coisa que disse foi: ‘Estou com um horrível gosto de sapo na boca!’ Mas Emília falava tanto, tanto, tanto, "que Narizinho meio atordoada disse ao doutor que era melhor fazê-la vomitar aquela pílula e engolir outra mais fraca', 'conteudo', 'Folclore brasileiro', '../../assets/img/historias/emilia.jpg', 2);
