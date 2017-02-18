package api.day02;

	/**
	 * 基本类型之包装类
	 * 1.包装方法valueOf（）
	 * 2.解包方法xxxValue（）
	 * 
	 * 基本类型包装类的两个常量
	 * MAX_VALUE;
	 * MIN_VALUE;
	 * 
	 * 自动拆装箱
	 * 编译器在编译源码时自动补全代码，
	 * 将基本类型与引用类型之间相互转换，
	 * 所以自动拆装箱特性是编译器认可不是虚拟机认可
	 * @author Administrator
	 *
	 */
public class DerectorDemo {

	public static void main(String[] args) {
           int i=127;
           double d=123.456;
           Integer in=Integer.valueOf(i);
           Double di=Double.valueOf(d);
          
           int ii=in.intValue();
           double dd=di.doubleValue();
           ii=di.intValue();
           
           i=new Integer(123);  //早期版本此行报错，1.5以后编译器会自动拆装箱（即，i=new Integer(123).intValue();)
           Integer itg=i;

	}

}
