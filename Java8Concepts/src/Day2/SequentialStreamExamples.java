package Day2;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialStreamExamples {

	public static void main(String[] args) {
		
		//directly create Stream of double
     Stream.of(1.3,6.7,8.9)
     .mapToInt(Double::intValue)
     .mapToObj(ele-> ele+"A")
     .forEach(x-> System.out.println(x));
     
     //converting string to Integer Object
     Stream.of("a1","b23","c980")
     .map(ele-> ele.substring(1))
     .mapToInt(Integer::parseInt)
     .average()
     .ifPresent(System.out::println);
     
     //IntStream range method example
     IntStream.range(1,4).forEach(System.out::println);
     
     //findFirst() example
     Stream.of("Ritu","Ashish","Shubham","Rahul")
     .findFirst()
     .ifPresent(ele->System.out.println(ele));
     
     //limit method 
     Stream.iterate(0, n->n+1).limit(10).forEach(System.out::println);
     
     //print odd number
     Stream.iterate(0, n->n+1)
     .filter(x->x%2!=0)
     .limit(10)
     .forEach(System.out::println);
     
     
	}

}
