package api.day08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Do {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("�������ļ�����");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();

		FileOutputStream fos = new FileOutputStream(name);
		PrintWriter pw = new PrintWriter(fos); //�����PrintWinter��fos,true����
		                                        //������pw.println()ʱ���Զ���ˢ�£�Ҳ�����Զ�flush������

		System.out.println("����������(��exit�������˳�)");
		String text;
		while (true) {
			text = sc.nextLine();
			text=text.trim();
			if (text.equals("eixt")) {
				break;
			} else {
				pw.println(text);
				pw.flush();                       //����������true�����п���ʡ��
			}
		}
		System.out.println("�ѱ����˳�");
		pw.close();

	}

}
