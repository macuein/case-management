
insert into organizations values(101,'org001','Organization 001');
insert into organizations values(102,'org002','Organization 002');

insert into users values(1001,101,'usr01','Usuario 1');
insert into users values(1002,101,'usr02','Usuario 2');
insert into users values(1003,102,'usr03','Usuario 3');
insert into users values(1004,102,'usr04','Usuario 4');

insert into cases values(100001,101,'CASE001','CASE 001 DESC','EXTREF001','http://detail.url','http://callback.url');
insert into cases values(100002,101,'CASE002','CASE 002 DESC','EXTREF002','http://detail.url','http://callback.url');
insert into cases values(100003,102,'CASE003','CASE 003 DESC','EXTREF003','http://detail.url','http://callback.url');
insert into cases values(100004,102,'CASE004','CASE 004 DESC','EXTREF004','http://detail.url','http://callback.url');


--insert into queues values(10001,1001,'queue001','QUEUE 001 ORG 001');
--insert into queues values(10002,1002,'queue002','QUEUE 002 ORG 002');


--insert into tasks values(1000001,100001,10001,1001,'TASK001','TASK001 CASE001 DESC','NOTES 001','Attachments 001');
--insert into tasks values(1000002,100002,10001,null,'TASK002','TASK002 CASE002 DESC','NOTES 002','Attachments 002');
--insert into tasks values(1000003,100003,10001,1002,'TASK003','TASK003 CASE003 DESC','NOTES 003','Attachments 003');
--insert into tasks values(1000004,100004,10001,null,'TASK004','TASK004 CASE004 DESC','NOTES 004','Attachments 004');
