package api.day06;

/**
 * createNewFile���������ļ�
 * 
 * delete() ɾ���ļ�
 * 
 * exists�����ж��ļ��Ƿ����
 * 
 */
import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {
		/**
		 * �ڵ�ǰĿ¼�´����ļ�test.txt
		 */
    	File file=new File("test.txt");        //�ж��Ƿ����
    	if(!file.exists()){
    		file.createNewFile();             //�����ļ�
    		System.out.println("�������");
    	}else{
    		System.out.println("�ļ��Ѵ���");
    		file.delete();
        	System.out.println("�ļ���ɾ��");  //ɾ���ļ�
    	}
    	
	}
}
