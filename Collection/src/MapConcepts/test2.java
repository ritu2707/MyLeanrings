package MapConcepts;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Given a list of employees, you need to filter all the employee whose age is greater than 20 and print the employee names using Java8 API's

		HashMap<Integer,String> l= new HashMap<>();
		l.put( 11,"name1");
		l.put( 32,"name2");
		l.put(33,"name3" );
		
		
		Set<Entry<Integer,String>> entrySet = l.entrySet();
		for(Entry<Integer,String> e:entrySet )
		{
			if(e.getKey()>20)
			{
				System.out.println(e.getValue());
			}
				
		}
		
		
	}

}
