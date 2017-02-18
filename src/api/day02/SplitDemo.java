package api.day02;

import java.util.Arrays;

/**
 * String[] split(Stirng regex) 将当前字符串按照正则表达式拆分开，存放于字符串数组中
 * 
 * @author Administrator
 *
 */
public class SplitDemo {

	public static void main(String[] args) {
		/**
		 * 按照数字部分进行拆分
		 */
		String str = "abc123jklss777k";
		String[] array = str.split("[0-9]+");    //或者  String[] array=str.split("\\d+");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		/**
		 * 若拆分过程中出现连续匹配，那么中间可以拆分出一个个空字符串，
		 * 若在字符串末尾连续匹配，则空字符串全部忽略。
		 */
	    str = "abc123jklss777k";
		array = str.split("[0-9]");    //少一个“+”的情况，连续匹配 ，或者写成这样String[] array=str.split("\\d");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		/**
		 * 图片重命名
		 */
		str="a.b.c.d.f.jpg";
		array= str.split("\\.");
		str=System.currentTimeMillis()+"."+array[array.length-1];
		      //或者 str=System.currentTimeMillis()+str.substring(str.lastIndexOf("."));
		System.out.println(str);
	}

}
