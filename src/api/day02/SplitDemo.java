package api.day02;

import java.util.Arrays;

/**
 * String[] split(Stirng regex) ����ǰ�ַ�������������ʽ��ֿ���������ַ���������
 * 
 * @author Administrator
 *
 */
public class SplitDemo {

	public static void main(String[] args) {
		/**
		 * �������ֲ��ֽ��в��
		 */
		String str = "abc123jklss777k";
		String[] array = str.split("[0-9]+");    //����  String[] array=str.split("\\d+");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		/**
		 * ����ֹ����г�������ƥ�䣬��ô�м���Բ�ֳ�һ�������ַ�����
		 * �����ַ���ĩβ����ƥ�䣬����ַ���ȫ�����ԡ�
		 */
	    str = "abc123jklss777k";
		array = str.split("[0-9]");    //��һ����+�������������ƥ�� ������д������String[] array=str.split("\\d");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		/**
		 * ͼƬ������
		 */
		str="a.b.c.d.f.jpg";
		array= str.split("\\.");
		str=System.currentTimeMillis()+"."+array[array.length-1];
		      //���� str=System.currentTimeMillis()+str.substring(str.lastIndexOf("."));
		System.out.println(str);
	}

}
