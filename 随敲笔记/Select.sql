Select 
1.select�Ӿ�������ֶΡ����������ʽ �����Ը�����ȡ������(������˫���Űѱ������ϣ������ִ�Сд��ո������Ҫ�����ʾ)
  select ename,sal*12 "salary" from emp;  

2.(1)where�Ӿ��>, <, >=, <=, !=, <>, =  , �����ڣ���=��һ���Ƽ������� <>
    and �� or
    select ename,sal,job from emp where sal>1000 and (job='SALESMAN' OR JOB='CLERK');
  
  (2)like ģ��ƥ���ַ�����֧��ͨ�����
     _:�����ַ�
     %��������ַ�
     select ename,job,sal from emp where ename like '_A%';
     
  (3) in �� not in
     select ename,job,sal,deptno from emp where job in('MANAGER','CLERK') and deptno not in 20;
     
  (4) between...and...
     select ename,job,sal from emp where sal between 1500 and 3000;

  (5) any �� all
     ��� > ,< , >=, <= һ���б�ʹ�õ�,�������Ӳ�ѯ
     >any(list)
     <any(list)
     >all(list)
     <all(list)
   
  ��6������ �� ���ʽ ��Ϊ��������
     select ename,sal,job from emp where ename=upper('scott');
     select ename,sal,job from emp where sal*12>50000;
     
  (7) ʹ�� distinct ȥ�ظ�����һ��(���ԶԶ���ֶε���Ͻ���ȥ��)
     select distinct  deptno,job from emp order by deptno;
     
3. order by �Ӿ�    
    asc������Ĭ��������
    desc������
    �����а� null ��Ϊ���ֵ��
    select ename,deptno,sal from emp order by deptno desc,sal;
    
4. �ۺϺ��������߽�ͳ�ƺ��������麯��,���к����ȣ�   
  ��1��max������min����
  ��2��avg������sum����
  ��3��count����
    select avg(nvl(comm,0)) comm from emp;
    
5.group by
  (1)��������������ָ�����ֶ�ֵ��ͬ�ļ�¼����һ�飬Ȼ����ϾۺϺ������и�ϸ�ֵ�ͳ�ƹ���
   select avg(sal),deptno from emp group by deptno; 
  (2)û�г�����group by ����ֶΣ��ǲ�������麯����������avg��һ��������ֶ��еģ���֮���ǿ��Եģ�
  (3)���Ը��ݶ���ֶν��з��飬����ԭ��Ϊ���⼸���ֶζ���ͬ�ļ�¼����һ�飨��distinct�Ķ��ֶ����ƣ�
   select max(sal),job,deptno,ename from emp group by job ,deptno,ename;
   
6.having    
  -- ����   select max(sal) ss ,deptno from emp where ss>3000 group by deptno;
  -- ��Ϊwhere����������ڵ�һ���ѯ��ʱ���ܹ��жϵģ���ƽ�������ڵ�һ���ѯ���жϲ���
  where�в���ʹ�þۺϺ�����Ϊ����������ԭ���ǹ���ʱ�����ԣ�where�Ƕ����ݿ�������е�����ʱ�����������������Ծ����Ƿ��ѯ���������������ݣ�
  ��1��ʹ�þۺϺ����Ľ����Ϊ����������һ���ǲ�ѯ��ϲ�������Ͻ��оۺϼ��㣬���ܽ��й��ˣ��ɴ˿ɼ������˵�ʱ������where֮��
  ��2���ۺϺ����Ĺ�������Ҫ��having�Ӿ���ʹ�ã�having�������group by�Ӿ�֮��having���������˷���ģ�
   select max(sal),min(sal),avg(sal),deptno from emp group by deptno having avg(sal)>2000;
  ��3�����where��having���У���ô��where���ˣ��������having����
  
7.select....from ... where ....guoup by ....having....order by.....ִ��˳��
   ��1�� from  �����������������ٵı������ں��棨�Ż���
   ��2�� where �������󣬽��ܹ����˴��¼�����������ұߣ��Ż���
   ��3�� group by �������ң�
   ��4�� having
   ��5�� select
   ��6�� order by �������ң�
   
8.���ϲ�ѯ
  �Ӷ��ű��в�ѯ��Ӧ�ļ�¼���������ص�����Щ���еĶ�Ӧ��ϵ���ֳ�Ϊ����������
  û�����������Ͳ����ѿ��������������������崻���
  N�ű��ѯ����������Ҫ N-1 ��
   select a.ename,b.dname from emp a,dept b where a.deptno=b.deptno and b.loc='NEW YORK';  
   -- select������ֶ���������ͻ�ģ�����ӱ������������Ը��������Լ�д
   
9.������ 
   ���Բ��������������ļ�¼��������ڹ�����ѯ��¼�У�����Ҫ�Ѳ�����������Ҳѡ��������Ҫ������
   select e.ename,d.dname 
   from emp e join dept d 
   on e.deptno=d.deptno
   where d.dname='SALES';

10.������
    ���˰��������������ļ�¼��ѯ����������Ѳ����������ļ�¼Ҳ�������
   �����ӷ�Ϊ��
   ��1�������ӣ���join������Ϊ�����壨�������Լ�¼����ѯ������whereɾѡ�ĳ��⣩����ô�ñ��е�ĳ����¼����������ʱ�����Ҳ���е��ֶ�ȫ����null
    select e.ename,d.dname from emp e right outer join dept d on e.deptno=d.deptno;   --������
       ����
    select e.ename,d.dname from emp e join dept d on e.deptno(+)=d.deptno;    --������
    
    
11.������
   �����Ӽ�����ǰ���һ����¼���Զ�Ӧ��ǰ��Ķ�����¼
   ������Ϊ�˽��ͬ�������ݵ��Ǵ������¼���ϵ����״�ṹ����ʱʹ�á�
   select e1.ename,e2.ename,d.loc from  emp e1 join emp e2 on e1.mgr=e2.empno  join dept d on d.deptno=e2.deptno where e1.ename='simth roen';
   -- ����simth roen���쵼���ڵĳ���
  
