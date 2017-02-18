package api.day05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * HashMap遍历
 * 
 * @author Administrator
 *
 */
public class HashMap_itrator_Demo {

	public static void main(String[] args) {

         Map<String,String> map=new HashMap<String,String>();   //而LinkedHashMap能够记住添加顺序
         map.put("1", "yi");
         map.put("2", "er");
         map.put("3", "san");
         map.put("4", "si");
         //第一种遍历
         Set<Entry<String,String>> set=map.entrySet();   // 值得注意一下哈
         Iterator<Entry<String,String>> it=set.iterator();   //注意
         while(it.hasNext()){
        	 Entry<String,String> en=it.next();
        	 System.out.println(en.getKey()+":"+en.getValue());
         }
         
         //第二种遍历
         Set<String> setk=map.keySet();
         Iterator<String> i=setk.iterator();
         while(i.hasNext()){
        	 String key=i.next();
        	 String value=map.get(key);
        	 System.out.println(key+"-"+value);
         }
	}

}
