package api.day03;

import java.util.ArrayList;
import java.util.Collection;
import api.day02.Point;

/**
 * ɾ�������е�Ԫ��
 * 
 * boolean remove(E e)
 * ͨ��Ԫ�ص�equals�ȽϽ���ɾ����
 * ֻɾ�������е�һ�αȽϣ�˳��Ƚϣ��ɹ���Ԫ�أ�
 * һ��ֻɾ��һ��Ԫ�ء�
 * 
 * @author Administrator
 *
 */
public class Collection_remove_Demo {

	public static void main(String[] args) {
		Collection co=new ArrayList();
		co.add(new Point(1,2));
		co.add(new Point(2,3));
		co.add(new Point(3,4));
		co.add(new Point(1,2));
		
		Point p=new Point(1,2);
		
		co.remove(p);
		System.out.println(co);

	}

}
