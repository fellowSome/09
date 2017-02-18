package api.day05;

import java.util.ArrayList;
/**
 * java.util.Map
 * 
 * Map用于快速查找，不保证顺序。
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
	    //测试put方法
		String value=map.put("key5", "value2"); 
		System.out.println(value);      //key5不重复，返回null
		value=map.put("key1", "value8");
		System.out.println(value);      //key1重复，返回被替换的value值
		
		//测试get方法
		System.out.println(map.get("key3"));  //key3存在，返回其值value3
		System.out.println(map.get("key6"));  //key6不存在，返回null
		
		//测试 boolean containsKey(key) 与 boolean containsValue(value)
        System.out.println(map.containsKey("key2"));
        System.out.println(map.containsValue("value2"));
        
        //其他常用方法
        /**
         *   int size()
         *   boolean isEmpty()
         */
        
        //测试 HashMap 与 ArrayList的查找速度
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
