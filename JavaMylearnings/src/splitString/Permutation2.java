package splitString;

import java.util.stream.IntStream;

public class Permutation2 {
	
	// Function to print all the distinct 
    // permutations of str 
    static void printDistinctPermutn(String str,String ans) 
    {
////    {     char alphabet[]=new char[26];
////    	for (char c = 'a'; c <= 'z'; c++) {
////    	    alphabet[c - 'a'] = c;
////    	    System.out.println(alphabet[c]);
////    	}
////    	
//    	char[] alpha = new char[26];
//    			for(int i = 0; i < 26; i++){
//    				
//    			   alpha[i] = (char)(97 + i);
//    			    System.out.println(  alpha[i]);
    			    
   IntStream.rangeClosed('A', 'Z').mapToObj(var -> (char) var).forEach(System.out::println);
    			}
        // If string is empty 
//        if (str.length() == 0) { 
//  
//            // print ans 
//           // System.out.print(ans + " "); 
//            return; 
//        } 
//  
        // Make a boolean array of size '26' which 
        // stores false by default and make true  
        // at the position which alphabet is being 
        // used 
       // boolean alpha[] = new boolean[26]; 
  
//        for (int i = 0; i < str.length(); i++) { 
//  
//            // ith character of str 
//            char ch = str.charAt(i); 
//  
//            // Rest of the string after excluding  
//            // the ith character 
//            String ros = str.substring(0, i) +  
//                         str.substring(i + 1); 
  
            // If the character has not been used  
            // then recursive call will take place.  
            // Otherwise, there will be no recursive 
            // call 
//            if (alpha[ch - 'a'] == false) 
//            	//System.out.println(alpha[ch - 'a']);
//                printDistinctPermutn(ros, ans + ch); 
//            alpha[ch - 'a'] = true; 
     //   } 
    
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String s = "geek"; 
        printDistinctPermutn(s, ""); 
    } 
} 


