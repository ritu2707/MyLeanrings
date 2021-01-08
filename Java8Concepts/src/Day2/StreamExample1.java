package Day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {
	public static void main(String[] args) {
		
		//example of filter()
		//filter() method accepts Predicate Functional Interface
		
		List<String> product=Arrays.asList("iphone","macbook","SamsungGalaxy","charger","notebook");
		product.forEach(ele->System.out.println(ele));
		
		List<String> product1=product.stream().filter(ele-> !ele.equals("charger")).collect(Collectors.toList());
		
		System.out.println(product1);
		//another way
		System.out.println("********************");
		product1.forEach(ele1->System.out.println(ele1));
	}

}
