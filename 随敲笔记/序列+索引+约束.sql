һ������
  ����Ҳ�����ݿ����֮һ������������һϵ�����֣����г�����Ϊĳ�ű�������ֶ��ṩֵʹ�á�
  1.��������
    create sequence seq_emp_id 
    [start with 1]
    [increment by 1]
    [maxvalue m]
    [minvalue n]
    [cycle/no cycle]
    [cache/no cache]
    ����������α�У�
    nextval����ȡ���е���һ��ֵ,�������з���һ�β������Ҳ��ܻ��ˡ���һ��ֵ��start with ��ֵ��ʼ
    currval:��ȡ���еĵ�ǰֵ
    select seq_emp_id.nextval from dual;
    insert into emp (empno,ename,sal,job,deptno) values(seq_emp_id.nextval,'JACK',7000,'CLERK',10);
    
  2.ɾ������
    drop sequence seq_emp_id;
    
   
��������
   ���������ݿ����֮һ��������Ϊ����߲�ѯЧ�ʡ�
   ������ͳ����Ӧ�������ݿ��Զ���ɵģ�ֻҪ���ݿ���Ϊ����ʹ��Ģ���Դ���������ʱ�ͻ��Զ�Ӧ�á�
   create index idx_emp_ename on emp(ename);
   create index idx_emp_job_sal on emp(job,sal);
   create index idx_emp_upper on emp(upper(ename));
   
   alter index idx_emp_upper rebuild;
   
   drop index idx_emp_upper;
   
   
����Լ��
   1. not null ��NN)
     �����ǿ�Լ����
     create table employees(eid number(6),
                            name varchar2(30) not null,
                            salary number(7,2),
                            hiredate Date constraint employees_hiredate_nn not null;
     ȡ���ǿ�Լ����                       
     alter table employees modify (eid number(6) null);                       
   
   2. unique   ��UK)
     ����ΨһԼ������֤���и��ֶε�ֵ�κ�һ����¼�����ظ���null����
     (1) create table employees1(eid number(6) unique,
                             name varchar2(30),
                             email varchar2(50),
                             salary number(7,2),
                             hiredate Date,           -- �����и�������
                             constraint empolyees1_email_uk unique(email));
     (2)�ڴ�������ΨһԼ��
         alter table empolyees1 
                    add constraint empolyees1_eid_uk unique(eid);
                             
   3. primery key ��PK)  
      ����Լ�� == �ǿ� + Ψһ
      create table employees2��eid number(6) primary key,
                               name varchar2(30),
                               email varchar2(50),
                               salary number(7,2),
                               hiredate Date);
                               
   4. foreign key  (FK)
      alter table employees3
             add constraint employees3_empno
             foreign key  employees3(deptno) reference dept(deptno);
      
      
   5. check key   (CK)
      alter table empolyees4
            add constraint employees4_sal 
            check(sal>5000)
