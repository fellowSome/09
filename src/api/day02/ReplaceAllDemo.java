package api.day02;
/**
 * 
 * String replaceAll(String regex,String str)
 * ����ǰ�ַ���������������ʽ�ģ��滻�ɸ����Ĳ���
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
