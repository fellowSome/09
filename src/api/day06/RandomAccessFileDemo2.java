package api.day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo2 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("./test.dat","rw");
        //����ļ������ڣ������ȴ����ļ�,�ڶ�д
        //����ļ����ڵ�Ŀ¼�����ڣ��򱨴�


		/**
		* int read();
		* ��ȡһ���ֽڣ�����10���Ƶ�int�ͷ���
		* ������-1����ʾ��ȡ�����ļ�ĩβ
		*/
		System.out.println(raf.read());
		
	}

}
