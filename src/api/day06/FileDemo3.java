package api.day06;

import java.io.File;

/**
 * 创建一个新目录
 * 
 * mkdir()   创建目录
 * mkidrs()  创建多层目录
 * 
 * @author Administrator
 *
 */
public class FileDemo3 {
     public static void main(String[] args) {
		File file=new File("./1/2/3");
		if(!file.exists()){
			file.mkdirs();
			System.out.println("目录已创建");
		}else{
			System.out.println("目录已存在");
			file.delete();          //该目录不为空，就不能直接一个delete删除。
		}
		
	}
}
