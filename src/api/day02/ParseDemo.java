package api.day02;
/**
 * 包装类都支持一个静态方法parseXXX(String s）
 * 可以将给定的字符串转换成相应的基本类型，
 * 但是有个前提条件，就是该字符串的内容必须能正确的描述该基本类型可以保存的值。
 * @author Administrator
 *
 */

public class ParseDemo {

	public static void main(String[] args) {
		String str="124";
		int i=Integer.parseInt(str);
		System.out.println(i+3);
		
		double d=Double.parseDouble(str);
		System.out.println(d);
		
		
		

	}

}
