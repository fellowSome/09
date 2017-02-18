package api.day03;

import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calendar
 * Calender是一个抽象类，规定了操作时间的相关方法
 * 常用的实现类：
 * java.util.GrengorianCalendar
 * 即公历历法
 * 获取实现类可以new，或者使用calender提供的静态方法getInstance，
 * 该方法会根据系统所在地区返回一个适用的实现类，大部分情况下返回的是公历历法的实现类
 * @author Administrator
 *
 */
public class CalendarDemo {

	public static void main(String[] args) {
	    /**
	     * 默认创建的Calender实现类也是表示当前系统时间
	     */
		Calendar calendar=Calendar.getInstance();
		/**
		 * Calendar的实现类都重写了toString方法，但是不能直观的看出具体时间
		 */
		System.out.println(calendar);
		
		/**
		 * Calendar 提供了与 Date之间相互转换的方法
		 * 
		 * Calendar ->  Date
		 * 
		 */
		Date date=calendar.getTime();
		System.out.println(calendar.getTime());
		System.out.println(date);
		
		/**
		 * Date -> Calendar
		 * 
		 * void setTime(Date date)
		 */
		calendar.setTime(date);
	}   

}
