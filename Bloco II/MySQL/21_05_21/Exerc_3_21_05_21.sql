-- criando banco de dados
create database db_farmacia_do_bem;
-- ativando
use db_farmacia_do_bem;
-- criando tabela tb_categoria
create table tb_categoria(
id bigint auto_increment,
departamento varchar (100) not null,
tipo_saida varchar (100) not null,
situacao boolean not null,
primary key (id)
);
-- confirmando tabela
select * from tb_categoria;
-- criando tabela tb_pizza
CREATE TABLE tb_produto (
    id BIGINT AUTO_INCREMENT,
    codigo bigint not null,
    descricao VARCHAR(100)not null,
    preco DOUBLE,
    quantidade double,
    receita boolean,
    tb_categoria BIGINT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (tb_categoria) REFERENCES tb_categoria (id)
);
-- confirmando tabela
select * from tb_produto;
-- populando categoria
insert into tb_categoria(departamento, tipo_saida, situacao) values ("Cosmético", "Entrega", true);
insert into tb_categoria(departamento, tipo_saida, situacao) values ("Medicamento", "Retirada", true);
insert into tb_categoria(departamento, tipo_saida, situacao) values ("Suplemento", "Entrega", true);
-- populando produto
insert into tb_produto(codigo, descricao, preco, quantidade, receita, tb_categoria) values (101012, "Captopril 25mg", 32.90, 1, true, 2);
insert into tb_produto(codigo, descricao, preco, quantidade, receita, tb_categoria) values (215532, "Whey protein", 120.99, 1, false, 3);
insert into tb_produto(codigo, descricao, preco, quantidade, receita, tb_categoria) values (998641, "Batom preto", 20.90, 3, false, 1);
insert into tb_produto(codigo, descricao, preco, quantidade, receita, tb_categoria) values (556020, "Xarope Tossin", 33.40, 1, false, 2);
-- Valor maior do que 50 reais
select * from tb_produto where preco > 50;
-- valor entre 3 e 60 reais
select * from tb_produto where preco > 3 and preco < 60;
-- produtos com a letra c
select * from tb_produto where descricao like ("%b%");
-- inner join
select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.tb_categoria;
select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.tb_categoria where tb_categoria.departamento = "Medicamento";
