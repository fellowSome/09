package day06;

import java.awt.List;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		System.out.println("��ʼ������Ϸ��");
		String goal=generater();
		System.out.println(goal);
		Scanner sc=new Scanner(System.in);
		String imp="";
		
		do{
			System.out.println("����5����ĸ��  ---\"exit\"�˳�");
			imp=sc.next();
			if(imp.equals("exit"))
			{
				break;
			}else if(imp.length()>5){
				System.out.println("����5����ĸ��");
			}else if(imp.length()<5){
				System.out.println("����5����ĸ");
			}else {
				int[] result=compare(imp,goal);
				System.out.println("��"+result[0]+"����ĸ���ˣ���"+result[1]+"��λ����");
			}
		}while(!imp.equals(goal));

	}
	
	//�������ظ���5����ĸ
	public static String generater(){     
		
		String str="";
		List ls=new List();
			
		for(int i=65;i<91;i++)
		{   
			str="";
			char a=(char)i;
		    str+=a;
			ls.addItem(str);
		}
		
		str="";
		int len=26;
		Random rd=new Random();
		
		for(int j=0;j<5;j++)
		{	
			int d=rd.nextInt(len);
			str+=ls.getItem(d); 
			System.out.println(ls.getItemCount());
			ls.remove(d);
			len--;
		}
		return str;
	}
	public static int[] compare(String imp,String goal){
		char[] imp_c=imp.toCharArray();
		char[] goal_c=goal.toCharArray();
		int[] res=new int[2];
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(imp_c[i]==goal_c[j])
				{
					res[0]++;
					if(i==j){
						res[1]++;
					}
					break;
				}
			}
		}
		return  res;
		
	}

}
