package api.day03;

import java.util.Calendar;

/**
 * ����ʱ��ķ���
 * void add(int field,int value)
 * �Ը���ʱ��������ϸ�����ֵ����������ֵ�Ǹ��������ȥ
 * 
 * @author Administrator
 *
 */
public class CalendarDemo4 {

	public static void main(String[] args) {
		//�鿴4��3������5������һ��
		Calendar calendar=Calendar.getInstance();
		calendar.add(Calendar.YEAR, 4);
		calendar.add(Calendar.MONDAY, 3);
		calendar.add(Calendar.DAY_OF_YEAR, 5);
		System.out.println(calendar.getTime());
		
		//�鿴4��3������5��d

	}

}
