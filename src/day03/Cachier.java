package day03;

import java.util.Scanner;

public class Cachier {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("���뵥�ۣ�");	
		double unitPrice=sc.nextDouble();
		System.out.println("����������");
		double amount=sc.nextDouble();
		System.out.println("�����");
		double money=sc.nextDouble();
		double change;
		
		double totalPrice=unitPrice*amount;
		if(totalPrice>=500){
			totalPrice*=0.8;
		}
		if(money>totalPrice){
			change=money-totalPrice;
			System.out.println("Ӧ�ս��Ϊ��"+totalPrice+",���㣺"+change);	
		}else
			System.out.println("Ǯ����");
		    System.out.println(" gggggg");

	}

}
