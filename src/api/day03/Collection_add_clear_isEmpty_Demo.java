package api.day03;

import java.util.ArrayList;
import java.util.Collection;

import api.day02.Point;

/**
 * java.util.Collection
 * ����
 * �������ڴ洢һ��Ԫ�أ��������������ƣ�
 * Collection�����Լ��ϵĸ��ӿڣ��涨�˼�����Ӧ���߱��Ĺ��ܡ�
 * Collection���������������͵Ľӿ�.
 * java.util.List:���ظ�����
 * java.util.Set:�����ظ�����
 * Ԫ���Ƿ��ظ������������equals�ȽϵĽ������Set������ͬʱ�������equals�Ƚ�Ϊtrue��Ԫ��
 * @author Administrator
 *
 */

public class Collection_add_clear_isEmpty_Demo {

	public static void main(String[] args) {
		/**
		 * boolean add(E e)
		 * �򼯺�����Ӹ���Ԫ�أ����ɹ��򷵻�true
		 */
		Collection co=new ArrayList();
        co.add("one");
        co.add("two");
        co.add("three");
        co.add("four");
        System.out.println(co);
        
        /**
         * boolean contains(E e)
         * �жϼ����Ƿ��������Ԫ��
         */
        co.add(new Point(1,2));
        co.add(new Point(2,3));
         System.out.println(co.contains(new Point(1,2)));   //contains��equals�����ж�
        
        
        /**
         * int size();
         * ���ؼ�����Ԫ�صĸ���
         */
        System.out.println("size:"+co.size());
        
        /**
         * boolean isEmpty() ,����Ϊ����null����һ����
         */
        System.out.println("isEmpty:"+co.isEmpty());
        
        /**
         *  clear���� ��ռ���
         */
        co.clear();
        System.out.println("size:"+co.size());
        System.out.println("isEmpty:"+co.isEmpty());
        
        
	}

}
