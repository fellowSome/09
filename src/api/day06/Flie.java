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
        
        raf.writeInt(max); //��Ч����4��write
        
        System.out.println("��ʱָ��λ���ڵ� "+raf.getFilePointer()+" ���ֽ�");
        
        raf.writeDouble(Double.MAX_VALUE);
        
        System.out.println("��ʱָ��λ���ڵ� "+raf.getFilePointer()+" ���ֽ�");
        
        raf.seek(0);    //�ƶ�ָ�뵽ָ��λ��
        System.out.println(raf.readInt());
        System.out.println(raf.readInt());
       
        raf.seek(0);
        System.out.println(raf.readDouble());
        
	}

}
