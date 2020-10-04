package MapConcepts;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class hashmap {

	public static void main(String[] args)
	{
		 System.out.println(">.............1....................<");
		//creating hashmap with by default capacity and load factor
		HashMap <Integer,String> map1=new HashMap<>();
		map1.put(100, "I love my country");
		map1.put(200, "India has multiple states");
		map1.put(400, "3rd sentence");
		//if we are copying one hashmap to another we use putAll method
		
		//Creating 2nd hashmap 
		HashMap<String,Integer> map2= new HashMap<>();
		map2.put("one", 2000);
		map2.put("three", 4000);
		map2.put("six", 40000);
		
		//puting one map value to another map  map1 to map2
		  //map2.putAll(map1); not working since map blueprints are different 
		
		//Creating 3rd map map3
		HashMap<String,Integer> map3= new HashMap<>();
		map3.put("two", 130);
		map3.put("four", 230);
		
		//putting map3 into map2
		map3.putAll(map2);
       //Printing key value pair of map3 after merge with map2- key value pair by map.entrySet()
		//whole map is retrieved in form of Set by entrySet() method
		// only key by keySet() in form of set return type
		//only values in form of a collection -value()
		
        Set<Entry<String, Integer>> entrySet = map3.entrySet();
        
        for(Entry<String, Integer> en:entrySet )
        {
        	System.out.println(en.getKey() +" "+ en.getValue());
        }
        System.out.println(">.............2....................<");
	     //to put a key value pair if not always present by putIfAbsent() method
        
        map3.putIfAbsent("one",0);
        map3.putIfAbsent("five", 00);
        for(Entry<String,Integer> en:entrySet)
        {
        	System.out.println(en.getKey() + " "+ en.getValue());
        }
        System.out.println(">...............3..................<");
	    // retrieve a value by hep of key
        System.out.println(map3.get("five"));
		
        System.out.println(">...............4..................<");
		//to check if a particular value or particular key exist in a hashmap or not
        System.out.println(map3.containsKey("eleven"));
        System.out.println(map3.containsValue(0000000));//how may zeroes are added it is considered 0
        System.out.println(">...............5..................<");
        // to find the size of a hashmap
		System.out.println(map3.size());
		// to clear a hashmap to reuse again
		System.out.println(">...............6..................<");
		// map3.clear();
		System.out.println(map3.size());
		System.out.println(">...............7 all keys of map3..................<");
		Set<String> setkey= map3.keySet();
		for (String s:setkey)
		{
			System.out.println(s);
		}
		System.out.println(">...............8 all values of map3..................<");
		Collection<Integer> val= map3.values();
		for(Integer i:val)
		{
			System.out.println(i);
		}
		System.out.println(">...............9 remove a key value..................<");
		map3.remove("five");
		for(Entry<String,Integer> e:entrySet)
		{
			System.out.println(e.getKey()+ " "+ e.getValue());
		}
		System.out.println(">...............10 replace a value for a key..................<");
		map3.replace("four", 4);
		for(Entry<String,Integer> e:entrySet)
		{
			System.out.println(e.getKey()+ " "+ e.getValue());
		}
		System.out.println(">...............11 to syncronise the hashmap..................<");
		// use sync method
		HashMap<String,String> map4= new HashMap<String,String>();
		Map<String, String> m= Collections.synchronizedMap(map4);
		}
}

