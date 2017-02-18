package day05;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class SsqDemo {
    
	public static void main(String[] args) {
		
	    /*version1();
	    version2();
	    version3();*/
	    version4();
 
	}
    public static void version1(){
    	/*
		 * 1.双色球选号 --version 1.0
		 * 
		 *      每次选取一个数放进红号数组，
		 *	    放进数组前要检查是否有相同数字，如果有，重新选取一次。
		 *     
		 *      下面"2."、"3."中对这样重复的选取和重复的比较进行改进。。。。。。
		 *  
		 */
		System.out.println("双色球选号 --version 1.0");
		int[] red=new int[6];           //临时存放红号的数组
		Random rd=new Random();
		int menber=0;	
		int k=6;
		int count=-1;                    
		boolean flag=true;
		
		for(int i=0;i<k;i++){     //选6个红号
			flag=true;
			menber=rd.nextInt(33)+1;
			for(int j=0;j<6;j++)
			{   if(menber==red[j])
				{   k++;               
				    flag=false;
					break;
				}
			}
			if(flag)
			{  
				count++;
				red[count]=menber;                
				System.out.print(menber+"  ");
			}
		}
		int blue=rd.nextInt(16)+1;
		System.out.println("+ "+blue);
    }
    
    public static void version2(){
    	/*
		 * 2.双色球选号  --version 2.0
		 * 
		 *      利用集合作为共选取号的容器
		 * 
		 * 
		 * */
		System.out.println();
		System.out.println("双色球选号  --version 2.0");
		List ls=new ArrayList();
		for(int i=1;i<34;i++)       //装载33个红号
		{   
			String s=""+i;
			ls.add(s);
		}
		Random rm=new Random();
		Collections.shuffle(ls, rm);
		int len=33;
		int temp=0;
		for(int j=1;j<7;j++)       //选取6个红号
		{
			temp=rm.nextInt(len);
			System.out.print("  "+ls.get(temp));
			ls.remove(temp);
			len--;
		}
		System.out.println("  + "+(rm.nextInt(16)+1));
    }
    
    public static void version3(){
    	/*
		 * 3. 双色球选号  --version 3.0 (简洁版本)
		 * 
		 */
		System.out.println();
		System.out.println("双色球选号  --version 3.0 (简洁版本)");
		
	    HashSet<Integer> hs=new HashSet<Integer>();
	    Random rdm=new Random();
	    do{
	    	int i=rdm.nextInt(33)+1;
	    	hs.add(i);
	    }while(hs.size()<6);
		 int bu=rdm.nextInt(16)+1;
	    System.out.println(hs+"+"+bu);
    }
    
    public static void version4(){
    	/* 
 	    * 4.ssq,杀号随机
 	    * 
 	    *   用ArraysList和HashSet配合，
 	    *   首先，从33个红球指定杀掉你要杀的，
 	    *   把杀掉的放进HashSet确保唯一性，顺便把ArrayList里对于的对象（即list.remove(Object)X) )删除；
 	    *   第二，从剩下的球里面，随机选6个，再次用HashSet确保唯一性（这里的if可以不要），放进HashSet对象中，
 	    *   顺便删除已选出的红球，直接输出HashSet对象即可。
 	    *   
 	    * */
 	    HashSet<Integer> ht=new HashSet<Integer>();
 	    ArrayList list=new ArrayList();
 	    Scanner scn=new Scanner(System.in);
 	    Random ram=new Random();
 	    int p=0;
 	    
 	    for(int i=1;i<34;i++)
 	    {   
 	    	list.add(i);	
 	    }
 	    System.out.println("输入你要杀的号，按\"0\"确定");
 	    do
 	    {
 	    	p=scn.nextInt();
 	    	if(p==0)
 	    	{
 	    		break;
 	    	}
 	    	if(ht.add(p))
 	    	{   
 	    		System.out.println("杀掉"+p);
 	    		if(list.remove((Object)p))
 	    		{
 	    			System.out.println("yes");
 	    		}
 	    	}
 	    	System.out.println(ht);
 	    }while(p!=0);
 	    
 	    ht.clear();
 	   
 		do
 		{
 		   int t=ram.nextInt(list.size());
 		   t=(Integer)list.get(t);
 		   if(ht.add(t))                    //这个if其实可以不要，因为每次list.size()都在变，不会出现重复的球;
 			                                 //但是ht.add(t)需要保留
 		   {
 			  list.remove((Object)t);
 		   }
 		}while(ht.size()<6);
 		System.out.println(ht+"+"+(ram.nextInt(16)+1));
    }
}
