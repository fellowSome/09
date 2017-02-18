package AnnotationDemo;

import AnnotationDemo.FruitColor.Color;

public class Apple {
	@FruitName("Apple")
	private String appleName;
	
	@FruitColor(fruitColor=Color.GREEN)
	private String appleColor;
	
	@FruitProvider(id=1,name="�츻ʿ����",address="����ʡ�������Ӱ�·89�ź츻ʿ����")
	private String appleProvider;
	public String getAppleName() {
		return appleName;
	}
	public void setAppleName(String appleName) {
		this.appleName = appleName;
	}
	public String getAppleColor() {
		return appleColor;
	}
	public void setAppleColor(String appleColor) {
		this.appleColor = appleColor;
	}
	public String getAppleProvider() {
		return appleProvider;
	}
	public void setAppleProvider(String appleProvider) {
		this.appleProvider = appleProvider;
	}
    
	public void displayName(){
		System.out.println("ˮ����������ƻ��");
	}
	

}
