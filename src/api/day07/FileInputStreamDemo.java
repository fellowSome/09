package api.day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *  java.io.FileInputStream
 *  �ļ�����������һ���ͼ��������ڴ��ļ��ж�ȡ�ֽ�
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
