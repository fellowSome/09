package day03;

import java.util.Scanner;

public class Cachier {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("输入单价：");	
		double unitPrice=sc.nextDouble();
		System.out.println("输入数量：");
		double amount=sc.nextDouble();
		System.out.println("输入金额：");
		double money=sc.nextDouble();
		double change;
		
		double totalPrice=unitPrice*amount;
		if(totalPrice>=500){
			totalPrice*=0.8;
		}
		if(money>totalPrice){
			change=money-totalPrice;
			System.out.println("应收金额为："+totalPrice+",找零："+change);	
		}else
			System.out.println("钱不够");
		    System.out.println(" gggggg");

	}

}
