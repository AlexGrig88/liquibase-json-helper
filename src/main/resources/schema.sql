create table if not exists users
(
    id bigserial primary key ,
    username varchar(128) unique not null ,
    password varchar(64) not null
);
