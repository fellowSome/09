package api.day01;

/**
 * java.lang.StringBuilder
 * StringBuilder��Ϊ�˽���ַ����޸Ĵ�������Դ�������⣬
 * ���ڲ�ά��һ���ɱ���ַ����飬����ÿ���޸��ڸ������н��У�������ÿ�ζ�����һ������
 * StringBuilder�ṩ�˱༭�ַ�������ط���������ɾ���ġ���
 * 
 *   
 *    
 *    
 *    StringBuffer �� StringBuilder �࿼����һ�����߳���ͬʱ�޸��ַ����İ�ȫ���⣡��
 *    
 *    
 *    
 *     
 * @author Administrator
 *
 */

public class StringBuilderDemo {
	public static void main(String[] args) {
        String str="i love java";
        StringBuilder sb=new StringBuilder(str);
        
        sb.append(",4 instresting");
        System.out.println(sb.toString());
        
		sb.replace(12, 25, "4 change world");
		System.out.println(sb);
		
		sb.delete(0, 12);
		System.out.println(sb);
		
		sb.insert(0, "����");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}

}
