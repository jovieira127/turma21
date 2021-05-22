-- criando base
create database servico_rh;
-- "ativando"
use servico_rh;
-- criando tabela
create table funcionaries(
matricula bigint (10) auto_increment,
salario double not null,
nome varchar (150) not null,
setor varchar (150) not null,
nascimento date,
primary key (matricula)
);
-- confirmando a criação da tabela
select * from funcionaries;
-- inserindo dados 
insert into funcionaries(matricula, salario, nome, setor, nascimento) values (1, 2100.10, "Pedro A B", "Administração", '1994/03/21');
insert into funcionaries(matricula, salario, nome, setor, nascimento) values (2, 5000.00, "Maria B C", "Produção", '1982/04/11');
insert into funcionaries(matricula, salario, nome, setor, nascimento) values (4, 1700.00, "Jorge C D", "Recursos Humanos", '1999/09/04');
insert into funcionaries(matricula, salario, nome, setor, nascimento) values (5, 1100.00, "Kaio E F", "Limpeza e Manutenção", '1997/06/09');
insert into funcionaries(matricula, salario, nome, setor, nascimento) values (6, 4300.00, "Patricia G L", "Financeiro", '1990/07/30');
-- salário maior do que 2000
select * from funcionaries where salario > 2000;
-- salário menor do que 2000
select * from funcionaries where salario < 2000;
-- atualizando dado 
update funcionaries set salario = 1300.00 where matricula = 5;





