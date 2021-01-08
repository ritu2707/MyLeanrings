package Day1;

import java.util.function.Function;

public class FunctionInterface {

	public static void main(String[] args) {
		//Functional Interface is a concept of an interface having only one abstract method.
		// introduced in JDK 1.8
		//@Functional interface annotation
		
		//1. Function Interface it has abstract method apply()
		Function<String,Integer> func= x->x.length();
		int result= func.apply("My name is Ritu");
		System.out.println(result);
        
		//Chaining of function
		Function<Integer,Integer> func2= x->x*20;
		int result2= func.andThen(func2).apply("My name is Ritu");
		System.out.println(result2);
		
	}

}
