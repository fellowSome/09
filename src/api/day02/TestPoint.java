package api.day02;

/**
 * 
 * 
 * 
 * 
 *
 * @author Administrator
 *
 */
public class TestPoint {

	public static void main(String[] args) {
		Point p=new Point(0, 2);
		Point p2=new Point(0,2);
		/**
		 * 句柄
		 */
        System.out.println(p.equals(p2));  //  api.day02.Point@19e0bfd 
                                           //    @后面是以哈希值表现的句柄（句柄就是对象的地址）
        
	}
	

}
