package api.day03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Iterator �������ӿ�
 * 
 * Collection�����ڱ�������Ԫ�صĹ���
 * 
 * Iterator iterator() �÷�����ȡһ�����Ա�����ǰ���ϵĵ�����ʵ����
 * 
 * java.util.Iterator �������ӿڣ��涨�˱������ϵ���ط����� ���Եļ��϶�ʵ����һ��ʵ����Iterator�ӿڵ�ʵ����������������Ԫ�أ�
 * ���������סÿ���ƻ��ṩ�ĵ�����ʵ��������֣�ֻ�����ǵ���Iterator����ӿڿ������ɡ�
 * 
 * @author Administrator
 *
 */
public class Collection_iterator_Demo {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		c.add("#");
		c.add("five");
		c.add("#");

		Iterator it = c.iterator();

		while (it.hasNext()) {
			String str = (String) it.next();
			if ("#".equals(str)) {
				// c.remove(str); �������ڱ�������ʱ�������ü��ϵķ���ɾ��Ԫ�أ��ױ���
				it.remove();
			} else {
				System.out.println(str);
			}
		}

	}

}
