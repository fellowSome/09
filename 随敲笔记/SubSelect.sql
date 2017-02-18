
子查询
子查询是为其他查询提供数据的。
子查询多用于select语句中，根据查询出来的结果集不同分为：单行单列子查询、多行单列子查询、多行多列子查询

1.普通子查询
  select ename,job from emp where job=( select job from emp where ename='CLARK'); 

2.DDL中用子查询
  create table emp_1 as select e.ename name,e.job,e.deptno,d.dname,sal*12 salary from emp e, dept d where d.deptno(+)=e.deptno;
  --创建表时，子查询中的字段若有别名，那么新表中的字段名就是子查询中的别名；而且子查询字段含表达式或函数时，必须给该字段取别名
  
3.DML中用子查询
  insert into emp_1 select * from emp_1;
  delete from emp_1 where deptno in (select deptno from emp_1 where ename='CLARK');
   
4.单行单列子查询
  

5.多行单列子查询
    常用于过滤条件，由于查询出多个值，在判断=时要用in；判断>,>=等操作时要配合any，all使用
  select deptno,ename,sal from emp where sal>（select avg(sal) from emp);
  select ename,job,deptno from emp where deptno in (select deptno from emp where job='SALESMAN') AND job <> 'SALESMAN';
  select ename,sal from emp where sal> all (select sal from emp where job in ('CLERK','SALESMAN'));
  select min(sal),deptno from emp group by deptno having min(sal)>(select min(sal) from emp where deptno='30');
     
6.多行多列子查询
    一般把它的结果集当做一张表看待（可以作为视图），并可基于它进行二次查询
   select e.ename,e.sal,e.deptno from emp e,(select avg(sal) avg_sal,deptno from emp group by deptno) t where e.deptno = t.deptno and e.sal>t.avg_sal;
   select e.ename,e.sal,(select d.dname from dept d where d.deptno=e.deptno) dname from emp e; --相当于一个外连接
   
   
7.exists 与 not exists
   后面跟一个子查询，当该子查询可以查询出至少一条记录时，则 exists 返回true；
   select deptno,dname from dept d where not exists (select *  from emp e where d.deptno=e.deptno); 
  
  
8.分页查询
   数据库基本都支持分页，但不同数据库语法不同（方言啊）
   roacle分页查询是基于伪列rownum实现的。
   rownum不存在与任何一张表中，但是所有的表都可以查询该字段，该字段的值是随着查询的结果自动生产的。
   方式是：每当可以从表中查询出一条记录时，该字段值即为该条记录的行号，从1开始逐次递增。
   (在使用rownum对结果集进行编号查询过程中，不能使用rownum做>1以上的数字判断，否则查不出任何数据)
   select * from (select rownum rn,t.* from(select ename,job,sal from emp order by sal) t where rownum<=10) where rn >=6;
  
   计算区间公式：
   pageSize:每页显示的条目数
   page:页数
   start:(page-1)*pageSize+1
   end:pageSize*page
   
9.decode（）函数
  （1） 可以实现分支效果
       decode(expr,sercher1,result1[,sercher2,results],default)  ,如果default不写，默认返回 null
       select ename,job,sal,decode(job,'MANAGER',sal*1.2,'ANALYST',sal*1.1,'SALESMAN',sal*1.05,sal) bonds from emp;
   
   （2）decode()在分组中的应用，可以将字段值不同的记录看做一组，效果非常好
        select count(*),decode(job,'MANAGER','VIP','ANALYST','VIP','COMM') job2  from emp group by decode(job,'MANAGER','VIP','ANALYST','VIP','COMM');
        select dname,deptno,loc from dept order by decode(dname,'OPENTION',1,'ACCOUNTING',2,'SALES',3);
   （3）与 decode 功能类似的 case 语句：
        select ename,job,sal,
            case job when '' then sal*1.2
                 when '' then sal*1.1
                 when '' then sal*1.05
                 selse sal end
        bones from emp;
  
10. row_number() over(partition by col1 order by col2)
    组内连续唯一
   排序函数允许对结果集按照指定的字段分组，在组内再按照指定的字段排序，生成组内连续唯一编号。
    select ename,job,sal,deptno,row_number() over(partition by deptno order by sal desc) rank from emp;
    
11. rank（)over(partition by col1 order by col2)
    组内不连续不唯一
    组内排序字段值一样的记录，生成的排序编号一样，组内不连续不唯一
     select ename,job,sal,deptno,rank()over(partition by deptno order by sal) from emp;
12. dense_rank()over(partition by col1 order by col2)
     组内连续不唯一
      select ename,job,sal,deptno,dense_rank()over(partition by deptno order by sal) from emp;
      
      
