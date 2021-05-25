-- criando banco de dados
create database db_pizzaria_legal;
-- ativando
use db_pizzaria_legal;
-- criando tabela tb_categoria
create table tb_categoria(
id bigint auto_increment,
tipo_pizza varchar (100) not null,
tipo_entrega varchar (100)not null,
troco boolean not null,
primary key (id)
);
-- confirmando tabela
select * from tb_categoria;
-- criando tabela tb_pizza
CREATE TABLE tb_pizza (
    id BIGINT AUTO_INCREMENT,
    sabor VARCHAR(100),
    preco DOUBLE,
    tamanho VARCHAR(50),
    borda CHAR,
    bebida CHAR,
    tb_categoria BIGINT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (tb_categoria) REFERENCES tb_categoria (id)
);
-- confirmando tabela
select * from tb_pizza;
-- populando categoria
insert into tb_categoria(tipo_pizza, tipo_entrega, troco) values ("Doce", "Aplicativo", true);
insert into tb_categoria(tipo_pizza, tipo_entrega, troco) values ("Salgada", "Aplicativo", false);
insert into tb_categoria(tipo_pizza, tipo_entrega, troco) values ("Vegana", "Loja", true);
-- populando pizza
insert into tb_pizza(sabor, preco, tamanho, borda, bebida, tb_categoria) values ("Prestígio", 32.89, "Grande", 'N', 'S', 1);
insert into tb_pizza(sabor, preco, tamanho, borda, bebida, tb_categoria) values ("Calabresa vegetal acebolada", 40.50, "Grande", 'N', 'S', 3);
insert into tb_pizza(sabor, preco, tamanho, borda, bebida, tb_categoria) values ("4 queijos", 22.5, "Broto", 'S', 'S', 2);
insert into tb_pizza(sabor, preco, tamanho, borda, bebida, tb_categoria) values ("Brócolis com tofupiry", 35.50, "Grande", 'N', 'N', 2);
-- Valor maior do que 45 reais
select * from tb_pizza where preco > 45;
-- valor entre 29 e 60 reais
select * from tb_pizza where preco > 29 and preco < 60;
-- produtos com a letra c
select * from tb_pizza where sabor like ("%c%");
-- inner join
select * from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.tb_categoria;
select * from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.tb_categoria where tb_categoria.tipo_pizza = "Vegana";
