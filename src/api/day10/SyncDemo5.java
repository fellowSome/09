package api.day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *  将集合 或 Map转换成线程安全的，
 *  
 *  API手册上有说明
 *  就算是线程安全的集合在增、删时不与迭代器遍历做互斥，需要自行维护互斥关系。
 * 
 * @author Administrator
 *
 */
public class SyncDemo5 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		//将给定的集合转换成线程安全的集合
		list=Collections.synchronizedList(list);
		System.out.println(list);
		
		Set<String> set=new HashSet<String>(list);   //new 一个集合的同时，把另一个集合的元素添加进来
		set=Collections.synchronizedSet(set);
		System.out.println(set);
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("语文", 97);
		map.put("数学", 100);
		map.put("英语", 99);
		map.put("计算机", 100);
		map=Collections.synchronizedMap(map);
		System.out.println(map);
		

	}

}
