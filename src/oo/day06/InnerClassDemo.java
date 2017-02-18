package oo.day06;

public class InnerClassDemo {
   public static void main(String[] args){
	   Mama m=new Mama();
	  // Baby b=new Baby();
   }
}
class Mama{
	private String name="aa";
	Baby createBaby(){
		return new Baby();
	}
	class Baby{
		void showMamaName(){
			System.out.println(name);
			System.out.println(Mama.this.name);
		}
	}
	
}
