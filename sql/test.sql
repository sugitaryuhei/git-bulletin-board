-- create table users_gitsample(
-- id serial NOT NULL,
-- name text NOT NULL,
-- mail_address text NOT NULL,
-- password text NOT NULL
-- );
-- insert into users_gitsample(name,mail_address,password)values('admin','admin','admin');

select mail_address,name,password from users_gitsample where mail_address='admin';
