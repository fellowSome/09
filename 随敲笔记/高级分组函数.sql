create table sales_tab(
    year_id number not null,
    month_id number not null,
    day_id number not null,
    sales_value number(10,2) not null);

insert into sales_tab select trunc(SYS.dbms_random.value(2010,2012)) as year_id,
                             trunc(SYS.dbms_random.value(1,13)) as month_id,
                             trunc(dbms_random.value(1,32)) as day_id,
                             round(dbms_random.value(1,100)) as sales_value 
                      from dual 
                      connect by level<=1000;      

commit;

1.union / union all
  两个表 select 后的字段完全一致，查询出的结果是两个表并在一起（可以理解为上下并在一起，而join on 是左右串）；
  union all 可能会出现重复记录，而nuion不会。
  select ename,job,sal from emp where job='MANAGER' union all  select ename ,job,sal from emp where sal>2500;
  
2.intersect
  两个表 select 后的字段完全一致，查询出来的结果是两个表的交集（相当于where条件中的 “and”）
  select ename,job,sal from emp where job='MANAGER' intersect select ename,job,sal from emp where sal>2500;
  
3.minus
  两个表 select 后的字段完全一致,左表减右表
  select ename,job ,sal from emp where job='MANAGER' minus  select ename,job ,sal from emp where sal>=2500;
  
4.group by 字句里的高级分组函数
   每个高级分组函数都有一套分组策略
  （1）rollup（）：分组原则，参数逐次递减，一直到所以参数都不要，每种分组都要统计一次，并且并在一个结果集中显示。
      select year_id,month_id,day_id,sum(sales_value) from sales_tab 
                   group by 
                   rollup(year_id,month_id,day_id) 
                   order by year_id,month_id,day_id;
   (2)cube():分组策略，每种组合分一次组；分组次数是 2 的参数次方，然后将这些分组统计后并在一个结果集中显示
      select year_id,month_id,day_id,sum(sales_value) from sales_tab 
                   group by 
                   cube(year_id,month_id,day_id)
                   order by year_id,month_id,day_id;
   (3)grouping sets（）:分组策略，每个参数是一种分组方式，然后将这些分组统计后并在一个结果集中显示                
       select year_id,month_id,day_id,sum(sales_value) from sales_tab 
                   group by 
                   grouping sets((year_id,month_id,day_id),(year_id,month_id))
                   order by year_id,month_id,day_id;          
   
   