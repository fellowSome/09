package api.day08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *  字符流
 *  字符流的读写单位为字符。
 *  字符流都是高级流，虽然以字符为单位读写数据，
 *  但实际底层还是读写字节，只是从字节与字符的转换工作交给了字符流来完成。
 *  
 *  java.io.Reader:字符输入流的顶级父类
 *  java.io.Writer:字符输出流的顶级父类
 *  
 *  转换流
 *  java.io.OutputStreamWriter
 *  java.io.InputStreamReader
 *  特点是可以按照指定的字符集写出字符
 *  
 *  之所以成OutputStreamWriter 和 InputStreamReader
 *  为转换流，是因为大多数的字符流都只处理其他字符流，
 *  而低级流又是字节流，这就导致字符流不能处理字节流的问题，
 *  转换流相当于一个转换器的作用，它们可以将字节流先转换成字符流，这样其他字符流就可以处理了
 *  
 * @author Administrator
 *
 */
public class OutputStreamWriterDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("fos.txt");
		OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");   //若不指定编码格式，一般默认是GBK
		                                                              //(gbk中一个字符占2个字节，utf-8中一个字符占3个字节）
		osw.write("我爱北京天安门");
		osw.write("天安门上太阳升");
		osw.close();
		
		
	}

}
