package Java8Collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingExample {

	public static void main(String[] args) 
    { 
        // creating stream of strings 
//        Stream<String> s = Stream.of("Akash","Harsh", 
//                        "Shubham","Nishant","Pratik"); 
//  
//        // counting number of strings in stream 
//        long count_string =  s.collect(Collectors.counting()); 
//  
//        System.out.println(count_string); 
		
		Stream<String> s= Stream.of("Rohan","Ritu","Ramesh","rakesh");
		Long count= s.collect(Collectors.counting());
		
		System.out.println(count);
    } 
}
