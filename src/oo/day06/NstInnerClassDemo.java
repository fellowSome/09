package oo.day06;
//匿名内部类
public class NstInnerClassDemo {

	public static void main(String[] args) {
		final int num=5;
		
		//1.创建Inter2的一个子类，但没有名字
		//2.为该子类创建了一个对象 ，叫 o1
		//3.大括号中是子类的类体
		Inter2 o1=new Inter2(){};
	
		Inter3 o3=new Inter3(){
			public void show() {
				System.out.println(num);
				System.out.println("abc");
			}
			
		};
		o3.show();

	}

}
interface Inter3{
	void show();
}
interface Inter2{
	
}