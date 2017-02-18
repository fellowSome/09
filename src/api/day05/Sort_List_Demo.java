package api.day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_List_Demo {

	public static void main(String[] args) {
		List<Point> list=new ArrayList<Point>();
        list.add(new Point(3,4));
        list.add(new Point(1,4));
        list.add(new Point(2,2));
        list.add(new Point(2,4));
        /**
         * Collections��sort����Ҫ�󼯺�Ԫ�ر���ʵ��Comparable�ӿ�
         */
        Collections.sort(list);    //�����ԣ����ۣ���Ϊ���Ÿ��򣬼����е�Ԫ�ػ�Ҫȥʵ��һ���ӿڣ�
        System.out.println(list);
	}

}
class Point implements Comparable<Point>{
	private int x;
	private int y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String toString(){
		return "("+this.x+","+this.y+")";
		
	}
	
	@Override
	/**
	 * ����ֵ�����Ƕ��ٲ���Ҫ����Χ����Ҫ��
	 * ����ֵ>0��this>o��
	 * ����ֵ<0��this<o,
	 * ����ֵ=0��this==o
	 */
	public int compareTo(Point o) {
	    int len=this.x*this.x+this.y*this.y;
	    int olen=o.x*o.x+o.y*o.y;
		return len-olen;
	}
}
