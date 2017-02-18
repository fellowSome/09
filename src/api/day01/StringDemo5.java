package api.day01;

/**
 * char charAt(int index);
 * 返回当前字符串中指定位置的字符
 * @author Administrator
 *
 */

public class StringDemo5 {
	public static void main(String[] args) {
		 String str ="thinking in java";
		 char c=str.charAt(9);
		 System.out.println(c);  // i
		 
		 String st="上海自来水来自海上";
		 for(int i=0;i<str.length()/2;i++){
			 if(st.charAt(i)!=st.charAt(st.length()-1-i)){
				 System.out.println("不是回文");
				 return;
			 }
		 }
		 System.out.println("是回文");
		 
		 //玩玩 ，这样也行哈  ,玩汉子游戏嘛===========================================
		 for(int i=0;i<str.length()/2;i++){
			 if(st.charAt(i)!=st.charAt(st.length()-1-i)){
				 System.out.println("不");
				 return;
			 }
		 }
		 System.out.println("是回文");
	}

}
