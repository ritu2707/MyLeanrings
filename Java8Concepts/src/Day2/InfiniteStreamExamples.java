package Day2;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStreamExamples {

	public static void main(String[] args) {
		//iterate() method takes 2 argument , one is seed and another is unaryOperator 
		
       List<Integer> list1=IntStream.iterate(0, n-> n+2)
       .mapToObj(Integer::valueOf)
       .limit(20)
       .collect(Collectors.toList());
       
       System.out.println(list1);
       
       //generate() method 
       //it is also static method
       //it takes one supplier
       
       List<Integer> list2=Stream.generate(()-> (new Random()).nextInt(100))
       .limit(10)
       .collect(Collectors.toList());
       
       System.out.println(list2);
	}

}
