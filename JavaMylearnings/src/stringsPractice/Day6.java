package stringsPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;


public class Day6 {
	//my name
	public static void duplicatecharacters(String a)
	{
		int count=0;
		char charArray[]= a.toCharArray();
		
		HashMap<Character,Integer> hashmap=new HashMap<Character,Integer>();
		for(char c:charArray)
		{
			if(hashmap.containsKey(c))
			{
				hashmap.put(c, hashmap.get(c)+1);
			}
			else
			{
				hashmap.put(c,1);
			}
		}
		
		// Iterate through HashMap to print all duplicate characters of String
		Set<Map.Entry<Character, Integer>> entrySet = hashmap.entrySet(); 
		System.out.println("List of duplicate characters in String"+ a);
		for (Map.Entry<Character, Integer> entry : entrySet) 
		{ 
			if (entry.getValue() > 1) 
			{ 
				System.out.println( entry.getKey()+":"+ entry.getValue());
			}
			
		}
		
	}
	
	@Test
	public void duplicateCharacters()
	{
		duplicatecharacters("my name is ritu aparna");
		
		
	}

}
