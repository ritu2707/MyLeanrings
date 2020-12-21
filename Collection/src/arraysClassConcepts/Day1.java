package arraysClassConcepts;

import java.util.Arrays;
import java.util.List;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Arrays class has all the static methods
		
		//there r many things done on Array requires for loop 
		//those can be easily done by direct use of methods
		
		//1. Arrays.asList()
		//2. Arrays.sort(n), Arrays.fill(n,67), Arrays.toString(n)
		
		int n[]= {10,4,45,7,12};
		Arrays.sort(n);
		System.out.println(Arrays.toString(n));
		Arrays.fill(n, 56);
		System.out.println(Arrays.toString(n));
		//list maintains order, it returns in the same order it accepts.
		List<String> ls=Arrays.asList("Rohan","Ritu","Veena","Ashish");
		System.out.println(ls);
	}

}
