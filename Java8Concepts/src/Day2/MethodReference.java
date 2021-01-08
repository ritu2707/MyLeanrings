package Day2;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
public static void main(String[] args) {
	
	List<Integer> list1= Arrays.asList(1,5,45,78,90);
	//printing by help of method reference
	
	//forEach() method belongs to Iterable interface
	
	list1.forEach(System.out::println);
}
}
