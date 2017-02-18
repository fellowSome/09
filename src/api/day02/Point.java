package api.day02;

/**
 * Object.toString();
 * Object�����toString���������ص��ַ����Ǹö���ľ��
 * ���������@��ַ  ���Ƕ����������Ϣ
 * ʵ�ʶԿ���ûʲô���������Ե�������Ҫʹ��һ�������toString����ʱ��
 * Ӧ����д�÷���
 */

/**Object.equals();
* Object�����equals�������������á�==���Ƚϵģ�
* ����ϣ���Ƚ���������������Ƿ����(����Ҫ����������ֵ��һ�£���ʵ���������)��
* Ӧ����дequals()����������û����
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
