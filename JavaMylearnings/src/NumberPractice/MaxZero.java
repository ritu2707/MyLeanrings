package NumberPractice;

import java.util.Arrays;
import java.util.List;


public class MaxZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10, 20, 3000, 9999, 200};
		int m=arr.length;
		maxZero(arr,m);

	}
	

	private static void maxZero(int[] arr, int m) {
		// TODO Auto-generated method stub

		int count=0;
		for(int i=0;i<m;i++)
		{
			if(arr[i]%10==0)
			{
				int n=arr[i];
				while(n>0 && n%10==0)
				{
					
					int q=n/10;
					count++;
					n=q;	
				}
			}
			System.out.println("count of zero for "+ arr[i]+" "+ count);
			count=0;
			
			
		}
	
		
	}

}
