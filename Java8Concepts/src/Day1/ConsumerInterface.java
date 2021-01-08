package Day1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
public static void main(String[] args) {
	//it accepts one argument but returns nothing
	//"accept" is the abstract method for Consumer Functional interface
	
	Consumer<String> func= x -> System.out.println(x);
	
	func.accept("My name is Ritu");

	List<Integer> lis1= Arrays.asList(1,3,4,5,6,7);
	
	lis1.forEach(x -> System.out.println(x));
}
}
