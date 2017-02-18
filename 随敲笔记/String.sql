1.select 语句
用于查询表中的数据，
select字句后面可以跟要查询的字段，可以包括表中具体的字段，函数或表达式，
from字句用来指定数据来源的表，
where字句用来添加过滤条件
select ename ,sal*12 from emp where empno=7369;


2.字符串函数之 concat（） or ||
concat（）用来连接两个字符串
select concat(concat(ename,','),job) from emp;
    或者
select （ename||','||job) from emp;    


3.字符串函数之 length（）
length()查看字符串的长度
select ename ,length(ename) from emp;


4.字符串函数之 upper()、 lower()、 initcap()
upper()将字符串全转换成大写
lower()将字符串全转换成小写
initcap()将字符串首字母大写，若用空格隔开多个单词，每个单词都会大写
update emp set ename='BLACK APK' where ename='BLACK';
select initcap(ename) from emp;


5.伪表 ：dual
当查询内容不和任何表数据相关时，可以使用伪表，伪表只会查出一条记录
select upper('helloworld'),lower('HELLOWORLD'),INITCAP('HELLO WORLD ! i love u') from dual;


6.字符串函数之 trim() 、ltrim（）、rtrim()
去掉字符串两边的指定重复字符
select trim('e' from 'eepee liteewee') from dual;   --只能指定单个字符
select ltrim('esrrseserlit','rse') from dual;      --能指定多个字符，并且可以无序


7.字符串函数之 lpad（）、rpad（）
select lpad(sal,5,'$') from emp;
select rpad(sal,5,' ') from emp;


8.字符串函数之 substr（char,m,n))
从字符串char的 m 开始，连续截取 n 个字符，下标是从 1 开始 ,
若没有 n ，或 n 超过字符串长度，则截取到末尾，
若 m 是负数，则从末尾开始数 m 个字符截取
select substr('thinking in java',-4,7) from dual;


9.字符串函数之 instr（char1,char2,[,n,m])
查找给定char2，在char1中的位置
n 为从第几个字符开始检索
m 为第几次出现
n,m 都不写默认是 1
select instr('thinking in java','in',3,2) "java" from dual;    --若没找到，返回0，因为下标是从1开始计算的。




