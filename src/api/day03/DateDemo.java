package api.day03;

import java.util.Date;

/**
 * java.util.Date
 * Date的每一个实例用于表示一个日期实际
 * 其内部维护一个long值，用以表示从1970年元旦
 * 到该Date表示的时间直接的毫秒数
 * 针对时间操作的方法都被标注为过时方法，
 * 所以现在使用Date仅仅表示一个时间。
 * @author Administrator
 *
 */
public class DateDemo {
	
	public static void main(String[] 	args){
		Date date=new Date();
	    /**
	     * Date 重写了toString（）方法 ，因为作为引用类型，若没有重写应该输出句柄
	     * toString显示时间的格式固定，对非英语地区不是十分友好。
	     */
	    System.out.println(date);
	    int year=date.getYear();
	    System.out.println(year);
	    
	    /**
	     * 返回1970年元旦至今的毫秒值
	     */
	    long time=date.getTime();
	    System.out.println(time);
	    
	    /**
	     * date还可以setTime（）；
	     */
	    time+=1000*60*60*24;
	    date.setTime(time);
	    System.out.println(date);
	}
    
}
