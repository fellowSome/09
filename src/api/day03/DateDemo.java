package api.day03;

import java.util.Date;

/**
 * java.util.Date
 * Date��ÿһ��ʵ�����ڱ�ʾһ������ʵ��
 * ���ڲ�ά��һ��longֵ�����Ա�ʾ��1970��Ԫ��
 * ����Date��ʾ��ʱ��ֱ�ӵĺ�����
 * ���ʱ������ķ���������עΪ��ʱ������
 * ��������ʹ��Date������ʾһ��ʱ�䡣
 * @author Administrator
 *
 */
public class DateDemo {
	
	public static void main(String[] 	args){
		Date date=new Date();
	    /**
	     * Date ��д��toString�������� ����Ϊ��Ϊ�������ͣ���û����дӦ��������
	     * toString��ʾʱ��ĸ�ʽ�̶����Է�Ӣ���������ʮ���Ѻá�
	     */
	    System.out.println(date);
	    int year=date.getYear();
	    System.out.println(year);
	    
	    /**
	     * ����1970��Ԫ������ĺ���ֵ
	     */
	    long time=date.getTime();
	    System.out.println(time);
	    
	    /**
	     * date������setTime������
	     */
	    time+=1000*60*60*24;
	    date.setTime(time);
	    System.out.println(date);
	}
    
}
