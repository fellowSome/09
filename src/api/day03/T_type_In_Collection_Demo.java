package api.day03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * �����ڼ����е�Ӧ�ã��������涨������Ԫ�ص�����
 * 
 * @author Administrator
 *
 */
public class T_type_In_Collection_Demo {

	public static void main(String[] args) {
		Collection<String> co=new ArrayList<String>();
		co.add("1");
		co.add("2");
		co.add("3");
		co.add("4");
		
		Iterator<String> it=co.iterator();
		while(it.hasNext()){
			System.err.println(it.next());
		}

	}

}
