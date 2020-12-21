package Java8Collectors;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class toListMethod {
	
	public static void main(String[] args) 
    { 
  
        // creating a Stream of strings 
//        Stream<String> s = Stream.of("1", "2", "3", "4"); 
//  
//        // using Collectors toList() function 
//        List<String> myList = s.collect(Collectors.toList()); 
//  
//        // printing the elements 
//        System.out.println(myList); 
		
		Stream<String> s1= Stream.of("12","23","45","45");
		List<String> result= s1.collect(Collectors.toList());
		System.out.println(result);
    } 

}
