package api.day07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *  缓冲流
 *  java.io.BufferedInputStream;
 *  java.io.BufferedOutputStream;
 *  缓冲字节输入输出流是一对高级流，使用它们可以加快读写速率
 *  
 *   高级流可以处理其他流，但无论添加多少高级流，最底下都要有低级流，因为低级流是真实
 *   读写数据的流，高级流都是处理数据的，
 *   高级流处理其他流就形成了流的链接，并且有效
 *   的组合不同的高级流可以得到叠加的效果。
 *   
 * @author Administrator
 *
 */
public class BufferedOutptStream {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("fos.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		
		FileOutputStream fos=new FileOutputStream("fos2.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		/**
		 *  缓冲流内部有个缓冲区，
		 *  当bis.read()方法读取第一个字节时，
		 *  实际上bis会一次性单独去一组字节，存入内部的字节数组中，然后将第一个字节返回，
		 *  当再次调用read方法时，bis直接从字节数组中将第二个字节返回，
		 *  直到字节数组中所以字节全部返回，
		 *  才会再次读取一组字节。
		 *  所以缓冲流是通过减少读写次数来达到提高效率的。
		 */
		int b=-1;
		while((b=bis.read())!=-1){
			bos.write(b);
		}
		bos.flush();  //当缓冲区没有填满，有需要及时写出时，可以调用flshs（）；
		bos.close();  //当关闭输出流时，会先把缓冲中的内容写出去。
		bis.close();
		System.out.println("复制完毕");
		

	}

}
