package api.day06;

/**
 * ɾ��һ��Ŀ¼�µ������ļ����ļ���
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
		    	delete(d[i]);  //�ݹ�
		    }		   
		}
		dir.delete();
	}

}
