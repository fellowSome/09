package api.day04;

import java.util.ArrayList;
import java.util.List;

public class List_Override_add_remove_Demo {

	public static void main(String[] args) {
		List<String> list=new ArrayList();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
	    /**
	     * 
	     * void add��int index��E e��
	     * ��ָ��λ��׷��Ԫ��
	     */
		list.add(2, "five");
		System.out.println(list);
		
		/**
		 * E remove(int index)
		 * ɾ��������ָ��λ�õ�Ԫ��
		 * 
		 */
		String str=list.remove(2);    //���и����ط�����ɾ��ָ������ boolean remove��Object o��
		System.out.println(list);
		System.out.println(str);
		


	}

}
