package api.day01;

/**
 * String substring(int start,int end)
 * java API有个特点，
 * 通常使用两个数字表示一个范围时，
 * 都是含头不含尾
 * @author Administrator
 *
 */

public class StringDemo3 {
	public static void main(String[] args) {
        String str="www.oracle.com";
        String host=str.substring(4,10);
        System.out.println(host);
        
        System.out.println(str.length());     //14
        String outOfIndex=str.substring(14);  //这里从14开始输出空值，从15开始就报错
        System.out.println(outOfIndex);
        
        
	}

}
