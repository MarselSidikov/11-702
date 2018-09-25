create table taxi_user (
  id            bigserial primary key,
  first_name    VARCHAR(50),
  last_name     VARCHAR(50),
  hash_password VARCHAR(200),
  phone         VARCHAR(20),
  email         VARCHAR(100),
  photo         VARCHAR(1000),
  role          VARCHAR(100),
  admin_id      bigint
);

alter table taxi_user add foreign key (admin_id)
references taxi_user(id);

create table authority (
  id        bigserial primary key,
  authority varchar(100)
);

insert into authority (authority)
values ('READ_USERS');
insert into authority (authority)
values ('ADD_USER');
insert into authority (authority)
values ('BLOCK_USER');
insert into authority (authority)
values ('ORDER_TAXI');

create table user_authority (
  user_id      bigint,
  authority_id bigint
);

alter table user_authority
  add foreign key (user_id) references taxi_user (id);
alter table user_authority
  add foreign key (authority_id) references authority (id);

create table manager_client (
  client_id bigint,
  manager_id bigint
);

alter table manager_client
  add foreign key (client_id) references taxi_user(id);

alter table manager_client
  add foreign key (manager_id) references taxi_user(id);
