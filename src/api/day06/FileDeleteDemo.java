package api.day06;

/**
 * 删除一个目录下的所以文件和文件夹
 */
import java.io.File;

public class FileDeleteDemo{

	public static void main(String[] args) {
		File dir=new File("1");
		delete(dir);
		
	}
	public static void  delete(File dir){		
		if(dir.isDirectory()){
			File[] d=dir.listFiles();
		    for(int i=0;i<d.length;i++){
		    	delete(d[i]);  //递归
		    }		   
		}
		dir.delete();
	}

}
