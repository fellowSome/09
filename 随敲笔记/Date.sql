日期类型
 
1. sysdate , systimestamp
  sysdate对应数据库中一个内部函数，该函数返回一个表示单曲系统时间的DATE类型值
  systimestamp返回一个表示当前系统时间的时间戳类型的值
  select sysdate from dual;
  select systimestamp from dual;
  
  
2.to_date(str1,str2)  
  将字符串按照给定的格式转换成日期，出现汉字或其他字符需要用“”引起来
  select to_date('2010-12-29','YYYY-MM-DD')  from dual;
  select to_date('2010年12月29日','YYYY"年"MM"月"DD"日"')  from dual;
  
  两个日期可以进行加减法，这相当于加减指定的天数
  select to_date('2010-12-29','YYYY-MM-DD')-10 from dual;   -- 19-12月-10
  select to_date('2010-12-29','YYYY-MM-DD')-to_date('2010-10-7','YYYY-MM-DD') from dual;   -- 83
  
3.to_char()
  将DATE按照给定的格式转换为字符串
  select to_char(sysdate,'yyyy"年"mm"月"dd"日" HH24:MI:SS') from dual;
  如果是用RR表示年，则由下面的来判断是那个世纪：
  select to_char(to_date('98-10-25','yy-mm-dd'),'yyyy-mm-dd')from dual;   --  2098-10-25
  select to_char(to_date('98-10-25','rr-mm-dd'),'yyyy-mm-dd')from dual;   --  1998-10-25
               user
                 |
            |--------|--------|--------|
     sys->  |        |  0-49  | 50-99  |                             
            |--------------------------|                         
            | 0-49   | 本世纪  | 下世纪  |                             
            |--------------------------|                          
            | 50-99  | 上世纪  |  本世纪 |                              
            |--------|--------|--------|
  
  
4.last_day(date);


5.add_months(date,i)
  返回date加上i个月后的日期

6.months_between(date1,date2)
  计算两个日期之间相差的月，计算是根据 date1-date2 得到的

7.next_day(date,i)
  返回给定日期的第二天开始一周
  之内的指定周几的日期
  select next_day(sysdate,6) from dual;      --(今天是周四)，6表示周五，即从明天开始（含）的第一个周五是哪天
  select next_day(sysdate,5) from dual;      --(今天是周四)，5表示周四，即下一个周四是哪天
  
8.least()、greatest()
  比较大小，除了日期外，数字也可以用
  select least(sysdate,to_date('2008-8-8','yyyy-mm-dd'))from dual;
  select least(14,25,36,2,1,0,-1,45) from dual;
  
9.extract()
  提取给定日期的时间分量 (如果是时间戳还可以提取时分秒）
  select extract(year from sysdate) from dual;
  select extract(month from sysdate) from dual;

  
  