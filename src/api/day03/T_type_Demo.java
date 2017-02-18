package api.day03;



/**
 * ���ͣ��ֳ�Ϊ����������
 * ������java1.5֮���Ƴ���������
 * ����������ǰ����������͡��������͡���������ֵ�����ƽ���ʹ���ߣ�
 * 
 * ���͵�ʵ��������Object
 * �ڶԷ��͸�ֵʱ�������������ֵ�Ƿ����ڷ�����ʵ�����ͣ������������ͨ����
 * ����ȡһ�����͵�ֵʱ���������Ჹ��ǿ��ת������
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
		
		Point p2=pi;     //��ָ��p2�����ͣ���Ĭ��Ϊԭ��Object
		System.out.println("p2:"+p2);
		p2.setX("һ");
		System.out.println("pi:"+pi);
		System.out.println("p2"+p2);
		
		//  int x=pi.getX();   ǿ��ת������
		
		
		
		
	}
}
