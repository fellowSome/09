package api.day03;

import java.util.ArrayList;
import java.util.Collection;

import api.day02.Point;

/**
 * java.util.Collection
 * 集合
 * 集合用于存储一组元素，与数组作用类似，
 * Collection是所以集合的父接口，规定了集合所应当具备的功能。
 * Collection下面有两个子类型的接口.
 * java.util.List:可重复集。
 * java.util.Set:不可重复集。
 * 元素是否重复是依靠自身的equals比较的结果，即Set集不能同时存放两个equals比较为true的元素
 * @author Administrator
 *
 */

public class Collection_add_clear_isEmpty_Demo {

	public static void main(String[] args) {
		/**
		 * boolean add(E e)
		 * 向集合中添加给定元素，若成功则返回true
		 */
		Collection co=new ArrayList();
        co.add("one");
        co.add("two");
        co.add("three");
        co.add("four");
        System.out.println(co);
        
        /**
         * boolean contains(E e)
         * 判断集合是否包含给定元素
         */
        co.add(new Point(1,2));
        co.add(new Point(2,3));
         System.out.println(co.contains(new Point(1,2)));   //contains用equals进行判断
        
        
        /**
         * int size();
         * 返回集合中元素的个数
         */
        System.out.println("size:"+co.size());
        
        /**
         * boolean isEmpty() ,集合为空与null不是一回事
         */
        System.out.println("isEmpty:"+co.isEmpty());
        
        /**
         *  clear（） 清空集合
         */
        co.clear();
        System.out.println("size:"+co.size());
        System.out.println("isEmpty:"+co.isEmpty());
        
        
	}

}
