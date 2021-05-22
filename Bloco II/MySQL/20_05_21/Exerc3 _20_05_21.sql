-- criando base
create database turma_x;
-- "ativando"
use turma_x;
-- criando tabela
create table alunes(
matricula bigint (10) not null,
nome varchar (150) not null,
identificacao char not null,
materia varchar (50) not null,
nota float not null,
primary key (matricula)
);
-- confirmando a criação da tabela
select * from alunes;
-- inserindo dados 
insert into alunes(matricula, nome, identificacao, materia, nota) values (1234, "Amanda A A", 'F', "Matemática", 7.3);
insert into alunes(matricula, nome, identificacao, materia, nota) values (5678, "Bruno B B", 'O', "História", 9.5);
insert into alunes(matricula, nome, identificacao, materia, nota) values (9012, "Carla C C", 'F', "Geografia", 3.1);
insert into alunes(matricula, nome, identificacao, materia, nota) values (3456, "Diego D D", 'M', "Português", 5.0);
-- nota maior do que 7
select * from alunes where nota > 7;
-- nota menor do que 7
select * from alunes where nota < 7;
-- atualizando dado 
update alunes set materia = "história" where matricula = 9012;





