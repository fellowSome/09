package api.day06;

import java.io.File;

/**
 * ��ȡһ��Ŀ¼���������������������
 * File[] listFiles()
 * 
 * 
 * @author Administrator
 *
 */
public class ListFileDemo {

	public static void main(String[] args) {
		File file=new File(".");
		if(file.isDirectory()){
			File[] files=file.listFiles();
			for(File f:files){
				if(f.isFile()){
					System.out.print("�ļ���");
				}else{
					System.out.print("Ŀ¼��");
				}
				System.out.println(f.getName());
			}
		}
	}

}
