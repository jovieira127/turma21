-- criando base
create database e_commerce;
-- "ativando"
use e_commerce;
-- criando tabela
create table tabela_produtos(
codigo varchar (5) not null,
produto varchar (50) not null,
setor varchar (50),
preco double  not null,
quantidade bigint,
primary key (codigo)
);
-- confirmando a criação da tabela
select * from tabela_produtos;
-- inserindo dados 
insert into tabela_produtos (codigo, produto, setor, preco, quantidade) value ("AB123", "Sabão em pó", "Limpeza", 8, 16);
insert into tabela_produtos (codigo, produto, setor, preco, quantidade) value ("CD234", "Farinha de trigo", "Grãos e farinhas", 2.99, 19);
insert into tabela_produtos (codigo, produto, setor, preco, quantidade) value ("EF423", "Suco de Uva", "Bebidas", 7.99, 45);
insert into tabela_produtos (codigo, produto, setor, preco, quantidade) value ("GH345", "Hambúrguer vegetal", "Congelados", 10.99, 10);
insert into tabela_produtos (codigo, produto, setor, preco, quantidade) value ("HI678", "Banana nanica", "Horti-fruti", 4.99, 20);
-- preco maior do que 500
select * from tabela_produtos where preco > 500;
-- preco menor do que 500
select * from tabela_produtos where preco < 500;
-- atualizando dado 
update tabela_produtos set produto = "Suco de Uva 1 l" where codigo = "EF423";




