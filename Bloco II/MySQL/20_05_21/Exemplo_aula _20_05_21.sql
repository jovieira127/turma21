-- criar um banco de dados 
create database db_quitanda;
-- acessar um banco de dados 
use db_quitanda;

create table tb_produtos(
id bigint auto_increment,
nome varchar(255) not null,
preco float not null,
primary key (id)
);
-- busca de dados 
select * from tb_produtos;
insert into tb_produtos(nome, preco)values("Morango", 5);
-- atualizar dado da tabela 
update tb_produtos set preco = 7 where id = 4;
-- queima a chave
delete from tb_produtos where id = 4;

insert into tb_produtos(nome, preco)values("Laranja", 6);
-- alterar, de alguma forma, a tabela
alter table tb_produtos
add descricao varchar(255);

alter table tb_produtos change descricao descricao_produto varchar(255);