package api.day08;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 *  �����ַ���
 *  BufferedWriter��PrintWriter��  , BufferedReader
 *  �ص��ǿ��԰��ж�ȡ/д���ַ���
 *  
 *  java.io.PrintWriter
 *  �����Զ�����ˢ�µĻ����ַ������
 *  ����PrintWriterʱ����һ�������ڲ�����BufferedWriter����Ϊ���幦�ܵĵ���
 *  
 *  PrintWriterҲ�ṩ�˿��Դ����������Ĺ��췽��
 *  �ṩ�ķ������Դ����ֽ�����Ҳ���Դ����ַ�����
 *  ���ң���ʹ�����๹�췽��ʱ�������ڴ���ڶ���������
 *  �ò���Ϊbooleanֵ����ֵΪtrueʱ����������Զ���ˢ�¹��ܡ�
 *  
 *  BufferedReader ֮ String readLine()
 *  ����ֵΪnull��˵����ȡ�����ļ�ĩβ�����򷵻�һ���ַ��������ַ������������Ļ��з�
 *  
 * @author Administrator
 *
 */
public class BufferedWriter {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("fos.txt");
		OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");  //�������У��Ϳ���ָ�������ʽ
		PrintWriter pw=new PrintWriter(osw);
		pw.println("�����ǵػ�");
		pw.println("���������");
		pw.close();
		
		FileInputStream fis=new FileInputStream("fos.txt");
		InputStreamReader isr=new InputStreamReader(fis,"UTF-8");
		BufferedReader br=new BufferedReader(isr);
		String d=null;
		while((d=br.readLine())!=null){
			System.out.println(d);
		}

	}

}
