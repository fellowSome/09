package api.day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_2_List_Demo {

	public static void main(String[] args) {
		String[] str={"one","two","three","four"};
		List<String> list=Arrays.asList(str);
		System.out.println(list.toString());
		
		list.set(1, "2");
		System.out.println(list);
		for(String s:str){
			System.out.println(s);     //对转换后集合的操作，影响到原来的集合
		}
		
		//list.add("five");    运行报错，数组是定长的。可以重新new一个list再添加嘛
        List<String> list1=new ArrayList<String>(list);
        list1.add("five");
	}

}
