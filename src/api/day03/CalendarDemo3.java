package api.day03;

import java.util.Calendar;

/**
 * ��ĳ��ʱ���������ֵ��ʹCalendar��ʾ������
 * void set��int field,int value��
 * 
 * @author Administrator
 *
 */
public class CalendarDemo3 {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		calendar.set(Calendar.YEAR, 2008);
		calendar.set(Calendar.MONTH, 7); //  8��
		calendar.set(Calendar.DAY_OF_MONTH, 32);   //�Զ����£�������9��1��
		System.out.println(calendar.getTime());

	}

}
