package api.day01;

/**
 * int indexOf��String str)
 * indexOf�������ظ����ַ����ڵ�ǰ�ַ����е�λ�ã��±꣩
 * ����ǰ�ַ����������������ݣ��򷵻�-1��
 * @author Administrator
 *
 */

public class StringDemo2 {
	public static void main(String[] args) {
         String str ="thinking in java";
         int index=str.indexOf("in");
         System.out.println(index); //2
         
         index=str.indexOf("in",3);
         System.out.println(index);  //5
         
         index=str.indexOf(105,3);    //105��Ӧ���ַ��ǡ�i��
         System.out.println(index);   // 5
         
         index=str.lastIndexOf("in");
         System.out.println(index);   //9
		
	}

}
