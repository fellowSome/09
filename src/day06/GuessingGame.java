package day06;

import java.awt.List;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		System.out.println("开始猜字游戏：");
		String goal=generater();
		System.out.println(goal);
		Scanner sc=new Scanner(System.in);
		String imp="";
		
		do{
			System.out.println("输入5个字母：  ---\"exit\"退出");
			imp=sc.next();
			if(imp.equals("exit"))
			{
				break;
			}else if(imp.length()>5){
				System.out.println("超过5个字母了");
			}else if(imp.length()<5){
				System.out.println("少于5个字母");
			}else {
				int[] result=compare(imp,goal);
				System.out.println("有"+result[0]+"个字母对了，有"+result[1]+"个位对了");
			}
		}while(!imp.equals(goal));

	}
	
	//生产无重复的5个字母
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
