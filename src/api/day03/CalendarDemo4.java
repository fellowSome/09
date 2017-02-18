package api.day03;

import java.util.Calendar;

/**
 * 计算时间的方法
 * void add(int field,int value)
 * 对给定时间分量加上给定的值，若给定的值是负数，则减去
 * 
 * @author Administrator
 *
 */
public class CalendarDemo4 {

	public static void main(String[] args) {
		//查看4年3个月零5天是哪一天
		Calendar calendar=Calendar.getInstance();
		calendar.add(Calendar.YEAR, 4);
		calendar.add(Calendar.MONDAY, 3);
		calendar.add(Calendar.DAY_OF_YEAR, 5);
		System.out.println(calendar.getTime());
		
		//查看4年3个月零5天d

	}

}
