package api.day05;

/**
 * ������ȣ�hashcodeһ����
 * ���󲻵ȣ�hashcodeͨ������
 * 
 * hashcode����Ϊ��ɢ�б��㷨����Ƶķ���
 * 
 * �ؼ��㣺
 *   1.ɢ�б��ÿ�
 *   2.Ϊ�˱�֤ɢ�б�������������Ϊkey�Ķ�����룺
 *      -ʵ��hashCode
 *      -ʵ��equals
 * @author Administrator
 *
 */
public class HashCode_Demo {

	public static void main(String[] args) {
		 String str1="abc";
		 String str2="def";
		 String str3=new String("abc");
		 Integer a=9;
		 System.out.println(a.hashCode());
		 System.out.println(str1.hashCode());
		 System.out.println(str2.hashCode());
		 System.out.println(str3.hashCode());
		 
		 Point p=new Point(a, a);
		 int pc=p.hashCode();
		 System.out.println(pc);
	}

}
