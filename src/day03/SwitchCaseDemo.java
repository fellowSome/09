package day03;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		switch (i) {
		case 1:
			System.out.println("��ʾȫ��");
			break;
		case 2:
			System.out.println("��ѯ��¼");
			break;
		case 3:
			System.out.println("�˳�");
			break;
		default:
			System.out.println("�������");
		}

	}

}
