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
			System.out.println(s);     //��ת���󼯺ϵĲ�����Ӱ�쵽ԭ���ļ���
		}
		
		//list.add("five");    ���б��������Ƕ����ġ���������newһ��list�������
        List<String> list1=new ArrayList<String>(list);
        list1.add("five");
	}

}
