package api.day03;
import api.day02.Point;
import java.util.ArrayList;
import java.util.Collection;

/**
 * ������Ԫ�������õ�
 * 
 * @author Administrator
 *
 */
public class Collection_valid_ref_Demo {

	public static void main(String[] args) {
		 Collection co=new ArrayList();
		 Point p=new Point(1,2);
		 co.add(p);
		 System.out.println("co:"+co);
		 System.out.println("p:"+p);
		 
		 p.setX(5);
		 
		 System.out.println("co"+co);
		 System.out.println("p:"+p);
		 
	}

}
