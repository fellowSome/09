1.select ���
���ڲ�ѯ���е����ݣ�
select�־������Ը�Ҫ��ѯ���ֶΣ����԰������о�����ֶΣ���������ʽ��
from�־�����ָ��������Դ�ı�
where�־�������ӹ�������
select ename ,sal*12 from emp where empno=7369;


2.�ַ�������֮ concat���� or ||
concat�����������������ַ���
select concat(concat(ename,','),job) from emp;
    ����
select ��ename||','||job) from emp;    


3.�ַ�������֮ length����
length()�鿴�ַ����ĳ���
select ename ,length(ename) from emp;


4.�ַ�������֮ upper()�� lower()�� initcap()
upper()���ַ���ȫת���ɴ�д
lower()���ַ���ȫת����Сд
initcap()���ַ�������ĸ��д�����ÿո����������ʣ�ÿ�����ʶ����д
update emp set ename='BLACK APK' where ename='BLACK';
select initcap(ename) from emp;


5.α�� ��dual
����ѯ���ݲ����κα��������ʱ������ʹ��α��α��ֻ����һ����¼
select upper('helloworld'),lower('HELLOWORLD'),INITCAP('HELLO WORLD ! i love u') from dual;


6.�ַ�������֮ trim() ��ltrim������rtrim()
ȥ���ַ������ߵ�ָ���ظ��ַ�
select trim('e' from 'eepee liteewee') from dual;   --ֻ��ָ�������ַ�
select ltrim('esrrseserlit','rse') from dual;      --��ָ������ַ������ҿ�������


7.�ַ�������֮ lpad������rpad����
select lpad(sal,5,'$') from emp;
select rpad(sal,5,' ') from emp;


8.�ַ�������֮ substr��char,m,n))
���ַ���char�� m ��ʼ��������ȡ n ���ַ����±��Ǵ� 1 ��ʼ ,
��û�� n ���� n �����ַ������ȣ����ȡ��ĩβ��
�� m �Ǹ��������ĩβ��ʼ�� m ���ַ���ȡ
select substr('thinking in java',-4,7) from dual;


9.�ַ�������֮ instr��char1,char2,[,n,m])
���Ҹ���char2����char1�е�λ��
n Ϊ�ӵڼ����ַ���ʼ����
m Ϊ�ڼ��γ���
n,m ����дĬ���� 1
select instr('thinking in java','in',3,2) "java" from dual;    --��û�ҵ�������0����Ϊ�±��Ǵ�1��ʼ����ġ�




