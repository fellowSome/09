package api.day05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * HashMap����
 * 
 * @author Administrator
 *
 */
public class HashMap_itrator_Demo {

	public static void main(String[] args) {

         Map<String,String> map=new HashMap<String,String>();   //��LinkedHashMap�ܹ���ס���˳��
         map.put("1", "yi");
         map.put("2", "er");
         map.put("3", "san");
         map.put("4", "si");
         //��һ�ֱ���
         Set<Entry<String,String>> set=map.entrySet();   // ֵ��ע��һ�¹�
         Iterator<Entry<String,String>> it=set.iterator();   //ע��
         while(it.hasNext()){
        	 Entry<String,String> en=it.next();
        	 System.out.println(en.getKey()+":"+en.getValue());
         }
         
         //�ڶ��ֱ���
         Set<String> setk=map.keySet();
         Iterator<String> i=setk.iterator();
         while(i.hasNext()){
        	 String key=i.next();
        	 String value=map.get(key);
        	 System.out.println(key+"-"+value);
         }
	}

}
