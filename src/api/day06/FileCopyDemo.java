package api.day06;

/**
 * ������߶�дЧ�ʣ�����ͨ�����ÿ�ζ�д�����������ٶ�д������
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
		while((d=raf.read())!=-1){                       //��һ���ֽ�
			desc.write(d);                               //дһ���ֽ�
		}
		long le=System.currentTimeMillis();
        System.out.println("copy ���,��ʱ��"+(le-ls));
        raf.close();
        desc.close();
        
        /**
         *   int read(byte[] byte)
         *   ÿ�ζ�ȡָ�����ȵ��ֽڣ�����ֵint��ʵ�ʶ�ȡ�ֽ�����������ֵ��-1��˵���������ļ�ĩβ
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
        System.out.println("������ϣ���ʱ��"+(le-ls));
        raf.close();
        desc.close();
	}

}
