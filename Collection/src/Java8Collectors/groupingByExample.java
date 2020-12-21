package Java8Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class groupingByExample {
	
	//to count the distint number of the elements by help of groupingBy() and identify() methods.
	//groupingBy() method belongs to Collectors class in Java
	//it accepts 2 parameters function nd classifier
	//it returns in form of Map
	//
	public static void main(String[] args) 
    { 
        
        // Get the List 
        List<String> list1 = Arrays.asList("geeks", "for", "geeks","rohan","rohan");
        
        //to find the number of repeating elements
        //by help of map
        Map<String, Long> map1= list1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        
        System.out.println(map1);
        
        
  
       
        
    } 
} 


