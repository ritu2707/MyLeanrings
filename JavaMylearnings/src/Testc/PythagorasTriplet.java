package Testc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PythagorasTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3, 1, 4, 6, 5};
		boolean result=pytho(arr);
		System.out.println(result);
		

	}

	
	private static boolean pytho(int[] arr) {
		
//		List<Integer> arrayX= Arrays.asList(3,1,4,6,5);
//		// TODO Auto-generated method stub
//		List<Integer> newarr=arrayX.stream().map(x->x*x).collect(Collectors.toList());
//		System.out.println(newarr);
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				for(int k=j+1;k<arr.length;k++)
				{
					int x=arr[i]*arr[i];
					int y=arr[j]*arr[j];
					int z=arr[k]*arr[k];
					
					if(x==y+z||y==x+z||z==x+y)
					{
						return true;
					}
					
					
				}
			}
				
		}
		
		
		
		return false;
	}

}
