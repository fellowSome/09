package api.day04;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List
 * ���ظ�������������
 * �ص��ǿ��Ը����±����Ԫ��
 * 
 * @author Administrator
 *
 */
public class List_add_get_set_Demo {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		
		/**
		 * E add(E e)
		 * �����׷��һ��Ԫ�أ������ط�������ָ��λ�ò���Ԫ�أ�
		 * 
		 * E get(int index)
		 * ��ȡ�����ж�Ӧλ�õ�Ԫ��
		 * 
		 */
		list.add("five");
		System.out.println(list.get(1));
		System.out.println(list.toString());
        /**
         * E set(int index,E e��
         * �滻ָ��λ�õ�Ԫ�أ����ر��滻��Ԫ��
         */
		list.set(3,"3");
		System.out.println(list.toString());
	}

}
