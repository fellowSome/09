package api.day06;

import java.io.File;

/**
 * java.io.File �ļ�����
 * 
 *  File �ȿ��Ա�ʾ�ļ�Ҳ���Ա�ʾĿ¼
 *  ʹ��File���ԣ�
 *    1.���Դ�����ɾ��һ���ļ���Ŀ¼
 *    2.���������ļ���Ŀ¼�����ԣ��磬���֣����ȵȣ���
 *    3.���Է���һ��Ŀ¼������������Ϣ
 *    
 *  ��File���ܷ���һ���ļ�����������
 * 
 * @author Administrator
 *
 */

public class FileDemo {

	public static void main(String[] args) {
	     File file=new File("."+File.separator+"1");
	     System.out.println(file.getName());
	     System.out.println(file.length());  //�����ļ��ֽ���
	     System.out.println(file.canRead()); //�Ƿ�ɶ�
	     System.out.println(file.canWrite()); //�Ƿ��д
	     System.out.println(file.isHidden()); //�Ƿ�����
	     
	     System.out.println(file.isFile());   //���ļ���
	     System.out.println(file.isDirectory());//��Ŀ¼��
	}

}
