package api.day07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *  ������
 *  java.io.BufferedInputStream;
 *  java.io.BufferedOutputStream;
 *  �����ֽ������������һ�Ը߼�����ʹ�����ǿ��Լӿ��д����
 *  
 *   �߼������Դ�������������������Ӷ��ٸ߼���������¶�Ҫ�еͼ�������Ϊ�ͼ�������ʵ
 *   ��д���ݵ������߼������Ǵ������ݵģ�
 *   �߼����������������γ����������ӣ�������Ч
 *   ����ϲ�ͬ�ĸ߼������Եõ����ӵ�Ч����
 *   
 * @author Administrator
 *
 */
public class BufferedOutptStream {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("fos.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		
		FileOutputStream fos=new FileOutputStream("fos2.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		/**
		 *  �������ڲ��и���������
		 *  ��bis.read()������ȡ��һ���ֽ�ʱ��
		 *  ʵ����bis��һ���Ե���ȥһ���ֽڣ������ڲ����ֽ������У�Ȼ�󽫵�һ���ֽڷ��أ�
		 *  ���ٴε���read����ʱ��bisֱ�Ӵ��ֽ������н��ڶ����ֽڷ��أ�
		 *  ֱ���ֽ������������ֽ�ȫ�����أ�
		 *  �Ż��ٴζ�ȡһ���ֽڡ�
		 *  ���Ի�������ͨ�����ٶ�д�������ﵽ���Ч�ʵġ�
		 */
		int b=-1;
		while((b=bis.read())!=-1){
			bos.write(b);
		}
		bos.flush();  //��������û������������Ҫ��ʱд��ʱ�����Ե���flshs������
		bos.close();  //���ر������ʱ�����Ȱѻ����е�����д��ȥ��
		bis.close();
		System.out.println("�������");
		

	}

}
