package day03;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		
		 /* int num=1; String d3=""; String d5=""; String d7=""; while(num<=50) {
		 * if(num%3==0) d3=d3+"  "+num; else if(num%5==0) d5=d5+" "+num; else
		 * if(num%7==0) d7=d7+" "+num; num++; } System.out.println("3的倍数："+d3);
		 * System.out.println("5的倍数："+d5); System.out.println("7的倍数："+d7);
		 */

		/*
		 * int num=1; do { if(num%3==0 || num%5==0 || num%7==0) {
		 * System.out.println(num); } num++; }while(num<50);
		 */

		int goal = (int) (Math.random() * 100 + 1);
		System.out.println(goal);
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("请输入一个数字：");
			int imp = sc.nextInt();
			if(imp==0)
			{   
				System.out.println("welcom next time");
				break;
			}
			else if (imp == goal){
				System.out.println("congratulations");
				break;
			} 
			else if(imp>goal)
			{
				System.out.println("bigger");
			}
			else
				System.out.println("smaller");

		}
        
	}

}
