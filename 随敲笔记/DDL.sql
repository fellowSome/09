����
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
       

�鿴��ṹ
desc emp;

ɾ����
drop table emp;

���ݿ����������ݵ�Ĭ�����Ͷ���null��
������ʱ������ʹ��defaultΪĳ���ֶε���ָ��Ĭ��ֵ��
���ݿ��е��ַ�����������ʹ�õ����ŵģ���Ȼ���ִ�Сд

default �� not null ��ѡһ�����ܲ���

�޸ı���
rename empploee to emp;

�޸ı�ṹ
1.������ֶ�  
alter table empploee add (hiredate date default sysdate, firedate date);
alter table emp add sequence LOGMNR_SEQ$;
2.�޸������ֶ�(���޸��ֶ�����,����,Ĭ��ֵ,�Ƿ�Ϊ��,Լ��������
alter table emp modify (id number(4) unique��;
3.ɾ�������ֶ�
alter table emp drop (firedate);   --������һ���ֶΣ����Ų����٣�

������ṹ��ɾ��������
truncate table emp;

