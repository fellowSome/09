package day05;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo {

	public static void main(String[] args) {
		
		// 1. Pop
		/*
		 * 
		 * 比较冒泡排序和Arrays.sort()的效率
		 * 
		 */
		int[] arr=new int[10000];
		Random rd=new Random();
		for(int t=0;t<10000;t++)
		{
			arr[t]=rd.nextInt(700);
		}
		long a=System.currentTimeMillis();
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	    long b=	System.currentTimeMillis();
	    System.out.println(b-a);
		/*for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
		}*/
		
		
		
		long c=System.currentTimeMillis();
		Arrays.sort(arr);
		long d=	System.currentTimeMillis();
		System.out.println(d-c);
	
	}

}

class MaxOfArray{
	/*
	 * 4. 数组复制
	 * 
	 *     1)System.arraycopy(a,0,b,1,3)
	 *     
	 *     2)c=Araays.copyOf(a,7) 
	 * 
	 * 
	 * 
	 * 
	 * */
	 public void copy(){
		int[] a={1,2,3};
		int[] b=new int[4];
	    System.arraycopy(a,0,b,1,2);
	    b[0]=9;
	    
	    for(int i=0;i<b.length;i++)
	    {
	    	System.out.println(b[i]);
	    }
	    
	    int[] c=Arrays.copyOf(a, 7);
	    a=Arrays.copyOf(a, 9);    //假扩容，实质还是复制。
	 }
	
}
