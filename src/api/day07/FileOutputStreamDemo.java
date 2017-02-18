package api.day07;


import java.io.FileOutputStream;
import java.io.IOException;

/**
 *   һ��RandomAccessFile ����ָ�����ʽ��д�ļ�
 *       FileInputStream/FielInputStream ����������ʽ��д�ļ�
 *       
 *   ������
 *       �����ݷ���ͬ��Ϊ������������������յ�Ϊ��ǰ����
 *       java.io.InputStream
 *       �����࣬�������������Ķ�ȡ�ֽڷ�ʽ�����е��ֽ����������̳�����
 *       java.io.InuptStream���������ֽ�������ĸ���
 *       
 *   ����������
 *       1.�ڵ�����Ҳ�����ͼ���������ʵ�����д���ݵ�������д�����б����еͼ���������Դ��ȷ
 *       2.��������Ҳ�����߼�������д����û�и߼������߼������ܶ������ڣ��������ڴ�����������
 *         ������������Ŀ���Ǽ򻯶�д�����еĲ�����     
 *   
 *   �ġ�java.io.FileOutStream
 *       �ļ����������һ���ͼ��������������ļ���д���ֽ�
 *       
 * @author Administrator
 * 
 *
 */
public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
	    /**
	     *  Ĭ�ϴ�����fos�Ǹ���д����
	     *  ��׷��д�����ط�����
	     */
		FileOutputStream fos=new FileOutputStream("fos.txt");
        String str="�Ұ������찲��";
        byte[] bytes=str.getBytes("UTF-8");
        fos.write(bytes);
       
        fos=new FileOutputStream("fos.txt",true);
        fos.write(",�찲����̫����".getBytes("UTF-8"));
        
        System.out.println("������");
        fos.close();
	}

}
