package api.day06;

/**
 * 若想提高读写效率，可以通过提高每次读写的数量来减少读写次数。
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileCopyDemo {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("e.zip","r");
		RandomAccessFile desc=new RandomAccessFile("e2.zip","rw");
		int d=-1;
		long  ls=System.currentTimeMillis();
		while((d=raf.read())!=-1){                       //读一个字节
			desc.write(d);                               //写一个字节
		}
		long le=System.currentTimeMillis();
        System.out.println("copy 完毕,耗时："+(le-ls));
        raf.close();
        desc.close();
        
        /**
         *   int read(byte[] byte)
         *   每次读取指定长度的字节，返回值int是实际读取字节量，若返回值是-1，说明读到了文件末尾
         */
        byte[] bt=new byte[1024*10];
        raf=new RandomAccessFile("e.zip","r");
        desc=new RandomAccessFile("e2.zip","rw");
        int len=-1;
        ls=System.currentTimeMillis();
        while((len=raf.read(bt))!=-1){
        	desc.write(bt, 0, len);
        }
        le=System.currentTimeMillis();
        System.out.println("复制完毕，耗时："+(le-ls));
        raf.close();
        desc.close();
	}

}
