package api.day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo2 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("./test.dat","rw");
        //如果文件不存在，他会先创建文件,在读写
        //如果文件所在的目录不存在，则报错


		/**
		* int read();
		* 读取一个字节，并以10进制的int型返回
		* 若返回-1，表示读取到了文件末尾
		*/
		System.out.println(raf.read());
		
	}

}
