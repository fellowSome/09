package day04;

import java.util.Scanner;

public class PopSortDemo {

	public static void main(String[] args) {
		
		//1. 升序
		/* int[] arr = {89,50,84,57,61,20,86};
		    for(int i=0;i<arr.length-1;i++)           //length-1是有必要的，
		    {          
		        for(int j=0;j<arr.length-1-i;j++)     //length-1同样是有必要的，
		        {    		                           //接下来的if是按升序排列，所以每次外层循环后最大值排到了“最后”，因此内层循环相应的就要从“0”开始少循环“i”次
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
		
		//2. 降序
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
		
		
		//3. 乘法表
		/*for(int i=1;i<10;i++){
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}*/
		
		//4. 数字魔方，行之和==列之和==对角线之和
		/*System.out.println("输入一个奇数：");
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
			
			if(si>level && sj<=level)     //行越界，行归0
			{
				ar[0][sj]=i;
				si=0;
			}
			else if(si<=level && sj>level)  //列越界，列归0；
			{
				ar[si][0]=i;
				sj=0;
			}
			else if(si<=level && sj<=level &&ar[si][sj]!=0)   //行列都不越界，且已被占用，放在哪里？
			{
				ar[si-2][sj-1]=i;
				si-=2;
				sj-=1;		
			}
			else if(si<=level && sj<=level)   //行列都不越界，且未被占用，就放那
			{
				ar[si][sj]=i;
			}
			else                              //行列都越界（同“行列都不越界，且已被占用”处理）
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
		
		
		//5. 找出2-100之间的所以质素
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
