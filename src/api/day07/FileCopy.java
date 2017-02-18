package api.day07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("fos.txt");
		FileOutputStream fos=new FileOutputStream("fos2.txt");
		byte[] bt=new byte[1024*10];
	    int len=-1;
	    while((len=fis.read(bt))!=-1)
	    {
	    	fos.write(bt, 0, len);
	    }
		
		fis.close();
		fos.close();
	
	}

}
