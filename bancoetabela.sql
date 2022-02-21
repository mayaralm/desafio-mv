create database testmv;

use testmv;

create table clientes(
id bigint primary key auto_increment not null,
nome varchar (255),
endereco varchar (255),
email varchar (255),
telefone varchar (255),
conta int,
cpf varchar (255),
cnpj varchar(255)
);



create table conta(
id bigint primary key auto_increment not null,
numero varchar(255),
cpf varchar (255),
cnpj varchar (255),
saldo double,
tipo varchar (255)
);

create table endereco(
id bigint primary key auto_increment not null,
rua varchar (255),
numero varchar (255),
complemento varchar (255),
cep varchar (255),
bairro varchar(255),
cidade varchar (255),
estado varchar(255)
);




