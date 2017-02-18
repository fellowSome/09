package api.day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collections�����ط���sort��������Ҫȥ�ṩһ������ıȽ��������Լ����е�Ԫ�ؽ����Զ�������
 * ���ַ��������ã���Ϊ���������ô���
 * 
 * 1.��ʹ��Ԫ������ıȽϹ��򣬶����ǵ����ṩ�������ܸ��õ�������������
 * 2.�����ṩ�˱Ƚ�������sort��������Ҫ�󼯺��е�Ԫ��ȥʵ��Comparable�ӿڣ���Ԫ�ؼ�����
 *   ������
 *   
 * �����ԣ�������Ҫ��ʹ��ĳ�����ܣ����ù���Ҫ������Ϊ���޸ĵĴ���Խ�࣬������Խǿ�������Լ����Ϊ���ۡ�
 * ������ǿ�Ĺ��ܲ����ڳ�����չ��
 * @author Administrator
 *
 */
public class Sort_List_Demo2 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		//Ӣ���ַ�������,���ȴ�д��Сд���ַ���������
		list.add("jack");
		list.add("rose");
		list.add("tom");
		list.add("jarry");
		list.add("Kobe");
		list.add("James");
		list.add("Lyn");
		list.add("peter");
		
		Collections.sort(list);  
		System.out.println(list);
		
		list.clear();
		
		//�����ַ�������,Ҫ�õ�Collections��sort��list,Comparator�����ط���
		list.add("С����ʦ");
		list.add("����ʦ");
		list.add("����ʦ");
		
		Collections.sort(list,new Comparator<String>(){       //��sort��list����������С��������

			@Override
			public int compare(String o1, String o2) {
				//�Զ���ȽϹ����ַ�������Ĵ�			
				return o1.length()-o2.length() ;
			}
			
		});
		System.out.println(list);

	}

}
