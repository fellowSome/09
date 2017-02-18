package api.day06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * ������д�ļ�����
 * RAF�ǻ���ָ����ж�д�ģ�����RAF������ָ��
 * ָ���λ�ö�д�ֽڣ����Ҷ�д��ָ����Զ�����ƶ���
 * 
 * �ڶ�������Ϊģʽ:
 *     r ֻ��ģʽ 
 *     rw ��дģʽ
 * 
 * RAF�ȿɶ�ȡ�ļ�����Ҳ�������ļ���д������
 * @author Administrator
 *
 */
public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("./test.dat","rw");
		                                               //����ļ������ڣ������ȴ����ļ�,�ڶ�д
		                                               //����ļ����ڵ�Ŀ¼�����ڣ��򱨴�
		/**
		 * void write(int d)
		 *д��������intֵ��Ӧ2���ƵĵͰ�λ
		 *                           vvvvvvvv
		 *00000000 00000000 00000000 00000000
		 */
		raf.write(3);    //����ԭ������д
		raf.write(3);    //׷��д��ָ�������
		System.out.println("д�����");
        raf.close();
        raf=new RandomAccessFile("./test.dat","rw");
        System.out.println(raf.read());
        System.out.println(raf.read());
        
	}

}
