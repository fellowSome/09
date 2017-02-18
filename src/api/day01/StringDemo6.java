package api.day01;

/**
 * boolean startWith(String str)
 * boolean endWith(String str)	
 * 判断当前字符串是否以给定的字符串开头或结尾
 * @author Administrator
 *
 */

public class StringDemo6 {
	public static void main(String[] args) {
		String str="thinking in java";
		boolean start=str.startsWith("thi");
		boolean end=str.endsWith("ava");
	}

}
