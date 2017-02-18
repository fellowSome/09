package AnnotationDemo;

import java.lang.reflect.Field;

public class FruitInfoUtil {
    public static void getFruitInfo(Class<?> clazz){
    	String strFruitName="ˮ�����ƣ�";
    	String strFruitColor="ˮ����ɫ��";
    	String strFruitProvider="ˮ���ṩ�̣�";
    	
    	Field[] fields=clazz.getDeclaredFields();
    	System.out.println(fields.length);
    	
    	for(Field field:fields){
    		  if(field.isAnnotationPresent(FruitName.class)){
    			  FruitName fn=field.getAnnotation(FruitName.class);
    			  strFruitName+=fn.value();
    			  System.out.println(strFruitName);
    		  }else if(field.isAnnotationPresent(FruitColor.class)){
    			  FruitColor fc=(FruitColor)field.getAnnotation(FruitColor.class);
    			  strFruitColor+=fc.fruitColor();
    			  System.out.println(strFruitColor);
    		  }else if(field.isAnnotationPresent(FruitProvider.class)){
    			  FruitProvider fp=(FruitProvider)field.getAnnotation(FruitProvider.class); 
    			  strFruitProvider+=fp.id()+fp.name()+fp.address();
    			  System.out.println(strFruitProvider);
    		  }
    	}
    }
}
