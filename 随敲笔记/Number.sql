1.��ֵ����֮ number(p,s)
 sΪ��Ĭ��Ϊ0��p��ȡ1-38λ
 
 
2.��ֵ����֮ round(n,m)
  ��������
 select round(45.678,2) from dual;   -- 45.68
 select round(45.678,0) from dual;  --46
 select round(45.678,-1) from dual; --50
 
 
3.��ֵ����֮ trunc(n,m)
  ֱ�ӽ�ȡȥ��
 select trunc(45.678,2) from dual;   -- 45.67
 select trunc(45.678,0) from dual;  --45
 select trunc(45.678,-1) from dual; --40
 
 
4.��ֵ����֮ mod(m,n)
  ȡ��
  ��ѧ�ϣ�����n��Ϊ0������n����Ϊ0��ֱ�ӷ���m
 select mod(sal,1000) from emp;
 select mod(10,0) from dual;
 
 
5.��ֵ����֮ ceil()��floor����
  ����ȡ��������ȡ��
select ceil(45.6) from dual;
select floor(45.6) from dual;





