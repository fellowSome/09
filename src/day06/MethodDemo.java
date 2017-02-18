package day06;

public class MethodDemo {

	public static void main(String[] args) {
		
     int a=getNum();
     System.out.println(a);	
     
     double db=plus(1,2);
     System.out.println(db);
	}
	public static int getNum(){
		return 1;		
	}
	public static double plus(double num1,double num2){
		return num1+num2;
	}

}
