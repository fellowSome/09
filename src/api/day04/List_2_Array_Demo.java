package api.day04;

/**
 * 
 */
import java.util.ArrayList;
import java.util.List;

public class List_2_Array_Demo {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		
	    //list.toArray() ,���ص���Obeject����,���Ƽ���
		String[] str=list.toArray(new String[list.size()]);
		for(String s:str){
			System.out.println(s);
		}

	}

}
