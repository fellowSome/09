package api.day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * java.text.SimpleDateFormat
 * 该类可以按照一个给定的日期格式
 * 将Date与String之间相互转换
 * @author Administrator
 *
 */
public class SimpleDateFormatDemo {

	public static void main(String[] args) throws ParseException {
		/**
		 *  Date 2  String
		 */
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
		
		/**
		 *  String 2 Date
		 */
		sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String str="2008/08/08 20:08:08";
        date=sdf.parse(str);
		System.out.println(date);
		
		/**
		 * 接受用户输入自己的生日，如：1992-05-16
		 * 输入完毕后，计算出到今天为止一共活了多少天
		 */
		System.out.println("输入你的生日，格式如：1992-05-16");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
		Date d=sd.parse(s);
		Date dn=new Date();
		long day=(dn.getTime()-d.getTime())/(1000*60*60*24);
		System.out.println("你已经活了："+day+"天");
		
	}

}
