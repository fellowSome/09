DML语句
DML是对表中的数据进行操作，伴随着事务控制（TCL)

insert into emp(id,name,gender,salary,deptno,birth) values(3,'lyn','女',8100,10,to_date('2008-08-8','YYYY-MM-DD'));
--序列
insert into emp(id,name,salary,deptno,birth) values(LOGMNR_SEQ$.,'lyn',8100,10,to_date('2008-08-8','YYYY-MM-DD'));
--把一个表的一列，复制到另一个表中 ( 自然可以扩展到整张表数据的复制啦 ）
insert into emp_1(ename) select ename from emp;

update emp set job='manager' where id=3;
delete from emp where id=3;
delete from emp_1 where rownum < 14 --删除前13条记录

savepoint a;
COMMIT;

SELECT *  FROM EMP;

insert into  emp values (7369,'simth','clerk',7902,to_date('1980-12-17','yyyy-mm-dd'),800,0,20); 