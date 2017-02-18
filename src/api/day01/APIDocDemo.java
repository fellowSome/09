package api.day01;

/**
 * 文档注释可以定义在类，常量，方法上 用于说明功能。
 * 
 * @author higer
 * @version 1.0.7 06/09/2017
 * @see java.lang.String
 * @since jdk1.8
 *
 */

public class APIDocDemo {
	/**
	 * sayHello方法中的问候语
	 */
	public static final String INFO = "你好";

	/**
	 * 
	 * @param name
	 *            给定的用户名
	 * @return 带有问候语的字符串
	 * 
	 */
	public static String sayHello(String[] name) {
		return INFO+name;

	}
	/**
	 * 字符串是不变对象，即：内容一旦被创建不可更改，若改变内容，一定创建先对象
	 * 当使用字面量形式创建字符串对象时，虚拟机会重用内容一样的已创建的字符串对象
	 * 
	 * 编译器在编译源码时，发现一个计算表达式计算符两边都是字面量（直接量）时，会
	 * 直接计算，并将结果编译到.class中，不影响运行性能。
	 * @
	 */
	public static void main(String[] args){
		String s1="123abc";
		String s2="123abc";
		String s3=new String("123abc");
		System.out.println(s1==s2);   //true;
		System.out.println(s1==s3);   //False
		
		String s4="123"+"abc";    //编译器在编译时，对参与运算的字面量进行预处理成“123abc”，因此类似这样的全都是字面量的运算不影响性能；若有变量参与则不会这样处理
		System.out.println(s2==s4);   //true;
		
		String s5="123";
		String s6=s5+"abc";         //有变量参与
		System.out.println(s2==s6);  //False;
	}
}
