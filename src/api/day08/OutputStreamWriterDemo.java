package api.day08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *  �ַ���
 *  �ַ����Ķ�д��λΪ�ַ���
 *  �ַ������Ǹ߼�������Ȼ���ַ�Ϊ��λ��д���ݣ�
 *  ��ʵ�ʵײ㻹�Ƕ�д�ֽڣ�ֻ�Ǵ��ֽ����ַ���ת�������������ַ�������ɡ�
 *  
 *  java.io.Reader:�ַ��������Ķ�������
 *  java.io.Writer:�ַ�������Ķ�������
 *  
 *  ת����
 *  java.io.OutputStreamWriter
 *  java.io.InputStreamReader
 *  �ص��ǿ��԰���ָ�����ַ���д���ַ�
 *  
 *  ֮���Գ�OutputStreamWriter �� InputStreamReader
 *  Ϊת����������Ϊ��������ַ�����ֻ���������ַ�����
 *  ���ͼ��������ֽ�������͵����ַ������ܴ����ֽ��������⣬
 *  ת�����൱��һ��ת���������ã����ǿ��Խ��ֽ�����ת�����ַ��������������ַ����Ϳ��Դ�����
 *  
 * @author Administrator
 *
 */
public class OutputStreamWriterDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("fos.txt");
		OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");   //����ָ�������ʽ��һ��Ĭ����GBK
		                                                              //(gbk��һ���ַ�ռ2���ֽڣ�utf-8��һ���ַ�ռ3���ֽڣ�
		osw.write("�Ұ������찲��");
		osw.write("�찲����̫����");
		osw.close();
		
		
	}

}
