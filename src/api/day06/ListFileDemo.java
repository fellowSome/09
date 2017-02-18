package api.day06;

import java.io.File;

/**
 * 获取一个目录的所有子项，不包含孙子项
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
					System.out.print("文件：");
				}else{
					System.out.print("目录：");
				}
				System.out.println(f.getName());
			}
		}
	}

}
