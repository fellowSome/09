package api.day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *  ������ �� Mapת�����̰߳�ȫ�ģ�
 *  
 *  API�ֲ�����˵��
 *  �������̰߳�ȫ�ļ���������ɾʱ������������������⣬��Ҫ����ά�������ϵ��
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
		//�������ļ���ת�����̰߳�ȫ�ļ���
		list=Collections.synchronizedList(list);
		System.out.println(list);
		
		Set<String> set=new HashSet<String>(list);   //new һ�����ϵ�ͬʱ������һ�����ϵ�Ԫ����ӽ���
		set=Collections.synchronizedSet(set);
		System.out.println(set);
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("����", 97);
		map.put("��ѧ", 100);
		map.put("Ӣ��", 99);
		map.put("�����", 100);
		map=Collections.synchronizedMap(map);
		System.out.println(map);
		

	}

}
