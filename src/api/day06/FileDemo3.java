package api.day06;

import java.io.File;

/**
 * ����һ����Ŀ¼
 * 
 * mkdir()   ����Ŀ¼
 * mkidrs()  �������Ŀ¼
 * 
 * @author Administrator
 *
 */
public class FileDemo3 {
     public static void main(String[] args) {
		File file=new File("./1/2/3");
		if(!file.exists()){
			file.mkdirs();
			System.out.println("Ŀ¼�Ѵ���");
		}else{
			System.out.println("Ŀ¼�Ѵ���");
			file.delete();          //��Ŀ¼��Ϊ�գ��Ͳ���ֱ��һ��deleteɾ����
		}
		
	}
}
