package api.day03;

import java.util.Calendar;

/**
 * ��ȡָ��ʱ�������Ӧ��ֵ
 * 
 * int get(int field)
 * �÷������Ի�ȡ����ʱ�������Ӧ��ֵ��
 * ʱ�������һ��intֵ�������ס��������֣�
 * ֻ��Ҫʹ��Calendar�ṩ�ĳ�������
 * 
 * @author Administrator
 *
 */

public class CalendarDemo2 {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		//��ȡ��
		int year=calendar.get(Calendar.YEAR);
		//��ȡ��
		int month=calendar.get(Calendar.MONTH+1);
		//��ȡ��
		int day=calendar.get(Calendar.DAY_OF_MONTH);
		
		//�鿴�ܼ�
		int dow=calendar.get(Calendar.DAY_OF_WEEK);
		String[] dows={"��","һ","��","��","��","��","��"};
		System.out.println("��������"+dows[dow-1]);
		
		//��ȡ���/��Сֵ
		int days=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

	}

}
