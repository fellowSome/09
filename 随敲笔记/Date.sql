��������
 
1. sysdate , systimestamp
  sysdate��Ӧ���ݿ���һ���ڲ��������ú�������һ����ʾ����ϵͳʱ���DATE����ֵ
  systimestamp����һ����ʾ��ǰϵͳʱ���ʱ������͵�ֵ
  select sysdate from dual;
  select systimestamp from dual;
  
  
2.to_date(str1,str2)  
  ���ַ������ո����ĸ�ʽת�������ڣ����ֺ��ֻ������ַ���Ҫ�á���������
  select to_date('2010-12-29','YYYY-MM-DD')  from dual;
  select to_date('2010��12��29��','YYYY"��"MM"��"DD"��"')  from dual;
  
  �������ڿ��Խ��мӼ��������൱�ڼӼ�ָ��������
  select to_date('2010-12-29','YYYY-MM-DD')-10 from dual;   -- 19-12��-10
  select to_date('2010-12-29','YYYY-MM-DD')-to_date('2010-10-7','YYYY-MM-DD') from dual;   -- 83
  
3.to_char()
  ��DATE���ո����ĸ�ʽת��Ϊ�ַ���
  select to_char(sysdate,'yyyy"��"mm"��"dd"��" HH24:MI:SS') from dual;
  �������RR��ʾ�꣬������������ж����Ǹ����ͣ�
  select to_char(to_date('98-10-25','yy-mm-dd'),'yyyy-mm-dd')from dual;   --  2098-10-25
  select to_char(to_date('98-10-25','rr-mm-dd'),'yyyy-mm-dd')from dual;   --  1998-10-25
               user
                 |
            |--------|--------|--------|
     sys->  |        |  0-49  | 50-99  |                             
            |--------------------------|                         
            | 0-49   | ������  | ������  |                             
            |--------------------------|                          
            | 50-99  | ������  |  ������ |                              
            |--------|--------|--------|
  
  
4.last_day(date);


5.add_months(date,i)
  ����date����i���º������

6.months_between(date1,date2)
  ������������֮�������£������Ǹ��� date1-date2 �õ���

7.next_day(date,i)
  ���ظ������ڵĵڶ��쿪ʼһ��
  ֮�ڵ�ָ���ܼ�������
  select next_day(sysdate,6) from dual;      --(����������)��6��ʾ���壬�������쿪ʼ�������ĵ�һ������������
  select next_day(sysdate,5) from dual;      --(����������)��5��ʾ���ģ�����һ������������
  
8.least()��greatest()
  �Ƚϴ�С�����������⣬����Ҳ������
  select least(sysdate,to_date('2008-8-8','yyyy-mm-dd'))from dual;
  select least(14,25,36,2,1,0,-1,45) from dual;
  
9.extract()
  ��ȡ�������ڵ�ʱ����� (�����ʱ�����������ȡʱ���룩
  select extract(year from sysdate) from dual;
  select extract(month from sysdate) from dual;

  
  