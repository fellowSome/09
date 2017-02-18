package api.day04;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List
 * 可重复集，并且有序
 * 特点是可以根据下标操作元素
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
		 * 在最后追加一个元素（有重载方法，在指定位置插入元素）
		 * 
		 * E get(int index)
		 * 获取集合中对应位置的元素
		 * 
		 */
		list.add("five");
		System.out.println(list.get(1));
		System.out.println(list.toString());
        /**
         * E set(int index,E e）
         * 替换指定位置的元素，返回被替换的元素
         */
		list.set(3,"3");
		System.out.println(list.toString());
	}

}
