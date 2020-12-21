package NumberPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class sortInOrder {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n[]= {0,2,1,1,0,2,1,1,0,2};
	
		List<Integer> l=Arrays.asList(n);
		List<Integer> sortedList= l.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		Collections.rotate(sortedList, 3);
		System.out.println(sortedList);
 
      
		
	}

	

	
}
