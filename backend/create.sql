create table tb_person (id_person int8 generated by default as identity, cpf int8, name varchar(255), primary key (id_person));
create table tb_request (id_request int8 generated by default as identity, description varchar(255), id_user int8, status varchar(255), primary key (id_request));
create table tb_user (id_user int8 generated by default as identity, admin boolean, id_person int8, login varchar(255), password varchar(255), primary key (id_user));
insert into tb_person(cpf,name) values (54705226011, 'Debora Velasques Oleiro');
insert into tb_person(cpf,name) values (29613299068, 'Jónatas Espargosa Vilalobos');
insert into tb_person(cpf,name) values (29595417076, 'Suria Baião Macedo');
insert into tb_person(cpf,name) values (33793439003, 'Samara Morão Boto');
insert into tb_user(id_person, login, password, admin) values (1, 'Debora', '1234', false);
insert into tb_user(id_person, login, password, admin) values (2, 'Jonatas', '1234', false);
insert into tb_user(id_person, login, password, admin) values (3, 'Suria', '1234', false);
insert into tb_user(id_person, login, password, admin) values (4, 'Samara', '1234', true);
insert into tb_request(id_user, description, status) values (1, 'Descrição da requisição 1.', 'ABERTO');
insert into tb_request(id_user, description, status) values (2, 'Descrição da requisição 2.', 'CONCLUIDA');
insert into tb_request(id_user, description, status) values (3, 'Descrição da requisição 3.', 'CANCELADA');
insert into tb_user_request(user_id, request_id_request) values (1, 1);
insert into tb_user_request(user_id, request_id_request) values (1, 2);
insert into tb_user_request(user_id, request_id_request) values (2, 3);