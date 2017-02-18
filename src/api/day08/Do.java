package api.day08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Do {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("请输入文件名：");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();

		FileOutputStream fos = new FileOutputStream(name);
		PrintWriter pw = new PrintWriter(fos); //如果是PrintWinter（fos,true），
		                                        //当调用pw.println()时，自动行刷新（也就是自动flush（））

		System.out.println("请输入内容(“exit”保存退出)");
		String text;
		while (true) {
			text = sc.nextLine();
			text=text.trim();
			if (text.equals("eixt")) {
				break;
			} else {
				pw.println(text);
				pw.flush();                       //如果上面加了true，这行可以省略
			}
		}
		System.out.println("已保存退出");
		pw.close();

	}

}
