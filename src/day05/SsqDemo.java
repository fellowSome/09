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
		 * 1.˫ɫ��ѡ�� --version 1.0
		 * 
		 *      ÿ��ѡȡһ�����Ž�������飬
		 *	    �Ž�����ǰҪ����Ƿ�����ͬ���֣�����У�����ѡȡһ�Ρ�
		 *     
		 *      ����"2."��"3."�ж������ظ���ѡȡ���ظ��ıȽϽ��иĽ�������������
		 *  
		 */
		System.out.println("˫ɫ��ѡ�� --version 1.0");
		int[] red=new int[6];           //��ʱ��ź�ŵ�����
		Random rd=new Random();
		int menber=0;	
		int k=6;
		int count=-1;                    
		boolean flag=true;
		
		for(int i=0;i<k;i++){     //ѡ6�����
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
		 * 2.˫ɫ��ѡ��  --version 2.0
		 * 
		 *      ���ü�����Ϊ��ѡȡ�ŵ�����
		 * 
		 * 
		 * */
		System.out.println();
		System.out.println("˫ɫ��ѡ��  --version 2.0");
		List ls=new ArrayList();
		for(int i=1;i<34;i++)       //װ��33�����
		{   
			String s=""+i;
			ls.add(s);
		}
		Random rm=new Random();
		Collections.shuffle(ls, rm);
		int len=33;
		int temp=0;
		for(int j=1;j<7;j++)       //ѡȡ6�����
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
		 * 3. ˫ɫ��ѡ��  --version 3.0 (���汾)
		 * 
		 */
		System.out.println();
		System.out.println("˫ɫ��ѡ��  --version 3.0 (���汾)");
		
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
 	    * 4.ssq,ɱ�����
 	    * 
 	    *   ��ArraysList��HashSet��ϣ�
 	    *   ���ȣ���33������ָ��ɱ����Ҫɱ�ģ�
 	    *   ��ɱ���ķŽ�HashSetȷ��Ψһ�ԣ�˳���ArrayList����ڵĶ��󣨼�list.remove(Object)X) )ɾ����
 	    *   �ڶ�����ʣ�µ������棬���ѡ6�����ٴ���HashSetȷ��Ψһ�ԣ������if���Բ�Ҫ�����Ž�HashSet�����У�
 	    *   ˳��ɾ����ѡ���ĺ���ֱ�����HashSet���󼴿ɡ�
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
 	    System.out.println("������Ҫɱ�ĺţ���\"0\"ȷ��");
 	    do
 	    {
 	    	p=scn.nextInt();
 	    	if(p==0)
 	    	{
 	    		break;
 	    	}
 	    	if(ht.add(p))
 	    	{   
 	    		System.out.println("ɱ��"+p);
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
 		   if(ht.add(t))                    //���if��ʵ���Բ�Ҫ����Ϊÿ��list.size()���ڱ䣬��������ظ�����;
 			                                 //����ht.add(t)��Ҫ����
 		   {
 			  list.remove((Object)t);
 		   }
 		}while(ht.size()<6);
 		System.out.println(ht+"+"+(ram.nextInt(16)+1));
    }
}
