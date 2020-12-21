package NumberPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class MissingElement {

	
	public  int missingElement(int a[], int n)
	{
		int arr[] = {1, 2, 4, 6, 3, 7, 8};
		int size= arr.length;
		//1st method
//   List <Integer> list= Arrays.asList(1, 2, 4, 6, 3, 7, 8);
//	    List<Integer>  sortedlist= list.stream().sorted().collect(Collectors.toList());
//	    for(int i=0; i<sortedlist.size()-1;i++)
//	    {
//	      if(sortedlist.get(i+1)==sortedlist.get(i)+1)
//	      {
//	    	  continue;
//	      }
//	      else
//	      {
//	    	 System.out.println(sortedlist.get(i)+1);
//	      }
//	    	  
//	    }
		//2nd method
//		Arrays.sort(arr);
//		for(int i=0;i<size-1;i++)
//		{
//			if(arr[i+1]==arr[i]+1)
//			{
//				continue;
//			}
//			
//			else {
//				System.out.println(arr[i]+1);
//			}
//		}
		
		//3rd method
		
		int sum= (n+1)*(n+2)/2;
		for(int i=0;i<n;i++)
		
			sum -=a[i];
			return sum;
	
		
	}
	
	@Test
	public void testmissingElement(){
		int a[]= {1, 2, 4, 5, 6};		
		int missingint=missingElement(a,5);
		System.out.println(missingint);
	}
}
