package ListConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hashMapConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashMap implements Map Interface
		//HashMap extends AbstractMap class
		//it contains all unique key
		//it can have one null key and multiple null values.
		//it maintins no order
		
		HashMap <Integer,String> hm1= new HashMap<Integer,String> ();
		hm1.put(1, "Ram");
		hm1.put(2, "Tom");
		hm1.put(3, "John");
		
	   //since there is no index we cannot use for ,iterator and while loop so we use Entry set
		for(Entry m:hm1.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		//using user defined one
		HashMap<Integer, Employee> hm= new HashMap <Integer, Employee>();
		Employee e1=new Employee("Rohan",24,"QA");
		Employee e2=new Employee("Ritu",25,"Dev");
		Employee e3=new Employee("Ashish",27,"lead");
		
		hm.put(1, e1);
		hm.put(201, e2);
		hm.put(311, e3);
		for(Entry<Integer,Employee> e:hm.entrySet())
		{
			int keyid= e.getKey();
			Employee ee=e.getValue();
			
			System.out.println(keyid);
			System.out.println(ee.name +" "+ ee.age +" "+ ee.dept);
			
			
			
		}
	}

}
