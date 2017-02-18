package api.day03;



/**
 * 泛型，又称为参数化类型
 * 泛型是java1.5之后推出的新特性
 * 泛型允许将当前类的属性类型、参数类型、方法返回值类型移交给使用者，
 * 
 * 泛型的实际类型是Object
 * 在对泛型赋值时，编译器会检查该值是否属于泛型是实际类型，不符合则编译通不过
 * 当获取一个泛型的值时，编译器会补充强制转换代码
 * 
 * @author Administrator
 *
 */
class Point<T,Q> {

	private T x;
	private Q y;
	public Point(){
		
	}
	public Point(T x, Q y) {
		super();
		this.x = x;
		this.y = y;
	}
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public Q getY() {
		return y;
	}
	public void setY(Q y) {
		this.y = y;
	}
	public String toString(){
		return "("+x+","+y+")";
	}

}


public class T_type_Demo{
	public static void main(String[] args){
		Point<Integer,String> pi=new Point<Integer,String>();
		pi.setX(1);
		pi.setY("2");
		System.out.println(pi);
		
		Point p2=pi;     //不指定p2的类型，就默认为原型Object
		System.out.println("p2:"+p2);
		p2.setX("一");
		System.out.println("pi:"+pi);
		System.out.println("p2"+p2);
		
		//  int x=pi.getX();   强制转换报错
		
		
		
		
	}
}
