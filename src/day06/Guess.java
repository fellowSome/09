package day06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		System.out.println("���ַ���Ϸ��");
		Scanner sc=new Scanner(System.in);
		char[] goal=generate();
		System.out.println(Arrays.toString(goal));
		int[] i=new int[2];
		char[] impt= new char[5];
		do
		{   
			System.out.println("����5���ַ�");
			String imp=sc.next().toUpperCase();
			if(imp.equals("EXIT"))
			{   
				System.out.println("�˳�");
				break;
			}
			else if(imp.length()!=5)
			{
				System.out.println("��ĸ��������5��");
			}
			else
			{
				
			   for(int j=0;j<imp.length();j++)
			   {
				   impt[j]=imp.charAt(j);
			   }
			   i =check(goal,impt);
			   if(i[1]==5)
			   {
				   System.out.println("��ϲ������");
			   }
			   else{
			     System.out.println("�ַ�����"+i[0]+"����λ�ö���"+i[1]+"��");
			   }
			}
		}while(i[1]!=5);
        
	}
	//���ñ�ǩflags����ѡȡ���ظ����ַ�
	/*public static char[] generate(){
		char[] letters={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		boolean[] flags=new boolean[26];
		char[] chs=new char[5];
		for(int i=0;i<5;i++)
		{   
		    int index=0;
			do
			{
                index=(int)(Math.random()*26);
                chs[i]=letters[index];
			}while(flags[index]);
			 
			flags[index]=true;
		}
		return chs;	
	}*/
	
	//��һ��hashset��ѡȡ���ظ����ַ�
	public static char[] generate(){	
		HashSet<Integer> hs =new HashSet<Integer>();
		Random rd=new Random();
		int t=0;
		int i=0;
		char[] chs=new char[5];
		do
		{
			t=rd.nextInt(26)+65;
			if(hs.add(t))              //����ܼ���hs˵�����ظ���˳�����chs[i]
			{
				chs[i]=(char)t;
				i++;
			}
			
		}while(hs.size()<5);
		return chs;	
	}
	public static  int[] check(char[] chs,char[] imput){
		int[] result=new int[2];
		for(int i=0;i<chs.length;i++)
		{
			for(int j=0;j<chs.length;j++)
			{
				if(chs[i]==imput[j])
				{
					result[0]++;
					if(i==j)
					{
						result[1]++;
					}
					break;
				}
			}
		}
		return result;
		
	}

}
