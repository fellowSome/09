package api.day06;

import java.io.File;
import java.io.IOException;
import java.io.FileFilter;



/**
 * 获取一个目录中符合条件的部分子项
 * 使用listFiles（）方法，需要传入一个额外
 * 的文件过滤器
 * 文件过滤器是一个接口：FileFilter
 * FileFilter中accept方法返回值为true的保留
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
