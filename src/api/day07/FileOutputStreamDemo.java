package api.day07;


import java.io.FileOutputStream;
import java.io.IOException;

/**
 *   一、RandomAccessFile 是以指针的形式读写文件
 *       FileInputStream/FielInputStream 是以流的形式读写文件
 *       
 *   二、流
 *       流根据方向不同分为输入流和输出流，参照点为当前程序
 *       java.io.InputStream
 *       抽象类，定义了输入流的读取字节方式，所有的字节输入流都继承自它
 *       java.io.InuptStream则是所有字节输出流的父类
 *       
 *   三、流分类
 *       1.节点流，也叫做低级流，是真实负责读写数据的流，读写操作中必须有低级流，数据源明确
 *       2.处理流，也叫做高级流，读写可以没有高级流，高级流不能独立存在，必须用于处理其他流，
 *         处理其他流的目的是简化读写数据中的操作。     
 *   
 *   四、java.io.FileOutStream
 *       文件输出流，是一个低级流，作用是向文件中写入字节
 *       
 * @author Administrator
 * 
 *
 */
public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
	    /**
	     *  默认创建的fos是覆盖写操作
	     *  有追加写的重载方法。
	     */
		FileOutputStream fos=new FileOutputStream("fos.txt");
        String str="我爱北京天安门";
        byte[] bytes=str.getBytes("UTF-8");
        fos.write(bytes);
       
        fos=new FileOutputStream("fos.txt",true);
        fos.write(",天安门上太阳升".getBytes("UTF-8"));
        
        System.out.println("输出完毕");
        fos.close();
	}

}
