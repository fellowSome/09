package day04;

import java.util.Scanner;

public class DoWhileDemo {

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

		/**int goal = (int) (Math.random() * 100 + 1);
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

		}*/
		
		
		//猜数字，每次输入都能根据输入的值给出建议范围和建议下一次输入的值。
		int goal=(int)(Math.random()*100+1);
		int guess;
		int[] hint={1,99};
		int suggest=0;
		do{
			System.out.println("guess it");
			Scanner sc=new Scanner(System.in);
			guess=sc.nextInt();
			if(guess==0)
			{
				System.out.println("welcome next time");
			}
			else if(guess>goal)
			{
				System.out.println("bigger");
				if(guess<hint[1])
				{
					hint[1]=guess;				
				}
				suggest=(hint[0]+hint[1])/2;
				System.out.println("giving your hint is {"+hint[0]+"--"+hint[1]+"},and you may use "+suggest+" having a try");
				
			}else if(guess<goal)
			{
				System.out.println("smaller");
				if(guess>hint[0])
				{
					hint[0]=guess;
				}
				suggest=(hint[0]+hint[1])/2;
				System.out.println("giving your hint is {"+hint[0]+"--"+hint[1]+"},and you may use "+suggest+" having a try");
			}else{
				System.out.println("congratulations");
			}
		}while(guess!=goal);
        
	}

}
