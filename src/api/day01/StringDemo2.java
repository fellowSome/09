package api.day01;

/**
 * int indexOf（String str)
 * indexOf方法返回给定字符串在当前字符串中的位置（下标）
 * 若当前字符串不含给定的内容，则返回-1；
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
         
         index=str.indexOf(105,3);    //105对应的字符是‘i’
         System.out.println(index);   // 5
         
         index=str.lastIndexOf("in");
         System.out.println(index);   //9
		
	}

}
