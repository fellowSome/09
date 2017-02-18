package oo.day05;

public class ShapTest {

	public static void main(String[] args) {
		Shape[] shapes =new Shape[6];
		shapes[0]=new Square(2);
		shapes[1]=new Square(4);
		shapes[2]=new Square(3);
		shapes[3]=new Circle(2);
		shapes[4]=new Circle(6);
		shapes[5]=new Circle(5);
        maxArea(shapes);
	}
	static void  maxArea(Shape[] sh){
		double max=sh[0].area();
		int j=0;
		for(int i=1;i<sh.length;i++){
			if(max<sh[i].area())
				max=sh[i].area();
			    j=i;
		}
		System.out.println("max area is "+max+", and index is "+j);
	}

}
abstract class Shape{
	protected double c;
	public abstract double area();
}
class Square extends Shape{
	Square(double c){
		this.c=c;
	}
	public  double area(){
		return 0.0625*c*c;
		
	}
}
class Circle extends Shape{
	Circle(double c){
		this.c=c;
	}
	public  double area(){
		return 0.0719*c*c;
		
	}
}
