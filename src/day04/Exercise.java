package day04;

import java.util.Random;
import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		/*int a,b,c;
		a=b=c=100;
	    System.out.println("a="+a+"b="+b+"c="+c+"�ҵ�����");*/
		
	
		
		//����˰��
		/*System.out.println("�����빤�ʣ�");
		Scanner sc= new Scanner(System.in);
		double db=sc.nextDouble();
		if(db<=3500)
		{
			
		}else if (db<=5000)
		{
			
		}
		else if(db<=8000)
		{
			
		}else if(db<=12500)
		{
			
		}*/

		/*Scanner console=new Scanner(System.in);
		double d=console.nextDouble();
		double db=console.nextDouble();
		System.out.println(d*db);*/
		
		/*double price,num,pay;
		Scanner console=new Scanner(System.in);
		System.out.print("���ۣ�");
		price=console.nextDouble();
		System.out.print("������");
		num=console.nextDouble();
		System.out.print("�տ");
		pay=console.nextDouble();
		double total=price*num;
		double charge=pay-total;
		System.out.printf("��Ʒ�ܼۣ�%-8.2f ���㣺%-8.2f",total,charge);
		//System.out.println("���㣺"+charge);*/		
		
		//��·��
		/*char sex='��';
		int age =20;
		boolean pass = sex=='Ů'&& age++>=60;
		System.out.println(pass);
		System.out.println(age);*/
		
		
	   /* Scanner console = new Scanner(System.in);
	    System.out.println("�������䣺");
	    int age=console.nextInt();
	    boolean b= 18<=age && age>=50;
	    System.out.println(b);*/
		
		/*int i=5;
		i=i+5;
		System.out.println(i);
		 int num=17,index;
		 System.out.println(index=num%3);
		 System.out.println(index);*/
		
		/*int a=5,b=6;
		//int c=(a=b++)+b;	 c=13
		int c=b+(a=b++);   // c=12
		System.out.println(c);*/
		
		/*int num=3277,l;
		l=num %10;
		System.out.println(l);
		num /= 10;
		System.out.println(num);
		l=num %10;
		System.out.println(l);
		num /= 10;
		System.out.println(num);
		l=num %10;
		System.out.println(l);*/
		
		
		//���ϸ�ֵ�����е�ǿ��ת��
		/*int i=5;
		i +=5.5;   //�ȼ��� i=(int)(i+5.5);
		System.out.println(i);*/
		
		//��Ŀ����
		/*int rows =9;
		int size=4;
		int pages=rows%size==0 ? rows%size : (rows%size +1);
		System.out.println(pages);*/
	    
		
		// �����9+99+999+9999+99999+999999=1111104
		/*int sum=9;
		int ora=9;
		String out="9";
		for(int i=0;i<6;i++	){
			ora =ora*10+9;
			sum+=ora;
			out=out+"+"+ora;
		}
		System.out.println(out+"="+sum);*/
		
		//������������1+1/2+1/3+1/4+1/5+1/6=2.4499999999999997
		/*Scanner sc=new Scanner(System.in);
		System.out.println("����һ��������");
		int imp =sc.nextInt();
		double sum=1.0;
		double change=0.0;
		String exp="1";
		for(int i=1;i<imp;i++){
			change=1.0/(i+1);
			exp+="+1/"+(i+1);
			sum+=change;
		}
		System.out.println(exp+"="+sum);*/
		
		
	
	}

}
