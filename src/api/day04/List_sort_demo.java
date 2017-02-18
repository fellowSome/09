package api.day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *  Collection接口的工具类Collections有个sort方法，
 *  按从小到大的顺序重新整理集合
 *  
 *  Collections还有一个乱序方法stuffle()
 * @author Administrator
 *
 */
public class List_sort_demo {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		Random rd=new Random();
		
		for(int i=0;i<10;i++){
			int k=rd.nextInt(100);
			list.add(k);
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		//乱序
		Collections.shuffle(list);
		System.out.println(list);
		

	}

}
