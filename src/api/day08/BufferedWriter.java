package api.day08;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 *  缓冲字符流
 *  BufferedWriter（PrintWriter）  , BufferedReader
 *  特点是可以按行读取/写入字符串
 *  
 *  java.io.PrintWriter
 *  具有自动换行刷新的缓冲字符输出流
 *  创建PrintWriter时，它一定会在内部创建BufferedWriter，作为缓冲功能的叠加
 *  
 *  PrintWriter也提供了可以处理其他流的构造方法
 *  提供的方法可以传如字节流，也可以处理字符流，
 *  并且，当使用这类构造方法时，可以在传入第二个参数，
 *  该参数为boolean值，该值为true时，则具有了自动行刷新功能。
 *  
 *  BufferedReader 之 String readLine()
 *  返回值为null，说明读取到了文件末尾，否则返回一个字符串；该字符串不包含最后的换行符
 *  
 * @author Administrator
 *
 */
public class BufferedWriter {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("fos.txt");
		OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");  //加上这行，就可以指定编码格式
		PrintWriter pw=new PrintWriter(osw);
		pw.println("天王盖地虎");
		pw.println("宝塔镇河妖");
		pw.close();
		
		FileInputStream fis=new FileInputStream("fos.txt");
		InputStreamReader isr=new InputStreamReader(fis,"UTF-8");
		BufferedReader br=new BufferedReader(isr);
		String d=null;
		while((d=br.readLine())!=null){
			System.out.println(d);
		}

	}

}
