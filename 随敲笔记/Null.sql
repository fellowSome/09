空值操作

1. update emp set comm=null where ename=upper('james');     -- 若comm有非空约束，则更新不成功
2. delete from emp where gender is null;     --  判断是否为空要用，is null 或 is not null 

任何数据和null运算都是null，所以才有了下面两个函数的出现，来处理一下情况

3.空值函数之 nvl(p1,p2)
  若p1为空，则空值用p2代替；若p1不为空，则返回p1本身
  select ename,nvl(comm,0)  from emp;
  
4.空值函数之 nvl2（p1,p2,p3)
  若p1为空，则用p3代替其值；若p1非空，则用p2代替
  
  
  