package api.day02;

	/**
	 * ��������֮��װ��
	 * 1.��װ����valueOf����
	 * 2.�������xxxValue����
	 * 
	 * �������Ͱ�װ�����������
	 * MAX_VALUE;
	 * MIN_VALUE;
	 * 
	 * �Զ���װ��
	 * �������ڱ���Դ��ʱ�Զ���ȫ���룬
	 * ��������������������֮���໥ת����
	 * �����Զ���װ�������Ǳ������Ͽɲ���������Ͽ�
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
           
           i=new Integer(123);  //���ڰ汾���б���1.5�Ժ���������Զ���װ�䣨����i=new Integer(123).intValue();)
           Integer itg=i;

	}

}
