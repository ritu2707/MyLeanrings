package Java8Collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningExample {
	
	public static void main(String[] args) 
    { 
       
	// Create a character array 
    char[] ch = { 'G', 'e', 'e', 'k', 's', 
                  'f', 'o', 'r', 
                  'G', 'e', 'e', 'k', 's' }; 
    
//    String newString= Stream.of(ch).map(ar-> new string(ar)).collect(Collectors.joining());
//    System.out.println(newString);

    // Convert the character array into String 
    // using Collectors.joining() method 
    String chString = Stream.of(ch) 
                          .map(arr -> new String(arr)) 
                          .collect(Collectors.joining()); 

    // Print the concatenated String 
    System.out.println(chString); 

}
}
