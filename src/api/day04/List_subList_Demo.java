package api.day04;
/**
 *  List<T> subList(int fromIndex,int toIndex)
 *  
 *  ��ָ��List�н�ȡ��ָ����Χ����ͷ����β����List��
 *  ��ȡ����Ӽ�ӵ�к͸���ռ����ͬ�Ŀռ䣨seize���ȣ������Ҷ��Ӽ��Ĳ�������Ӱ�쵽����
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
        	sublist.set(i, sublist.get(i)*10);     //���Ҫ�Ӹ�����ɾ����ֻ��Ҫ���Ӽ�.clear();
        }
        System.out.println(sublist.toString());
        
        System.out.println(list.toString());
	}

}
