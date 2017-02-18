一、视图
    视图是数据库对象之一，所有的数据库对象不能重复，所以视图一般以V_开头；
    视图在sql语句中体现的角色与表相同，但视图并不是一组真实存在的表，而只是对应select语句的查询结果集，并将其当做表看待而已；
    使用视图的目的是简化sql语句的复杂度，重用子查询，限制数据访问。
    1.简单视图
         对应的子查询中不含有关联查询，不含有函数、表达式，没有分组，没有去重；反之是复杂视图
        （1）. create or replace view v_emp_dept10 as select empno id,ename name,sal,deptno from emp where deptno=10;
         当视图的字段有别名，则对应字段就用别名来命名；视图对应字段有函数或表达式，那么该字段必须指定别名。
         （2）. desc v_emp_dept10;
          只能对简单视图进行 DML 操作，对视图进行 DML 操作就是对视图数据来源的基础表进行操作。
           insert into v_emp_dept10 values(1001,'JACK',8000,10);
           update v_emp_dept10 set sal=3000 where ename='JACK';
           delete from v_emp_dept10 where ename='JACK';
          (3) with check option
           视图有时候执行 DML 时，可能对基表造成污染，比如：
            insert into v_emp_dept10 (1002,'ROSE',6000,20); --因为视图设定deptno=10，所以视图对deptno=20不可见，但能够插入基表中
           插入和更新有可能对基表造成污染，唯独删除不会，要么成功要么失败。
           在创建视图时添加 with check option 选项，可以防止对基表的污染。
            create　or replace view v_emp_dept10 as select empno id,ename name,sal salary ,deptno from emp with check option;
          (4) with read only
           create　or replace view v_emp_dept10 
                                as select empno id,ename name,sal salary ,deptno from emp 
                                with read only;
          (5)数据字典
             和视图相关的数据字典：
              - user_objects
              - user_views
              - user_tables
              - user_update_columns
              select object_name from user_objects where object_type='VIEW' and object_name like 'V_EMP%';
              select * from user_views;
              select table_name from user_tables where table_name like 'EMP%';
              
      2.复杂视图
         create or replace view v_emp_dept_sal 
                            as select d.deptno,d.dname,min(e.sal) min_sal,max(e.sal) max_sal,avg(e.sal) avg_sal,sum(e.sal) sum_sal
                               from emp e,dept d where e.deptno=d.deptno group by d.deptno,d.dname;
      
        select e.ename,e.sal,e.deptno 
                  from emp e,v_emp_dept_sal v
                  where e.deptno=v.deptno and e.sal>v.avg_sal;
                  
      3.删除视图
      删除视图本身不会影响数据，但删除视图的数据会影响数据。
      drop view v_emp_dept_sal;
     
      
      