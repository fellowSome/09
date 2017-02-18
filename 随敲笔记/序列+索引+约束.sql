一、序列
  序列也是数据库对象之一，作用是生成一系列数字；序列常用与为某张表的主键字段提供值使用。
  1.创建序列
    create sequence seq_emp_id 
    [start with 1]
    [increment by 1]
    [maxvalue m]
    [minvalue n]
    [cycle/no cycle]
    [cache/no cache]
    序列有两个伪列：
    nextval：获取序列的下一个值,导致序列发生一次步进，且不能回退。第一个值从start with 的值开始
    currval:获取序列的当前值
    select seq_emp_id.nextval from dual;
    insert into emp (empno,ename,sal,job,deptno) values(seq_emp_id.nextval,'JACK',7000,'CLERK',10);
    
  2.删除序列
    drop sequence seq_emp_id;
    
   
二、索引
   索引是数据库对象之一，索引是为了提高查询效率。
   索引的统计与应用是数据库自动完成的，只要数据库认为可以使用蘑菇以创建的索引时就会自动应用。
   create index idx_emp_ename on emp(ename);
   create index idx_emp_job_sal on emp(job,sal);
   create index idx_emp_upper on emp(upper(ename));
   
   alter index idx_emp_upper rebuild;
   
   drop index idx_emp_upper;
   
   
三、约束
   1. not null （NN)
     创建非空约束：
     create table employees(eid number(6),
                            name varchar2(30) not null,
                            salary number(7,2),
                            hiredate Date constraint employees_hiredate_nn not null;
     取消非空约束：                       
     alter table employees modify (eid number(6) null);                       
   
   2. unique   （UK)
     创建唯一约束：保证表中该字段的值任何一条记录都不重复，null除外
     (1) create table employees1(eid number(6) unique,
                             name varchar2(30),
                             email varchar2(50),
                             salary number(7,2),
                             hiredate Date,           -- 这里有个“，”
                             constraint empolyees1_email_uk unique(email));
     (2)在创建表后加唯一约束
         alter table empolyees1 
                    add constraint empolyees1_eid_uk unique(eid);
                             
   3. primery key （PK)  
      主键约束 == 非空 + 唯一
      create table employees2（eid number(6) primary key,
                               name varchar2(30),
                               email varchar2(50),
                               salary number(7,2),
                               hiredate Date);
                               
   4. foreign key  (FK)
      alter table employees3
             add constraint employees3_empno
             foreign key  employees3(deptno) reference dept(deptno);
      
      
   5. check key   (CK)
      alter table empolyees4
            add constraint employees4_sal 
            check(sal>5000)
