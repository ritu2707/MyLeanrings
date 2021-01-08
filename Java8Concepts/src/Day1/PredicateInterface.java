package Day1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterface {
	
public static void main(String[] args) {
	
	Predicate<Integer> func= x-> x>5;
	List<Integer> list1= Arrays.asList(2,3,4,5,6,7,9);
	System.out.println(list1);
	List<Integer> list2=list1.stream().filter(func).collect(Collectors.toList());
	System.out.println(list2);
	
}
}
