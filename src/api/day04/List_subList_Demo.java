package api.day04;
/**
 *  List<T> subList(int fromIndex,int toIndex)
 *  
 *  从指定List中截取出指定范围（含头不含尾）的List，
 *  截取后的子集拥有和父集占用相同的空间（seize不等），并且对子集的操作，会影响到父集
 */

import java.util.ArrayList;
import java.util.List;

public class List_subList_Demo {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<10;i++){
        	list.add(i);
        }
        System.out.println(list.toString());
        
        List<Integer> sublist=list.subList(3, 8);
        for(int i=0;i<sublist.size();i++){
        	sublist.set(i, sublist.get(i)*10);     //如果要从父集中删除，只需要把子集.clear();
        }
        System.out.println(sublist.toString());
        
        System.out.println(list.toString());
	}

}
