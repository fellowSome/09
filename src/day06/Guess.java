package day06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		System.out.println("猜字符游戏：");
		Scanner sc=new Scanner(System.in);
		char[] goal=generate();
		System.out.println(Arrays.toString(goal));
		int[] i=new int[2];
		char[] impt= new char[5];
		do
		{   
			System.out.println("输入5个字符");
			String imp=sc.next().toUpperCase();
			if(imp.equals("EXIT"))
			{   
				System.out.println("退出");
				break;
			}
			else if(imp.length()!=5)
			{
				System.out.println("字母个数不是5个");
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
				   System.out.println("恭喜你答对了");
			   }
			   else{
			     System.out.println("字符对了"+i[0]+"个，位置对了"+i[1]+"个");
			   }
			}
		}while(i[1]!=5);
        
	}
	//设置标签flags，来选取不重复的字符
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
	
	//用一个hashset来选取不重复的字符
	public static char[] generate(){	
		HashSet<Integer> hs =new HashSet<Integer>();
		Random rd=new Random();
		int t=0;
		int i=0;
		char[] chs=new char[5];
		do
		{
			t=rd.nextInt(26)+65;
			if(hs.add(t))              //如果能加入hs说明不重复，顺便加入chs[i]
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
