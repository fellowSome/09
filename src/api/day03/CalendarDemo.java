package api.day03;

import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calendar
 * Calender��һ�������࣬�涨�˲���ʱ�����ط���
 * ���õ�ʵ���ࣺ
 * java.util.GrengorianCalendar
 * ����������
 * ��ȡʵ�������new������ʹ��calender�ṩ�ľ�̬����getInstance��
 * �÷��������ϵͳ���ڵ�������һ�����õ�ʵ���࣬�󲿷�����·��ص��ǹ���������ʵ����
 * @author Administrator
 *
 */
public class CalendarDemo {

	public static void main(String[] args) {
	    /**
	     * Ĭ�ϴ�����Calenderʵ����Ҳ�Ǳ�ʾ��ǰϵͳʱ��
	     */
		Calendar calendar=Calendar.getInstance();
		/**
		 * Calendar��ʵ���඼��д��toString���������ǲ���ֱ�۵Ŀ�������ʱ��
		 */
		System.out.println(calendar);
		
		/**
		 * Calendar �ṩ���� Date֮���໥ת���ķ���
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
