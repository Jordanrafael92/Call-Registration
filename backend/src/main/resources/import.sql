insert into tb_person(cpf,name) values (54705226011, 'Debora Velasques Oleiro');
insert into tb_person(cpf,name) values (29613299068, 'Jónatas Espargosa Vilalobos');
insert into tb_person(cpf,name) values (29595417076, 'Suria Baião Macedo');
insert into tb_person(cpf,name) values (33793439003, 'Samara Morão Boto');
insert into tb_user(id_person, login, password, admin) values (1, 'Debora', '1234', false);
insert into tb_user(id_person, login, password, admin) values (2, 'Jonatas', '1234', false);
insert into tb_user(id_person, login, password, admin) values (3, 'Suria', '1234', false);
insert into tb_user(id_person, login, password, admin) values (4, 'Samara', '1234', true);