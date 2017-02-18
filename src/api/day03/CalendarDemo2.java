package api.day03;

import java.util.Calendar;

/**
 * 获取指定时间分量对应的值
 * 
 * int get(int field)
 * 该方法可以获取给定时间分量对应的值，
 * 时间分量是一个int值，无需记住具体的数字，
 * 只需要使用Calendar提供的常量即可
 * 
 * @author Administrator
 *
 */

public class CalendarDemo2 {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		//获取年
		int year=calendar.get(Calendar.YEAR);
		//获取月
		int month=calendar.get(Calendar.MONTH+1);
		//获取日
		int day=calendar.get(Calendar.DAY_OF_MONTH);
		
		//查看周几
		int dow=calendar.get(Calendar.DAY_OF_WEEK);
		String[] dows={"日","一","二","三","四","五","六"};
		System.out.println("今天是周"+dows[dow-1]);
		
		//获取最大/最小值
		int days=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

	}

}
