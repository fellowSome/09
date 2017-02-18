package api.day08;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("fos.txt");
		InputStreamReader isr=new InputStreamReader(fis,"UTF-8");
		int d=-1;
		while((d=isr.read())!=-1){
			System.out.print((char)d);
		}

	}

}
