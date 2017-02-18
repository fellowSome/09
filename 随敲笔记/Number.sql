1.数值函数之 number(p,s)
 s为空默认为0，p可取1-38位
 
 
2.数值函数之 round(n,m)
  四舍五入
 select round(45.678,2) from dual;   -- 45.68
 select round(45.678,0) from dual;  --46
 select round(45.678,-1) from dual; --50
 
 
3.数值函数之 trunc(n,m)
  直接截取去掉
 select trunc(45.678,2) from dual;   -- 45.67
 select trunc(45.678,0) from dual;  --45
 select trunc(45.678,-1) from dual; --40
 
 
4.数值函数之 mod(m,n)
  取余
  数学上，除数n不为0；这里n可以为0，直接返回m
 select mod(sal,1000) from emp;
 select mod(10,0) from dual;
 
 
5.数值函数之 ceil()、floor（）
  向上取整与向下取整
select ceil(45.6) from dual;
select floor(45.6) from dual;





