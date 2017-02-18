package day05;

import java.util.Arrays;
import java.util.Random;

public class Exercise {

	public static void main(String[] args) {
		
		//第4题
		int[] arr=new int[6];
		Random rd=new Random();
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=rd.nextInt(100)+1;
		}
		System.out.println("数组中的数据为："+Arrays.toString(arr));
		int max=arr[0];
		for(int j=1;j<arr.length;j++)
		{
			if(max>arr[j])
				max=arr[j];
		}
		System.out.println("最大值为："+max);
		
		int[] arr2=Arrays.copyOf(arr, arr.length+1);
		System.arraycopy(arr, 0, arr2, 1, arr.length);
		arr2[0]=max;
		System.out.println("新数组为："+Arrays.toString(arr2));

	}

}
