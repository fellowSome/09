package api.day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Flie {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("raf1.dat","rw");
        int max=Integer.MAX_VALUE;
        raf.write(max>>>24);
        raf.write(max>>>16);
        raf.write(max>>>8);
        raf.write(max);
        
        raf.writeInt(max); //等效上面4个write
        
        System.out.println("此时指针位置在第 "+raf.getFilePointer()+" 个字节");
        
        raf.writeDouble(Double.MAX_VALUE);
        
        System.out.println("此时指针位置在第 "+raf.getFilePointer()+" 个字节");
        
        raf.seek(0);    //移动指针到指定位置
        System.out.println(raf.readInt());
        System.out.println(raf.readInt());
       
        raf.seek(0);
        System.out.println(raf.readDouble());
        
	}

}
