package api.day01;

/**
 * String substring(int start,int end)
 * java API�и��ص㣬
 * ͨ��ʹ���������ֱ�ʾһ����Χʱ��
 * ���Ǻ�ͷ����β
 * @author Administrator
 *
 */

public class StringDemo3 {
	public static void main(String[] args) {
        String str="www.oracle.com";
        String host=str.substring(4,10);
        System.out.println(host);
        
        System.out.println(str.length());     //14
        String outOfIndex=str.substring(14);  //�����14��ʼ�����ֵ����15��ʼ�ͱ���
        System.out.println(outOfIndex);
        
        
	}

}
