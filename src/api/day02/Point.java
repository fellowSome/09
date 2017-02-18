package api.day02;

/**
 * Object.toString();
 * Object定义的toString方法，返回的字符串是该对象的句柄
 * 句柄：类名@地址  就是对象的引用信息
 * 实际对开发没什么帮助，所以当我们需要使用一个对象的toString方法时，
 * 应该重写该方法
 */

/**Object.equals();
* Object定义的equals（）方法就是用“==”比较的，
* 所以希望比较两个对象的内容是否相等(并不要求所有属性值都一致，视实际需求而定)，
* 应当重写equals()方法，否则没意义
*/
public class Point {
	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString() {
		return "(" + x + "," + y + ")";

	}
	public boolean equals(Object o){
		if(o==null){
			return false;
		}
		if(o==this){
			return true;
		}
		if(o instanceof Point){
			Point p=(Point)o;
			return this.x == p.x && this.y == p.y;      
		}
		return false;
	}
}
