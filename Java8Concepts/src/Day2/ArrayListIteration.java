package Day2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list1 = Arrays.asList("Breaking Bad", "Big Bang Theory", "freinds", "GOT");

		// 1sy way by help of forEach() method
		System.out.println("*********************1st way************************");
		list1.forEach(ele -> System.out.println(ele));
		System.out.println("*********************2nd way************************");
		// 2nd way by using Iterator
		Iterator<String> iterator1 = list1.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());

		}
		System.out.println("**********************3rd way***********************");
		// 3rd by help of Java8 foreachRemaining()
		iterator1 = list1.iterator();
		iterator1.forEachRemaining(ele -> System.out.println(ele));

		// 4th by help of for each loop
		System.out.println("**********************for each loop***********************");
		for (String tvseries : list1) {
			System.out.println(tvseries);
		}
		// 5th by help of simple for loop
		System.out.println("**********************for loop***********************");
		for(int i=0; i<list1.size();i++)
		{
			System.out.println(list1.get(i));
		}
	}

}
