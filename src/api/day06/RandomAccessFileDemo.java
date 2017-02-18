package api.day06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * 用来读写文件数据
 * RAF是基于指针进行读写的，即，RAF总是在指针
 * 指向的位置读写字节，并且读写后指针会自动向后移动。
 * 
 * 第二个参数为模式:
 *     r 只读模式 
 *     rw 读写模式
 * 
 * RAF既可读取文件数据也可以向文件中写入数据
 * @author Administrator
 *
 */
public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("./test.dat","rw");
		                                               //如果文件不存在，他会先创建文件,在读写
		                                               //如果文件所在的目录不存在，则报错
		/**
		 * void write(int d)
		 *写出给定的int值对应2进制的低八位
		 *                           vvvvvvvv
		 *00000000 00000000 00000000 00000000
		 */
		raf.write(3);    //覆盖原来内容写
		raf.write(3);    //追加写，指针后移嘛
		System.out.println("写出完毕");
        raf.close();
        raf=new RandomAccessFile("./test.dat","rw");
        System.out.println(raf.read());
        System.out.println(raf.read());
        
	}

}
