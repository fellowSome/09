package api.day06;

import java.io.File;

/**
 * java.io.File 文件操作
 * 
 *  File 既可以表示文件也可以表示目录
 *  使用File可以：
 *    1.可以创建或删除一个文件或目录
 *    2.访问其他文件或目录的属性（如，名字，长度等）；
 *    3.可以访问一个目录的所以子项信息
 *    
 *  但File不能访问一个文件的数据内容
 * 
 * @author Administrator
 *
 */

public class FileDemo {

	public static void main(String[] args) {
	     File file=new File("."+File.separator+"1");
	     System.out.println(file.getName());
	     System.out.println(file.length());  //返回文件字节量
	     System.out.println(file.canRead()); //是否可读
	     System.out.println(file.canWrite()); //是否可写
	     System.out.println(file.isHidden()); //是否隐藏
	     
	     System.out.println(file.isFile());   //是文件？
	     System.out.println(file.isDirectory());//是目录？
	}

}
