create table organizations
(
     org_id bigint not null,
     org_code varchar(255) not null,
     org_description varchar(255) not null,
     primary key(org_id)
);

create table users
(
     user_id bigint not null,
     org_id bigint not null,
     user_code varchar(255) not null,
     user_name varchar(255) not null,
     primary key (user_id)
);

create table cases
(
   case_id bigint not null,
   org_id bigint not null,
   case_code varchar(255) not null,
   case_description varchar(255) not null,
   case_reference varchar(255) not null,
   case_detail_url varchar(255) not null,
   case_callback_url varchar(255) not null,
   primary key(case_id)
);


--create table queues
--(
--  id bigint not null,
--   org_id bigint not null,
--   code varchar(255) not null,
--   description varchar(255) not null,
--   primary key(id)
--);



--create table tasks
--(
--   id bigint not null,
--   case_id bigint not null,
--  queue_id bigint not null,
--   user_id bigint,
--   code varchar(255) not null,
--   description varchar(255) not null,
--   notes varchar(255) not null,
--   attachments varchar(255),
--   primary key(id)
--);


