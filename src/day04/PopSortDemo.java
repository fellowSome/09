package day04;

import java.util.Scanner;

public class PopSortDemo {

	public static void main(String[] args) {
		
		//1. ����
		/* int[] arr = {89,50,84,57,61,20,86};
		    for(int i=0;i<arr.length-1;i++)           //length-1���б�Ҫ�ģ�
		    {          
		        for(int j=0;j<arr.length-1-i;j++)     //length-1ͬ�����б�Ҫ�ģ�
		        {    		                           //��������if�ǰ��������У�����ÿ�����ѭ�������ֵ�ŵ��ˡ���󡱣�����ڲ�ѭ����Ӧ�ľ�Ҫ�ӡ�0����ʼ��ѭ����i����
		            if(arr[j]>arr[j+1]){
		                int temp = arr[j];
		                arr[j] = arr[j+1];
		                arr[j+1] = temp;
		            }
		        }
		    }
		    for(int i=0;i<arr.length;i++)
		    {	
		        System.out.println(arr[i]);
		    }*/
		
		//2. ����
		/*int[] arr = {89,50,84,57,61,20,86};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
		}*/
		
		
		//3. �˷���
		/*for(int i=1;i<10;i++){
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}*/
		
		//4. ����ħ������֮��==��֮��==�Խ���֮��
		/*System.out.println("����һ��������");
		Scanner sc=new Scanner(System.in);
		int imp=sc.nextInt();
		int[][] ar=new int[imp][imp];
		int level=imp-1;
		int si=imp-1;
		int sj=imp/2;
		int max=imp*imp+1;
		
		ar[si][sj]=1;
		for(int i=2;i<max;i++){
			si++;
			sj++;
			
			if(si>level && sj<=level)     //��Խ�磬�й�0
			{
				ar[0][sj]=i;
				si=0;
			}
			else if(si<=level && sj>level)  //��Խ�磬�й�0��
			{
				ar[si][0]=i;
				sj=0;
			}
			else if(si<=level && sj<=level &&ar[si][sj]!=0)   //���ж���Խ�磬���ѱ�ռ�ã��������
			{
				ar[si-2][sj-1]=i;
				si-=2;
				sj-=1;		
			}
			else if(si<=level && sj<=level)   //���ж���Խ�磬��δ��ռ�ã��ͷ���
			{
				ar[si][sj]=i;
			}
			else                              //���ж�Խ�磨ͬ�����ж���Խ�磬���ѱ�ռ�á�����
			{
				ar[si-2][sj-1]=i;
				si-=2;
				sj-=1;		
			}		
		}
		
		for(int j=0;j<imp;j++)
		{
			for(int k=0;k<imp;k++)
			{
				System.out.print(ar[j][k]+"\t");
			}
			System.out.println();
		}*/
		
		
		//5. �ҳ�2-100֮�����������
		/*boolean f;
		int count=0;
		for(int i=2;i<=100;i++)
		{   
			f=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					f=false;
					break;
				}
				
			}
			if(f)
			{   
				count++;
				if(count%10==0)
				{
					System.out.println(i+"\t");
				}else{
				    System.out.print(i+"\t");
				}
			}
			
		}*/
	}

}
