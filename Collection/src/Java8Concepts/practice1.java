package Java8Concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     List<Integer> list1= new ArrayList<>();
//     list1.add(12);
//     list1.add(34);
//     
    // another way to write in one single line
     List<Integer> list2= Arrays.asList(1,2,4,5,3);
     System.out.println(list2);
     
     //use of further map method to find the square of the numbers of the list2
     List<Integer> squareList= list2.stream().map(n->n*n).collect(Collectors.toList());
     System.out.println(squareList);
    // List<Integer> squareList2= list2.stream().map(name->name*name).forEach(s->System.out.println(s));
     
     //use of filter method
     List<String> names= Arrays.asList("Rohan","Mike","Ramesh","Anand");
     
     List<String> namebeginswithR = names.stream().filter(s->s.startsWith("R")).collect(Collectors.toList());
     System.out.println(namebeginswithR);
     //use of sorted method
     List<String> sortednames= names.stream().sorted().collect(Collectors.toList());
     System.out.println(sortednames);
     //coversion of integer List to set of square of numbers of list
     List<Integer> num= Arrays.asList(12,4,5,6,2,3);
     Set<Integer> numsquareset= num.stream().map(n->n*n).collect(Collectors.toSet());
     System.out.println(numsquareset);
     //use of  for each method
     List<Integer> num1= num.stream().filter(n->n%2==0).collect(Collectors.toList());
     System.out.println(num1);
     num.stream().map(n->n*n*n).forEach(s->System.out.println(s));
     int num11=num.stream().filter(x->x%3==0).reduce(0,(ans,i)-> ans+i);
     System.out.println(num11);
     
     int min1 = Arrays.stream(new int[]{1, 2, 3, 4, 5})
    		  .min()
    		  .orElse(0);
//    		assertEquals(1, min1);
    	System.out.println(min1);	 
     int min2 = Arrays.stream(new int[]{})
    		  .min()
    		  .orElse(0);
//    		assertEquals(0, min2);
     System.out.println(min2);	
    		 
     
	}

}
