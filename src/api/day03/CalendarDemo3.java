package api.day03;

import java.util.Calendar;

/**
 * 对某个时间分量设置值，使Calendar表示该日期
 * void set（int field,int value）
 * 
 * @author Administrator
 *
 */
public class CalendarDemo3 {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		calendar.set(Calendar.YEAR, 2008);
		calendar.set(Calendar.MONTH, 7); //  8月
		calendar.set(Calendar.DAY_OF_MONTH, 32);   //自动加月，所以是9月1号
		System.out.println(calendar.getTime());

	}

}
