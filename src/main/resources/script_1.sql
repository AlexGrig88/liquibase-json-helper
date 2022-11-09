insert into users (username, password)
values
('Alex', '123456'),
('Olga', 'qwerty');

update users
set username = 'Ivan'
where id = 2;

alter table users
    add column dog jsonb;

insert into users (username, password, dog)
values
('Djon', '555', '{"nickname" : "Django", "breed" : "mops"}');


update users
set dog = dog || '{"age" : 5}'::jsonb
where id = 4;