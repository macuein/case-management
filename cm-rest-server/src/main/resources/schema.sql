create table organizations
(
     org_id integer not null,
     org_code varchar(255) not null,
     org_description varchar(255) not null,
     primary key(org_id)
);

create table users
(
     user_id integer not null,
     org_id int not null,
     user_code varchar(255) not null,
     user_name varchar(255) not null,
     primary key (user_id)
);

create table queues
(
   queue_id integer not null,
   org_id integer not null,
   queue_code varchar(255) not null,
   queue_description varchar(255) not null,
   primary key(queue_id)
);

create table cases
(
   case_id integer not null,
   queue_id integer not null,
   org_id integer not null,
   case_code varchar(255) not null,
   case_description varchar(255) not null,
   case_reference varchar(255) not null,
   case_detail_url varchar(255) not null,
   case_callback_url varchar(255) not null,
   primary key(case_id)
);

create table tasks
(
   task_id integer not null,
   case_id integer not null,
   user_id integer,
   task_code varchar(255) not null,
   task_description varchar(255) not null,
   task_notes varchar(255) not null,
   task_attachments varchar(255),
   primary key(task_id)
);


