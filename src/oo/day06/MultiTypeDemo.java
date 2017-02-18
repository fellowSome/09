package oo.day06;

public class MultiTypeDemo {

	public static void main(String[] args) {
		Aoo o1=new Boo();
		Boo o2=(Boo)o1;
		Inter1 o3=(Inter1)o1;
		//Coo o4=(Coo)o1;  //±¨´í
		if(o1 instanceof Inter1){
			System.out.println("o1 is a instanceof Inter1");
		}
		System.out.println("over");
	}
}
interface Inter1{
	
}
class Aoo{
	
}
class Boo extends Aoo implements Inter1{
	
}
class Coo extends Aoo{
	
}

