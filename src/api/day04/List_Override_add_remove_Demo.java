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
	     * void add（int index，E e）
	     * 在指定位置追加元素
	     */
		list.add(2, "five");
		System.out.println(list);
		
		/**
		 * E remove(int index)
		 * 删除并返回指定位置的元素
		 * 
		 */
		String str=list.remove(2);    //还有个重载方法，删除指定对象 boolean remove（Object o）
		System.out.println(list);
		System.out.println(str);
		


	}

}
