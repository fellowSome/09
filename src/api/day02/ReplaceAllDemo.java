package api.day02;
/**
 * 
 * String replaceAll(String regex,String str)
 * 将当前字符串中满足正则表达式的，替换成给定的部分
 * @author Administrator
 *
 */

public class ReplaceAllDemo {

	public static void main(String[] args) {
		String str="123abc456defks789";
		str=str.replaceAll("[\\d]+","##NUMBER##");
		System.out.println(str);
		
		str=str.replaceAll("[a-zA-Z]+","#char#");
		System.out.println(str);

	}

}
