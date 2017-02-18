package api.day01;

/**
 * �ĵ�ע�Ϳ��Զ������࣬������������ ����˵�����ܡ�
 * 
 * @author higer
 * @version 1.0.7 06/09/2017
 * @see java.lang.String
 * @since jdk1.8
 *
 */

public class APIDocDemo {
	/**
	 * sayHello�����е��ʺ���
	 */
	public static final String INFO = "���";

	/**
	 * 
	 * @param name
	 *            �������û���
	 * @return �����ʺ�����ַ���
	 * 
	 */
	public static String sayHello(String[] name) {
		return INFO+name;

	}
	/**
	 * �ַ����ǲ�����󣬼�������һ�����������ɸ��ģ����ı����ݣ�һ�������ȶ���
	 * ��ʹ����������ʽ�����ַ�������ʱ�����������������һ�����Ѵ������ַ�������
	 * 
	 * �������ڱ���Դ��ʱ������һ��������ʽ��������߶�����������ֱ������ʱ����
	 * ֱ�Ӽ��㣬����������뵽.class�У���Ӱ���������ܡ�
	 * @
	 */
	public static void main(String[] args){
		String s1="123abc";
		String s2="123abc";
		String s3=new String("123abc");
		System.out.println(s1==s2);   //true;
		System.out.println(s1==s3);   //False
		
		String s4="123"+"abc";    //�������ڱ���ʱ���Բ������������������Ԥ����ɡ�123abc�����������������ȫ���������������㲻Ӱ�����ܣ����б��������򲻻���������
		System.out.println(s2==s4);   //true;
		
		String s5="123";
		String s6=s5+"abc";         //�б�������
		System.out.println(s2==s6);  //False;
	}
}
