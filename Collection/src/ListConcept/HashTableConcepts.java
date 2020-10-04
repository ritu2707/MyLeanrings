package ListConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Hashtable is also key value pair
		//Hashtable key is object 
		//it contains only unique values 
		//it doesnot support null key or null values 
		//otherwise it will give null pointer exception
		//we can have onon generic or generic hastables
		//for improving performace we use HashMap and not HashTable.
		
		
		//containsValue() ,contains(), containsKey()
		
		Hashtable<Integer,String> ht= new Hashtable<Integer,String> ();
		ht.put(102, "Rohan");
		ht.put(980, "Ratina");
		ht.put(308, "Ritu");
		
		Hashtable<Integer,String> ht1= new Hashtable<Integer,String> ();
		ht1=(Hashtable)ht.clone();
		System.out.println(ht);
		System.out.println(ht1);
		
		ht.clear();
		System.out.println(ht);
		System.out.println(ht1);
		
		if(ht1.contains("Ratina"))
				{
			System.out.println("ratina found");
				}
		//for iteration use Enumeration elements() method
		Enumeration e= ht1.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		//2nd way entrySet() set of hashtable values
		       Set s=     ht1.entrySet();
		       System.out.println(s);
		       
		       Hashtable<Integer,String> ht2= new Hashtable<Integer,String> ();
				ht.put(102, "Rohan");
				ht.put(980, "Ratina");
				ht.put(308, "Ritu");
		if(ht1.equals(ht2))
			System.out.println("both are equal");
		
		System.out.println(ht1.get(102));
		System.out.println(ht1.hashCode());
		       
	}

}
