package LearningPrograms;

import java.util.Arrays;

public class smallestLaregestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// time complexity is o(n) 
     int number[]= {-10,20,-77,234,567,9,7899};
     
     int largest=number[0];
     int smallest=number[0];
     for(int i=1;i<number.length;i++)
     {
    	 if(number[i]>largest)
    		 largest=number[i];
    	 else if(number[i]<smallest)
    	 {
    		 smallest=number[i];
    	 }
     }
     System.out.println("array of the numbers: "+Arrays.toString(number));
     System.out.println("largest number of the array is :"+ largest);
     System.out.println("smallest number of the array is :"+smallest);
	}

}

