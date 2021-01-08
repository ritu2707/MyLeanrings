package Day1;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterface {
	
	public static void main(String[] args) {
		
		 //BinaryOperator is a functional interface which extends BiFunction another interface
		//BiFunction interface accepts 3 arguments in signature 
		
		BinaryOperator <Integer> func=(x1,x2)->x1+x2;
		
		int result= func.apply(20, 50);
		System.out.println(result);
		
		BiFunction<Integer,Integer,Integer> func2=(x,y)->x*y;
		int result2=func2.apply(90, 30);
		System.out.println(result2);
		
	}

}
