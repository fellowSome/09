package api.day02;

public class YiWeiDemo {

	public static void main(String[] args) {
		/**
		 *     <<< 向左移动，低位补0；  左移一位，乘以一次基数（10进制基数为10，
		 *                              二进制基数为2，这里虽然写的是10进制的，丹计算机只用二进制）
		 */
		int a=100;
		int m=a<<1;
		int n=a<<2;
		System.out.println("a="+a);
		System.err.println("m="+m);
		System.out.println("n="+n);
		
		/**
		 *      向右移动一位，除以一次基数。
		 * 
		 *     >>> 向右移动，高位永远补0，负数时不符合数学规律（溢出嘛）
		 *     >>  向右移动，高位为1（负数）则补1，高位为0（整数）则补0，保持符号位
		 */

	}

}
