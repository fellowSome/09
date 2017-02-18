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
  ������ select ����ֶ���ȫһ�£���ѯ���Ľ������������һ�𣨿������Ϊ���²���һ�𣬶�join on �����Ҵ�����
  union all ���ܻ�����ظ���¼����nuion���ᡣ
  select ename,job,sal from emp where job='MANAGER' union all  select ename ,job,sal from emp where sal>2500;
  
2.intersect
  ������ select ����ֶ���ȫһ�£���ѯ�����Ľ����������Ľ������൱��where�����е� ��and����
  select ename,job,sal from emp where job='MANAGER' intersect select ename,job,sal from emp where sal>2500;
  
3.minus
  ������ select ����ֶ���ȫһ��,�����ұ�
  select ename,job ,sal from emp where job='MANAGER' minus  select ename,job ,sal from emp where sal>=2500;
  
4.group by �־���ĸ߼����麯��
   ÿ���߼����麯������һ�׷������
  ��1��rollup����������ԭ�򣬲�����εݼ���һֱ�����Բ�������Ҫ��ÿ�ַ��鶼Ҫͳ��һ�Σ����Ҳ���һ�����������ʾ��
      select year_id,month_id,day_id,sum(sales_value) from sales_tab 
                   group by 
                   rollup(year_id,month_id,day_id) 
                   order by year_id,month_id,day_id;
   (2)cube():������ԣ�ÿ����Ϸ�һ���飻��������� 2 �Ĳ����η���Ȼ����Щ����ͳ�ƺ���һ�����������ʾ
      select year_id,month_id,day_id,sum(sales_value) from sales_tab 
                   group by 
                   cube(year_id,month_id,day_id)
                   order by year_id,month_id,day_id;
   (3)grouping sets����:������ԣ�ÿ��������һ�ַ��鷽ʽ��Ȼ����Щ����ͳ�ƺ���һ�����������ʾ                
       select year_id,month_id,day_id,sum(sales_value) from sales_tab 
                   group by 
                   grouping sets((year_id,month_id,day_id),(year_id,month_id))
                   order by year_id,month_id,day_id;          
   
   