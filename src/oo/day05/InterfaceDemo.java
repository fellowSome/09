package oo.day05;

public class InterfaceDemo {
	public static void main(String[] args){
	
	}

}
interface Inter1{
	double PI=3.14;
	abstract void show();
}
interface Inter2{
	int a();
	String b();
}
interface Inter3{
	double c();
}
class Aoo implements Inter2{
	public int a(){
		return 0;
		
	}
	public String b(){
		return null;
		
	}
}
class Boo implements Inter2,Inter3{
	public int a(){
		return 0;
		
	}
	public String b(){
		return null;
		
	}
	public double c(){
		return 0;
	}
}
abstract class Coo{
	 abstract void d();
}
abstract class Doo extends Coo implements Inter2,Inter3{
	void d(){
		
	}
	public int a(){
		return 0;
		
	}
	public String b(){
		return null;
		
	}
	public abstract double c();
}
interface Inter4 extends Inter3{
	void e();
}
class Eoo implements Inter4{
	public double c(){
		return 0;
		
	}
	public void e(){
		
	}
}
