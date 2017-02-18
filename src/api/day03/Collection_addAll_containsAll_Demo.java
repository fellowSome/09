package api.day03;
/**
 * boolean addAll(E e)
 * 只要主集合中的元素发生变化就返回true；
 * 
 * boolean removeAll(E e)
 * 只要主集合中的元素发生变化就返回true;
 * 
 * 
 * boolean containsAll（E e）
 * 判断当前集合是否包含给定集合中所以元素，依equals比较呗
 * 
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Collection_addAll_containsAll_Demo {

	public static void main(String[] args) {
		Collection co=new HashSet();
		co.add("java");
		co.add("c");
		co.add("c++");
		
		Collection co2=new ArrayList();
		co2.add("java");
		co2.add("php");
		co2.add("js");
		co2.add("java");
		
		co.addAll(co2);
		System.out.println(co);   //输出：[c++, java, c, php, js]
		                          //虽然co2中的“java”没有加进去，但照样返回true，
		                          //因为co中的元素发生了变化
		
		Collection co3=new ArrayList();
		co3.add("java");
		co3.add("php");
		co3.add("python");
		
		co.removeAll(co3);
		System.out.println(co);   //虽然co中没有“python”，但co中的元素发生了变化，返回true；
		                           //而且可以删除多次出现的元素java
        
		System.out.println(co.containsAll(co3));
	}

}
