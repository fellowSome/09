package day03;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		switch (i) {
		case 1:
			System.out.println("显示全部");
			break;
		case 2:
			System.out.println("查询记录");
			break;
		case 3:
			System.out.println("退出");
			break;
		default:
			System.out.println("输入错误");
		}

	}

}
