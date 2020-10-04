package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ll= new LinkedList <String>();
		
		//add the values
		ll.add("test");
		ll.add("qtp");
		ll.add("Selenium");
		ll.add("Jenkins");
		
		//print the content
		System.out.println(ll);
		ll.addFirst("First");
		ll.addLast("last");
		System.out.println(ll);
		//get the value from an index
		System.out.println(ll.get(0)); 	
		//set the value to a particular index
		System.out.println(ll.set(1, "change"));
		System.out.println(ll);
		//remove
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		ll.remove(2);
		System.out.println(ll);
		
		//printing value 
		//1. for loop
		System.out.println("print ll values using for loop");
		for(int n=0;n<ll.size();n++)
		{
			System.out.println(ll.get(n));
		}
		
		//2. advance for loop
		System.out.println("print ll values using for each(advance forloop) loop");
		for(String str: ll)
		{
			System.out.println(str);
		}
		
		System.out.println("print ll values using interator ");
		Iterator<String> it= ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("print ll values using while loop ");
		int num=0;
		while(num<ll.size())
		{
			System.out.println(ll.get(num));
			num++;
		}
	}

}
