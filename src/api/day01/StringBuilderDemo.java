package api.day01;

/**
 * java.lang.StringBuilder
 * StringBuilder是为了解决字符串修改带来的资源消耗问题，
 * 其内部维护一个可变的字符数组，所以每次修改在该数组中进行，而不是每次都创建一个对象。
 * StringBuilder提供了编辑字符串的相关方法：增、删、改、插
 * 
 *   
 *    
 *    
 *    StringBuffer 比 StringBuilder 多考虑了一个多线程下同时修改字符串的安全问题！！
 *    
 *    
 *    
 *     
 * @author Administrator
 *
 */

public class StringBuilderDemo {
	public static void main(String[] args) {
        String str="i love java";
        StringBuilder sb=new StringBuilder(str);
        
        sb.append(",4 instresting");
        System.out.println(sb.toString());
        
		sb.replace(12, 25, "4 change world");
		System.out.println(sb);
		
		sb.delete(0, 12);
		System.out.println(sb);
		
		sb.insert(0, "活着");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}

}
