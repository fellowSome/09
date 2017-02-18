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
         * Collections的sort方法要求集合元素必须实现Comparable接口
         */
        Collections.sort(list);    //侵入性（代价），为了排个序，集合中的元素还要去实现一个接口！
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
	 * 返回值具体是多少不重要，范围才重要：
	 * 返回值>0，this>o，
	 * 返回值<0，this<o,
	 * 返回值=0，this==o
	 */
	public int compareTo(Point o) {
	    int len=this.x*this.x+this.y*this.y;
	    int olen=o.x*o.x+o.y*o.y;
		return len-olen;
	}
}
