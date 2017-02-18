package api.day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collections的重载方法sort（），需要去提供一个额外的比较器来，对集合中的元素进行自定义排序，
 * 这种方法更常用，因为她有两个好处：
 * 
 * 1.不使用元素自身的比较规则，而且是单独提供，这样能更好的满足排序需求
 * 2.由于提供了比较器，该sort方法不再要求集合中的元素去实现Comparable接口，对元素减少了
 *   侵入性
 *   
 * 侵入性：当我们要求使用某个功能，而该功能要求我们为其修改的代码越多，侵入性越强。侵入性简单理解为代价。
 * 侵入性强的功能不利于程序扩展。
 * @author Administrator
 *
 */
public class Sort_List_Demo2 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		//英文字符串排序,按先大写后小写的字符编码排序
		list.add("jack");
		list.add("rose");
		list.add("tom");
		list.add("jarry");
		list.add("Kobe");
		list.add("James");
		list.add("Lyn");
		list.add("peter");
		
		Collections.sort(list);  
		System.out.println(list);
		
		list.clear();
		
		//中文字符串排序,要用到Collections的sort（list,Comparator）重载方法
		list.add("小泽老师");
		list.add("苍老师");
		list.add("范老师");
		
		Collections.sort(list,new Comparator<String>(){       //比sort（list）的侵入性小，而且灵活。

			@Override
			public int compare(String o1, String o2) {
				//自定义比较规则：字符数量多的大			
				return o1.length()-o2.length() ;
			}
			
		});
		System.out.println(list);

	}

}
