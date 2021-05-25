-- criando banco de dados
create database db_construindo_a_nossa_vida;
-- ativando
use db_construindo_a_nossa_vida;
-- criando tabela tb_categoria
create table tb_categoria(
id bigint auto_increment,
departamento varchar (100) not null,
tipo_saida varchar (100) not null,
tipo_pagamento varchar (100) not null,
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
    unidade varchar (10),
    tb_categoria BIGINT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (tb_categoria) REFERENCES tb_categoria (id)
);
-- confirmando tabela
select * from tb_produto;
-- populando categoria
insert into tb_categoria(departamento, tipo_saida, tipo_pagamento) values ("Hidráulica", "Entrega", "Cartão de débito");
insert into tb_categoria(departamento, tipo_saida, tipo_pagamento) values ("Pintura", "Retirada", "Cartão de crédito");
insert into tb_categoria(departamento, tipo_saida, tipo_pagamento) values ("Ferramentas", "Retirada", "Dinheiro");
-- populando produto
insert into tb_produto(codigo, descricao, preco, quantidade, unidade, tb_categoria) values (10000, "Tinta 18l", 110.99, 2, "unidade", 2);
insert into tb_produto(codigo, descricao, preco, quantidade, unidade, tb_categoria) values (10002, "Furadeira", 120, 1, "unidade", 3);
insert into tb_produto(codigo, descricao, preco, quantidade, unidade, tb_categoria) values (10004, "Cano 18 polegadas", 25, 5, "metros", 1);
insert into tb_produto(codigo, descricao, preco, quantidade, unidade, tb_categoria) values (10006, "Cola pvc", 5, 3, "unidade", 1);
-- Valor maior do que 50 reais
select * from tb_produto where preco > 50;
-- valor entre 3 e 6 reais
select * from tb_produto where preco > 3 and preco < 6;
-- produtos com a letra c
select * from tb_produto where descricao like ("%c%");
-- inner join
select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.tb_categoria;
select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.tb_categoria where tb_categoria.departamento = "Hidráulica";
