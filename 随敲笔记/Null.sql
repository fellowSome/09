��ֵ����

1. update emp set comm=null where ename=upper('james');     -- ��comm�зǿ�Լ��������²��ɹ�
2. delete from emp where gender is null;     --  �ж��Ƿ�Ϊ��Ҫ�ã�is null �� is not null 

�κ����ݺ�null���㶼��null�����Բ������������������ĳ��֣�������һ�����

3.��ֵ����֮ nvl(p1,p2)
  ��p1Ϊ�գ����ֵ��p2���棻��p1��Ϊ�գ��򷵻�p1����
  select ename,nvl(comm,0)  from emp;
  
4.��ֵ����֮ nvl2��p1,p2,p3)
  ��p1Ϊ�գ�����p3������ֵ����p1�ǿգ�����p2����
  
  
  