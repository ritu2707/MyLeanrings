package Testc;


import java.util.HashMap;

public class ArrayExample {
		
		// Function to return the  
	    // digit sum of n  
	    static int digitSum(int n)  
	    {  
	        int sum = 0;  
	        while (n != 0) 
	        {  
	            sum += (n % 10);  
	            n /= 10;  
	        }  
	        return sum;  
	    }  
	      
	    // Function to return the maximum  
	    // sum possible for a pair whose  
	    // digit sum is equal  
	    static int findSum(int arr[], int n)  
	    {  
	      
	        HashMap<Integer, Integer> mp = new HashMap<Integer,Integer>();  
	          
	        for (int i = 0; i < 10 ; i++) 
	        { 
	            mp.put(i, 0); 
	        } 
	          
	        int ans = -1;  
	      
	        // Traversing through all the  
	        // elements of the array  
	        for (int i = 0; i < n; i++)  
	        {  
	      
	            // Finding the digit sum of arr[i]  
	            int dSum = digitSum(arr[i]);  
	              
	            if ((int)mp.get(dSum) != 0) 
	            {  
	                ans = Math.max(ans, (int)mp.get(dSum) + arr[i]);  
	            }  
	            mp.put(dSum,Math.max((int)mp.get(dSum), arr[i])) ; 
	        }  
	        return ans;  
	    }  
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int arr[] = { 55, 23, 32, 46, 88 };  
        int n = arr.length;  
      
        System.out.println(findSum(arr, n)); 
		
		
	}

}
