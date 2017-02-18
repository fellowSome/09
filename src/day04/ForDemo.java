package day04;

import java.util.Random;
import java.util.Scanner;

public class ForDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int score=0;
		int imp=0;
		int a=0;
		int b=0;
		Random rd=new Random();
		
		for(int i=1;i<11;i++){
			a=rd.nextInt(70);
			b=rd.nextInt(10);
	
			System.out.println(i+". "+a+"+"+b+"=?");
			imp=sc.nextInt();
			
			if(imp== -1)
			{
				break;
			}
			
			if(imp == a+b)
			{
				score+=10;
				System.out.println("right");
			}
			else
			{
				System.out.println("wrong");
			}
		}
		System.out.println("score="+score);
	}

}
