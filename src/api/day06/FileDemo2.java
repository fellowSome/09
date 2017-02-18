package api.day06;

/**
 * createNewFile（）创建文件
 * 
 * delete() 删除文件
 * 
 * exists（）判断文件是否存在
 * 
 */
import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {
		/**
		 * 在当前目录下创建文件test.txt
		 */
    	File file=new File("test.txt");        //判断是否存在
    	if(!file.exists()){
    		file.createNewFile();             //创建文件
    		System.out.println("创建完毕");
    	}else{
    		System.out.println("文件已存在");
    		file.delete();
        	System.out.println("文件已删除");  //删除文件
    	}
    	
	}
}
