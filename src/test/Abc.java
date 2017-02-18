package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.omg.Messaging.SyncScopeHelper;

public class Abc{
	public static void main(String[] args) {
		//show();
	}
	/**     1  
			2  3  
			3  5  8  
			4  7  12  20  
			5  9  16  28  48  
			6  11  20  36  64  112  
	 * 
	 * @param args
	 */
	public static void show() {
		 int[] forword=new int[6];
		 int[] temp;
		 for(int i=1;i<7;i++){
			 temp=Arrays.copyOf(forword, 6);
			 for(int j=0;j<i;j++){
				 if(j==0){
					 forword[0]=i;
					 System.out.print(forword[0]+"  ");
				 }else{
					 forword[j]=forword[j-1]+temp[j-1];
					 System.out.print(forword[j]+"  ");		 
				 }
			 }
			 
			 System.out.println();
		 }
		                   //0-9:48-57   ;  A-Z:65-90  ; a-z:97-122   
		
	}
	
}
