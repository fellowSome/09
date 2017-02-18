package api.day05;

/**
 * 对象相等，hashcode一样，
 * 对象不等，hashcode通常不等
 * 
 * hashcode就是为了散列表算法而设计的方法
 * 
 * 关键点：
 *   1.散列表查得快
 *   2.为了保证散列表正常工作，作为key的对象必须：
 *      -实现hashCode
 *      -实现equals
 * @author Administrator
 *
 */
public class HashCode_Demo {

	public static void main(String[] args) {
		 String str1="abc";
		 String str2="def";
		 String str3=new String("abc");
		 Integer a=9;
		 System.out.println(a.hashCode());
		 System.out.println(str1.hashCode());
		 System.out.println(str2.hashCode());
		 System.out.println(str3.hashCode());
		 
		 Point p=new Point(a, a);
		 int pc=p.hashCode();
		 System.out.println(pc);
	}

}
