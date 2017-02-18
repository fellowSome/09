package api.day03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Iterator 迭代器接口
 * 
 * Collection中用于遍历集合元素的工具
 * 
 * Iterator iterator() 该方法获取一个可以遍历当前集合的迭代器实现类
 * 
 * java.util.Iterator 迭代器接口，规定了遍历集合的相关方法， 所以的集合都实现类一个实现了Iterator接口的实现类来来遍历自身元素，
 * 我们无需记住每个计划提供的迭代器实现类的名字，只将他们当做Iterator这个接口看待即可。
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
				// c.remove(str); 迭代器在遍历集合时，不能用集合的方法删除元素，易报错
				it.remove();
			} else {
				System.out.println(str);
			}
		}

	}

}
