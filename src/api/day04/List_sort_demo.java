package api.day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *  Collection�ӿڵĹ�����Collections�и�sort������
 *  ����С�����˳������������
 *  
 *  Collections����һ�����򷽷�stuffle()
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
		
		//����
		Collections.shuffle(list);
		System.out.println(list);
		

	}

}
