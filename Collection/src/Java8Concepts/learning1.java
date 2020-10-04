package Java8Concepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class learning1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //comparator interface
		
			   List<String> names = Arrays.asList("Adam", "Alexander", "John", "Tom");
			   List<String> result = names.stream()
			     .filter(name -> name.startsWith("A"))
			     .collect(Collectors.toList());
			   
			   System.out.println();
			
	}

}
