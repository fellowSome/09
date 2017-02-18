package api.day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * java.text.SimpleDateFormat
 * ������԰���һ�����������ڸ�ʽ
 * ��Date��String֮���໥ת��
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
		 * �����û������Լ������գ��磺1992-05-16
		 * ������Ϻ󣬼����������Ϊֹһ�����˶�����
		 */
		System.out.println("����������գ���ʽ�磺1992-05-16");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
		Date d=sd.parse(s);
		Date dn=new Date();
		long day=(dn.getTime()-d.getTime())/(1000*60*60*24);
		System.out.println("���Ѿ����ˣ�"+day+"��");
		
	}

}
