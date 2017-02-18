package api.day03;

import java.util.ArrayList;
import java.util.Collection;
import api.day02.Point;

/**
 * 删除集合中的元素
 * 
 * boolean remove(E e)
 * 通过元素的equals比较进行删除，
 * 只删除集合中第一次比较（顺序比较）成功的元素，
 * 一次只删除一个元素。
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
