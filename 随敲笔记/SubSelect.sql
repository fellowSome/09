
�Ӳ�ѯ
�Ӳ�ѯ��Ϊ������ѯ�ṩ���ݵġ�
�Ӳ�ѯ������select����У����ݲ�ѯ�����Ľ������ͬ��Ϊ�����е����Ӳ�ѯ�����е����Ӳ�ѯ�����ж����Ӳ�ѯ

1.��ͨ�Ӳ�ѯ
  select ename,job from emp where job=( select job from emp where ename='CLARK'); 

2.DDL�����Ӳ�ѯ
  create table emp_1 as select e.ename name,e.job,e.deptno,d.dname,sal*12 salary from emp e, dept d where d.deptno(+)=e.deptno;
  --������ʱ���Ӳ�ѯ�е��ֶ����б�������ô�±��е��ֶ��������Ӳ�ѯ�еı����������Ӳ�ѯ�ֶκ����ʽ����ʱ����������ֶ�ȡ����
  
3.DML�����Ӳ�ѯ
  insert into emp_1 select * from emp_1;
  delete from emp_1 where deptno in (select deptno from emp_1 where ename='CLARK');
   
4.���е����Ӳ�ѯ
  

5.���е����Ӳ�ѯ
    �����ڹ������������ڲ�ѯ�����ֵ�����ж�=ʱҪ��in���ж�>,>=�Ȳ���ʱҪ���any��allʹ��
  select deptno,ename,sal from emp where sal>��select avg(sal) from emp);
  select ename,job,deptno from emp where deptno in (select deptno from emp where job='SALESMAN') AND job <> 'SALESMAN';
  select ename,sal from emp where sal> all (select sal from emp where job in ('CLERK','SALESMAN'));
  select min(sal),deptno from emp group by deptno having min(sal)>(select min(sal) from emp where deptno='30');
     
6.���ж����Ӳ�ѯ
    һ������Ľ��������һ�ű�����������Ϊ��ͼ�������ɻ��������ж��β�ѯ
   select e.ename,e.sal,e.deptno from emp e,(select avg(sal) avg_sal,deptno from emp group by deptno) t where e.deptno = t.deptno and e.sal>t.avg_sal;
   select e.ename,e.sal,(select d.dname from dept d where d.deptno=e.deptno) dname from emp e; --�൱��һ��������
   
   
7.exists �� not exists
   �����һ���Ӳ�ѯ�������Ӳ�ѯ���Բ�ѯ������һ����¼ʱ���� exists ����true��
   select deptno,dname from dept d where not exists (select *  from emp e where d.deptno=e.deptno); 
  
  
8.��ҳ��ѯ
   ���ݿ������֧�ַ�ҳ������ͬ���ݿ��﷨��ͬ�����԰���
   roacle��ҳ��ѯ�ǻ���α��rownumʵ�ֵġ�
   rownum���������κ�һ�ű��У��������еı����Բ�ѯ���ֶΣ����ֶε�ֵ�����Ų�ѯ�Ľ���Զ������ġ�
   ��ʽ�ǣ�ÿ�����Դӱ��в�ѯ��һ����¼ʱ�����ֶ�ֵ��Ϊ������¼���кţ���1��ʼ��ε�����
   (��ʹ��rownum�Խ�������б�Ų�ѯ�����У�����ʹ��rownum��>1���ϵ������жϣ�����鲻���κ�����)
   select * from (select rownum rn,t.* from(select ename,job,sal from emp order by sal) t where rownum<=10) where rn >=6;
  
   �������乫ʽ��
   pageSize:ÿҳ��ʾ����Ŀ��
   page:ҳ��
   start:(page-1)*pageSize+1
   end:pageSize*page
   
9.decode��������
  ��1�� ����ʵ�ַ�֧Ч��
       decode(expr,sercher1,result1[,sercher2,results],default)  ,���default��д��Ĭ�Ϸ��� null
       select ename,job,sal,decode(job,'MANAGER',sal*1.2,'ANALYST',sal*1.1,'SALESMAN',sal*1.05,sal) bonds from emp;
   
   ��2��decode()�ڷ����е�Ӧ�ã����Խ��ֶ�ֵ��ͬ�ļ�¼����һ�飬Ч���ǳ���
        select count(*),decode(job,'MANAGER','VIP','ANALYST','VIP','COMM') job2  from emp group by decode(job,'MANAGER','VIP','ANALYST','VIP','COMM');
        select dname,deptno,loc from dept order by decode(dname,'OPENTION',1,'ACCOUNTING',2,'SALES',3);
   ��3���� decode �������Ƶ� case ��䣺
        select ename,job,sal,
            case job when '' then sal*1.2
                 when '' then sal*1.1
                 when '' then sal*1.05
                 selse sal end
        bones from emp;
  
10. row_number() over(partition by col1 order by col2)
    ��������Ψһ
   ����������Խ��������ָ�����ֶη��飬�������ٰ���ָ�����ֶ�����������������Ψһ��š�
    select ename,job,sal,deptno,row_number() over(partition by deptno order by sal desc) rank from emp;
    
11. rank��)over(partition by col1 order by col2)
    ���ڲ�������Ψһ
    ���������ֶ�ֵһ���ļ�¼�����ɵ�������һ�������ڲ�������Ψһ
     select ename,job,sal,deptno,rank()over(partition by deptno order by sal) from emp;
12. dense_rank()over(partition by col1 order by col2)
     ����������Ψһ
      select ename,job,sal,deptno,dense_rank()over(partition by deptno order by sal) from emp;
      
      
