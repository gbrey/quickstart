-- You can use this file to load seed data into the database using SQL statements
insert into Project (id, description) values (0, 'Aerogear')
insert into Project (id, description) values (1, 'Infinispan')
insert into Project (id, description) values (2, 'Richfaces')
insert into Project (id, description) values (4, 'Kitte')


insert into Task (id, title, description, project_id) values (0, 'Create content for Getting Started with AeroGear', 'Desc Getting Started with AeroGear', 0)
insert into Task (id, title, description, project_id) values (1, 'Create quickstart for POH5', 'Desc Create quickstart for POH5', 0)
insert into Task (id, title, description, project_id) values (2, 'Create quickstart for Appcelerator', 'Desc Create quickstart for Appcelerator', 0)

insert into Task (id, title, description, project_id) values (3, 'Create quickstart for Ruby Client', 'Desc Create for Ruby Client', 1)
insert into Task (id, title, description, project_id) values (4, 'Create quickstart for Ceylon Client', 'Desc Create for Python Client', 1)