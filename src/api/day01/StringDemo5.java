package api.day01;

/**
 * char charAt(int index);
 * ���ص�ǰ�ַ�����ָ��λ�õ��ַ�
 * @author Administrator
 *
 */

public class StringDemo5 {
	public static void main(String[] args) {
		 String str ="thinking in java";
		 char c=str.charAt(9);
		 System.out.println(c);  // i
		 
		 String st="�Ϻ�����ˮ���Ժ���";
		 for(int i=0;i<str.length()/2;i++){
			 if(st.charAt(i)!=st.charAt(st.length()-1-i)){
				 System.out.println("���ǻ���");
				 return;
			 }
		 }
		 System.out.println("�ǻ���");
		 
		 //���� ������Ҳ�й�  ,�溺����Ϸ��===========================================
		 for(int i=0;i<str.length()/2;i++){
			 if(st.charAt(i)!=st.charAt(st.length()-1-i)){
				 System.out.println("��");
				 return;
			 }
		 }
		 System.out.println("�ǻ���");
	}

}
