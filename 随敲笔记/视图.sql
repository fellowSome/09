һ����ͼ
    ��ͼ�����ݿ����֮һ�����е����ݿ�������ظ���������ͼһ����V_��ͷ��
    ��ͼ��sql��������ֵĽ�ɫ�����ͬ������ͼ������һ����ʵ���ڵı���ֻ�Ƕ�Ӧselect���Ĳ�ѯ������������䵱���������ѣ�
    ʹ����ͼ��Ŀ���Ǽ�sql���ĸ��Ӷȣ������Ӳ�ѯ���������ݷ��ʡ�
    1.����ͼ
         ��Ӧ���Ӳ�ѯ�в����й�����ѯ�������к��������ʽ��û�з��飬û��ȥ�أ���֮�Ǹ�����ͼ
        ��1��. create or replace view v_emp_dept10 as select empno id,ename name,sal,deptno from emp where deptno=10;
         ����ͼ���ֶ��б��������Ӧ�ֶξ��ñ�������������ͼ��Ӧ�ֶ��к�������ʽ����ô���ֶα���ָ��������
         ��2��. desc v_emp_dept10;
          ֻ�ܶԼ���ͼ���� DML ����������ͼ���� DML �������Ƕ���ͼ������Դ�Ļ�������в�����
           insert into v_emp_dept10 values(1001,'JACK',8000,10);
           update v_emp_dept10 set sal=3000 where ename='JACK';
           delete from v_emp_dept10 where ename='JACK';
          (3) with check option
           ��ͼ��ʱ��ִ�� DML ʱ�����ܶԻ��������Ⱦ�����磺
            insert into v_emp_dept10 (1002,'ROSE',6000,20); --��Ϊ��ͼ�趨deptno=10��������ͼ��deptno=20���ɼ������ܹ����������
           ����͸����п��ܶԻ��������Ⱦ��Ψ��ɾ�����ᣬҪô�ɹ�Ҫôʧ�ܡ�
           �ڴ�����ͼʱ��� with check option ѡ����Է�ֹ�Ի������Ⱦ��
            create��or replace view v_emp_dept10 as select empno id,ename name,sal salary ,deptno from emp with check option;
          (4) with read only
           create��or replace view v_emp_dept10 
                                as select empno id,ename name,sal salary ,deptno from emp 
                                with read only;
          (5)�����ֵ�
             ����ͼ��ص������ֵ䣺
              - user_objects
              - user_views
              - user_tables
              - user_update_columns
              select object_name from user_objects where object_type='VIEW' and object_name like 'V_EMP%';
              select * from user_views;
              select table_name from user_tables where table_name like 'EMP%';
              
      2.������ͼ
         create or replace view v_emp_dept_sal 
                            as select d.deptno,d.dname,min(e.sal) min_sal,max(e.sal) max_sal,avg(e.sal) avg_sal,sum(e.sal) sum_sal
                               from emp e,dept d where e.deptno=d.deptno group by d.deptno,d.dname;
      
        select e.ename,e.sal,e.deptno 
                  from emp e,v_emp_dept_sal v
                  where e.deptno=v.deptno and e.sal>v.avg_sal;
                  
      3.ɾ����ͼ
      ɾ����ͼ������Ӱ�����ݣ���ɾ����ͼ�����ݻ�Ӱ�����ݡ�
      drop view v_emp_dept_sal;
     
      
      