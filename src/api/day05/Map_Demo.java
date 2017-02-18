package api.day05;

import java.util.ArrayList;
/**
 * java.util.Map
 * 
 * Map���ڿ��ٲ��ң�����֤˳��
 */
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_Demo {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value4");
		
		System.out.println(map);
	    //����put����
		String value=map.put("key5", "value2"); 
		System.out.println(value);      //key5���ظ�������null
		value=map.put("key1", "value8");
		System.out.println(value);      //key1�ظ������ر��滻��valueֵ
		
		//����get����
		System.out.println(map.get("key3"));  //key3���ڣ�������ֵvalue3
		System.out.println(map.get("key6"));  //key6�����ڣ�����null
		
		//���� boolean containsKey(key) �� boolean containsValue(value)
        System.out.println(map.containsKey("key2"));
        System.out.println(map.containsValue("value2"));
        
        //�������÷���
        /**
         *   int size()
         *   boolean isEmpty()
         */
        
        //���� HashMap �� ArrayList�Ĳ����ٶ�
        List<String> list=new ArrayList<String>();
        Map<String,Integer> map1=new HashMap<String,Integer>();
        for(int i=0;i<200000;i++){
        	list.add(Integer.toString(i));
        	map1.put(Integer.toString(i), i);
        }
        long ls=System.nanoTime();
        int i= list.indexOf("88888");
        long le=System.nanoTime();
        System.out.println(le-ls);
        
        ls=System.nanoTime();
        map1.get("88888");
        le=System.nanoTime();
        System.out.println(le-ls); 
	}

}
