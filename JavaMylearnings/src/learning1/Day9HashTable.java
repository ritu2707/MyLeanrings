package learning1;

import java.util.Hashtable;

public class Day9HashTable {

	public static void main(String[] args) {
		//HashTable is also a collection
		//there is no add function, there is put
		//in HashTable there is no index there is key and value.
		
		Hashtable t= new Hashtable();
		t.put("A", 100);//1
		t.put("B", "tom");//2
		System.out.println(t.size());
		t.put(1,"Hello");//3
		t.put(2,"A");//4
		System.out.println(t.size());
		System.out.println(t.get("B"));
		System.out.println(t.get(2));
		//in HashTable any combination is allowed for key and value 
		//to restrict we use comma 
		
		Hashtable<Integer,Integer> t1= new Hashtable<Integer, Integer>();
		t1.put(1, 100);
		t1.put(5, 13);
		System.out.println(t1.get(5));
		
		Hashtable <Integer,String> t2= new Hashtable <Integer,String>();
		t2.put(1, "Ritu");
		t2.put(200, "Shubham");
		System.out.println(t2.get(200));
		
	}

}
