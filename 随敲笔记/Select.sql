Select 
1.select子句可以是字段、函数、表达式 ，可以给它们取个别名(可以用双引号把别名扩上，以区分大小写或空格等特殊要求的显示)
  select ename,sal*12 "salary" from emp;  

2.(1)where子句的>, <, >=, <=, !=, <>, =  , 不等于（！=）一般推荐用这种 <>
    and 、 or
    select ename,sal,job from emp where sal>1000 and (job='SALESMAN' OR JOB='CLERK');
  
  (2)like 模糊匹配字符串，支持通配符：
     _:单个字符
     %：任意个字符
     select ename,job,sal from emp where ename like '_A%';
     
  (3) in 和 not in
     select ename,job,sal,deptno from emp where job in('MANAGER','CLERK') and deptno not in 20;
     
  (4) between...and...
     select ename,job,sal from emp where sal between 1500 and 3000;

  (5) any 和 all
     配合 > ,< , >=, <= 一个列表使用的,常用于子查询
     >any(list)
     <any(list)
     >all(list)
     <all(list)
   
  （6）函数 或 表达式 作为过滤条件
     select ename,sal,job from emp where ename=upper('scott');
     select ename,sal,job from emp where sal*12>50000;
     
  (7) 使用 distinct 去重复过滤一下(可以对多个字段的组合进行去重)
     select distinct  deptno,job from emp order by deptno;
     
3. order by 子句    
    asc：升序，默认是升序
    desc：降序
    排序中把 null 作为最大值！
    select ename,deptno,sal from emp order by deptno desc,sal;
    
4. 聚合函数（或者叫统计函数，分组函数,多行函数等）   
  （1）max（），min（）
  （2）avg（），sum（）
  （3）count（）
    select avg(nvl(comm,0)) comm from emp;
    
5.group by
  (1)将结果集按照其后指定的字段值相同的记录看做一组，然后配合聚合函数进行更细分的统计工作
   select avg(sal),deptno from emp group by deptno; 
  (2)没有出现在group by 里的字段，是不能与分组函数（这里是avg）一起出现在字段中的！反之则是可以的！
  (3)可以根据多个字段进行分组，分组原则为：这几个字段都相同的记录看做一组（与distinct的多字段类似）
   select max(sal),job,deptno,ename from emp group by job ,deptno,ename;
   
6.having    
  -- 出错：   select max(sal) ss ,deptno from emp where ss>3000 group by deptno;
  -- 因为where后的条件是在第一遍查询的时候能够判断的，而平均工资在第一遍查询是判断不了
  where中不能使用聚合函数作为过滤条件，原因是过滤时机不对；where是对数据库检索表中的数据时，对数据逐条过滤以决定是否查询出符合条件的数据；
  （1）使用聚合函数的结果作为过滤条件，一定是查询完毕并分组完毕进行聚合计算，才能进行过滤，由此可见，过滤的时机是在where之后。
  （2）聚合函数的过滤条件要在having子句中使用，having必须跟在group by子句之后；having是用来过滤分组的！
   select max(sal),min(sal),avg(sal),deptno from emp group by deptno having avg(sal)>2000;
  （3）如果where和having都有，那么先where过滤，分组后再having过滤
  
7.select....from ... where ....guoup by ....having....order by.....执行顺序
   （1） from  从右往左，数据量较少的表尽量放在后面（优化）
   （2） where 从右往左，将能够过滤大记录的条件放在右边（优化）
   （3） group by 从左往右，
   （4） having
   （5） select
   （6） order by 从左往右，
   
8.联合查询
  从多张表中查询对应的记录，关联的重点是这些表中的对应关系，又称为连接条件。
  没有连接条件就产生笛卡尔集，数据量大就容易宕机。
  N张表查询的条件至少要 N-1 个
   select a.ename,b.dname from emp a,dept b where a.deptno=b.deptno and b.loc='NEW YORK';  
   -- select里面的字段有命名冲突的，必须加表名，表名可以给个别名以简写
   
9.内连接 
   所以不满足连接条件的记录不会出现在关联查询记录中，若需要把不满足条件的也选出来，需要外连接
   select e.ename,d.dname 
   from emp e join dept d 
   on e.deptno=d.deptno
   where d.dname='SALES';

10.外连接
    除了把满足连接条件的记录查询出来，还会把不满足条件的记录也查出来。
   外连接分为：
   （1）左链接：以join左侧表作为驱动板（它的所以记录都查询出来，where删选的除外），那么该表中的某条记录不满足条件时来自右侧表中的字段全部填null
    select e.ename,d.dname from emp e right outer join dept d on e.deptno=d.deptno;   --右外连
       或者
    select e.ename,d.dname from emp e join dept d on e.deptno(+)=d.deptno;    --右外连
    
    
11.自连接
   自连接即：当前表的一条记录可以对应当前表的多条记录
   自连接为了解决同类型数据但是存在上下级关系的树状结构数据时使用。
   select e1.ename,e2.ename,d.loc from  emp e1 join emp e2 on e1.mgr=e2.empno  join dept d on d.deptno=e2.deptno where e1.ename='simth roen';
   -- 查找simth roen的领导所在的城市
  
