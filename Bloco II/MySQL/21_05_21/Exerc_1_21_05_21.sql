-- criando db
create database db_generation_game_online;
-- ativando bd game...
use db_generation_game_online;
-- criando tabela tb_classe
create table tb_classe(
id bigint auto_increment,
combate varchar (50) not null,
vestimenta varchar (50) not null,
resistencia varchar (50) not null,
primary key (id)
);
-- confirmando a criação da tabela tb_classe
select * from tb_classe;
-- criando a tabela tb_personagem
create table tb_personagem(
id bigint auto_increment,
nome varchar(50) not null,
experiencia double not null,
tribo varchar (50) not null,
ataque bigint not null,
defesa bigint not null,
classe_id bigint default null,
primary key (id),
foreign key (classe_id) references tb_classe (id)
);
-- confirmando a criação da tabela tb_personagem
select * from tb_personagem;
-- População tabela classe
insert into tb_classe(combate, vestimenta, resistencia) values ("Arqueiro", "armaduras médias", "Baixa resistência");
insert into tb_classe(combate, vestimenta, resistencia) values ("Mago", "armaduras leves", "Baixa resistência");
insert into tb_classe(combate, vestimenta, resistencia) values ("Paladino", "armaduras pesadas", "Alta resistência");
-- População tabela personagem
insert into tb_personagem(nome, experiencia, tribo, ataque, defesa, classe_id) values ("Akin", 130, "Quinula", 3000, 6000, 3);
insert into tb_personagem(nome, experiencia, tribo, ataque, defesa, classe_id) values ("Malaika", 107, "Kalaia", 2100, 7200, 2);
insert into tb_personagem(nome, experiencia, tribo, ataque, defesa, classe_id) values ("Kito", 99, "Tuiutu", 1800, 5900, 1);
insert into tb_personagem(nome, experiencia, tribo, ataque, defesa, classe_id) values ("Gimbya", 201, "Waka", 2900, 6800, 2);
insert into tb_personagem(nome, experiencia, tribo, ataque, defesa, classe_id) values ("Yoocu", 183, "Quinula", 2500, 7100, 1);
-- poderes no range
select * from tb_personagem where ataque > 2000;
select * from tb_personagem where defesa > 1000 and defesa < 2000;
-- nome com letra c
select * from tb_personagem where nome like ("%c%");
-- inner join
select * from tb_personagem inner join tb_classe on tb_personagem.classe_id = tb_classe.id;
select * from tb_personagem inner join tb_classe on tb_personagem.classe_id = tb_classe.id where tb_classe.combate = "Mago";
