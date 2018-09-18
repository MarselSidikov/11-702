create table taxi_user (
  --   id - первичный ключ, генерируется базой данных автоинтерементом
  id            serial primary key,
  first_name    VARCHAR(50),
  last_name     VARCHAR(50),
  hash_password VARCHAR(200),
  phone         VARCHAR(20),
  email         VARCHAR(100),
  photo         VARCHAR(1000)
);

insert into taxi_user (first_name,
                       last_name,
                       hash_password,
                       phone,
                       email,
                       photo)
values ('Марсель',
        'Сидиков',
        '$2a$10$UZsf7FXtumtD3fMPEfdsCuqtGaCeEpGeJJtH0sOMufWCXhDrE5Yna',
        '79372824941',
        'sidikov.marsel@gmail.com',
        'https://pp.userapi.com/c834302/v834302189/c9df0/GbrLxPuW8Bc.jpg');

insert into  taxi_user(first_name, last_name)
values ('Гузель', 'Мусина');
insert into  taxi_user(first_name, last_name)
values ('Никита', 'Карамов');
insert into  taxi_user(first_name, last_name)
values ('Даша', 'Ковтун');
insert into  taxi_user(first_name, last_name)
values ('Ирина', 'Нестерова');
insert into  taxi_user(first_name, last_name)
values ('Вадим', 'Беспалов');
insert into  taxi_user(first_name, last_name)
values ('Даниил', 'Карпов');
insert into  taxi_user(first_name, last_name)
values ('Аня', 'Тугбаева');
insert into  taxi_user(first_name, last_name)
values ('Алмаз', 'Хамеджанов');
insert into  taxi_user(first_name, last_name)
values ('Аяз', 'Хуснутдинов');
insert into  taxi_user(first_name, last_name)
values ('Булат', 'Каюмов');
insert into  taxi_user(first_name, last_name)
values ('Диляра', 'Мухамедшина');

ALTER TABLE taxi_user ADD COLUMN role VARCHAR(50);

update taxi_user set role = 'driver' where id = 5;
update taxi_user set role = 'driver' where id = 6;
update taxi_user set role = 'driver' where id = 7;
update taxi_user set role = 'user' where id between 1 and 4;
update taxi_user set role = 'admin' where role ISNULL;

select * from taxi_user where role = 'admin';



