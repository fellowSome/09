package api.day02;

public class BuMaDemo {

	public static void main(String[] args) {
		/**������֤
		 * 
		 * ����ǣ�	11111111111111111111111111110110
					11111111111111111111111111110111
					11111111111111111111111111111000
					11111111111111111111111111111001
					11111111111111111111111111111010
					11111111111111111111111111111011
					11111111111111111111111111111100
					11111111111111111111111111111101
					11111111111111111111111111111110
					11111111111111111111111111111111
					0
					1
					10
					11
					100
					101
					110
					111
					1000
					1001
		*/
		for(int i=-10;i<10;i++){
			System.out.println(Integer.toBinaryString(i)); 
		}
		
		int max=Integer.MAX_VALUE;
		int min=Integer.MIN_VALUE;
		System.out.println(Integer.toBinaryString(max));
		System.out.println(Integer.toBinaryString(min));
		System.out.println(min-max);                        //��Сֵ�����ֵ=1
		System.out.println(Integer.toBinaryString(min-1));  //��Сֵ��һ�����ֵ
		System.out.println(Integer.toBinaryString(max+1));  //���ֵ��һ����Сֵ
	}

}
