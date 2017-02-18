package api.day06;

import java.io.File;
import java.io.IOException;
import java.io.FileFilter;



/**
 * ��ȡһ��Ŀ¼�з��������Ĳ�������
 * ʹ��listFiles������������Ҫ����һ������
 * ���ļ�������
 * �ļ���������һ���ӿڣ�FileFilter
 * FileFilter��accept��������ֵΪtrue�ı���
 * 
 * @author Administrator
 *
 */

public class FlieFilterDemo {

	public static void main(String[] args) {
		File file=new File(".");
		File[] files=file.listFiles(new FileFilter(){

			@Override
			public boolean accept(File pathname) {
				return pathname.getName().startsWith(".");
			}
			
		});
        for(File f:files){
        	System.out.println(f.getName());
        }
	}

}
