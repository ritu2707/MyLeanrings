package arraysClassConcepts;

import java.util.Arrays;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Get the Array 
        int[] intArr = { 10, 20, 15, 22, 35 }; 
  
        // Get the second Array 
        int[] intArr1 = { 10, 15, 22 }; 
  
        // To compare both arrays 
        System.out.println("Integer Arrays on comparison: "
                           + Arrays.compare(intArr, intArr1));
        System.out.println("index of 22 :" + Arrays.binarySearch(intArr1, 22));
        
        //to check if both arrays are equal or not
        System.out.println(Arrays.equals(intArr, intArr1));
	}

}
