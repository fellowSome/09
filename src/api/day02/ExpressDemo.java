package api.day02;

import java.beans.Expression;

/**
 * boolean matches(String regex)
 * ʹ�ø�����������ʽ���ص�ǰ�ַ����Ƿ�����Ҫ��
 * @author Administrator
 *
 */
public class ExpressDemo {

	public static void main(String[] args) {
		/**
		 * ƥ������
		 * 
		 * Email   fan_q@tedu.cn
		 * 
		 */
		String email="fancq@tedu.cn";
		String reg="[\\w_]+@[\\w_]+(\\.[a-zA-Z]+)+";
		boolean ms=email.matches(reg);
		System.out.println(ms);
		
		/**
		 * ƥ��8��10δ��ĸ�����ֵ����
		 */
		reg="\\w{8,10}";
		email="12345678ws";
	    ms=email.matches(reg);
	    System.out.println(ms);
	    
	    
	}

}
