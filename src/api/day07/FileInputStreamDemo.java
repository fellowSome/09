package api.day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *  java.io.FileInputStream
 *  文件输入流，是一个低级流，用于从文件中读取字节
 * 
 * @author Administrator
 *
 */

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("fos.txt");
		byte[] bytes=new byte[200];
		int len=fis.read(bytes);
	    String str=new String(bytes,0,len,"UTF-8");
	    System.out.println(str);
	    fis.close();

	}

}
