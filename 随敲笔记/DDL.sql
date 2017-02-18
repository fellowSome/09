建表
create table emp (empno number(4,0),
                  empname varchar2(10),
                  job varchar2(9),
                  mgr number(4,0),
                  hiredate date,
                  sal number(8,2),
                  comm number(7,2),
                  deptno number(2,0));
create table dept(deptno number(2,0),
                  dname varchar2(14 byte),
                  loc varchar2(13 byte));   
       

查看表结构
desc emp;

删除表
drop table emp;

数据库中所有数据的默认类型都是null；
创建表时，可以使用default为某个字段单独指定默认值，
数据库中的字符串字面量是使用单引号的，当然区分大小写

default 与 not null 二选一，不能并用

修改表名
rename empploee to emp;

修改表结构
1.添加新字段  
alter table empploee add (hiredate date default sysdate, firedate date);
alter table emp add sequence LOGMNR_SEQ$;
2.修改现有字段(可修改字段类型,长度,默认值,是否为空,约束条件）
alter table emp modify (id number(4) unique）;
3.删除现有字段
alter table emp drop (firedate);   --哪怕是一个字段，括号不能少！

保留表结构，删除表数据
truncate table emp;

