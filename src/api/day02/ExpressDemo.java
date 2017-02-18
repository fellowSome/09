package api.day02;

import java.beans.Expression;

/**
 * boolean matches(String regex)
 * 使用给定的正则表达式严重当前字符串是否满足要求
 * @author Administrator
 *
 */
public class ExpressDemo {

	public static void main(String[] args) {
		/**
		 * 匹配邮箱
		 * 
		 * Email   fan_q@tedu.cn
		 * 
		 */
		String email="fancq@tedu.cn";
		String reg="[\\w_]+@[\\w_]+(\\.[a-zA-Z]+)+";
		boolean ms=email.matches(reg);
		System.out.println(ms);
		
		/**
		 * 匹配8到10未字母和数字的组合
		 */
		reg="\\w{8,10}";
		email="12345678ws";
	    ms=email.matches(reg);
	    System.out.println(ms);
	    
	    
	}

}
