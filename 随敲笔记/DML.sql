DML���
DML�ǶԱ��е����ݽ��в�����������������ƣ�TCL)

insert into emp(id,name,gender,salary,deptno,birth) values(3,'lyn','Ů',8100,10,to_date('2008-08-8','YYYY-MM-DD'));
--����
insert into emp(id,name,salary,deptno,birth) values(LOGMNR_SEQ$.,'lyn',8100,10,to_date('2008-08-8','YYYY-MM-DD'));
--��һ�����һ�У����Ƶ���һ������ ( ��Ȼ������չ�����ű����ݵĸ����� ��
insert into emp_1(ename) select ename from emp;

update emp set job='manager' where id=3;
delete from emp where id=3;
delete from emp_1 where rownum < 14 --ɾ��ǰ13����¼

savepoint a;
COMMIT;

SELECT *  FROM EMP;

insert into  emp values (7369,'simth','clerk',7902,to_date('1980-12-17','yyyy-mm-dd'),800,0,20); 