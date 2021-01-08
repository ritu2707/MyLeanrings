package stringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class findDuplicate {
	
	private static void findDuplicate(String s)
	{   
		//java
		char[] charArray=s.toCharArray();
		HashMap<Character,Integer> hashmap= new HashMap<Character,Integer>();
		
		
		for(char c:charArray)
		{
			if(hashmap.containsKey(c))
			{
				hashmap.put(c, hashmap.get(c)+1);
			}
			
			else
			{
				hashmap.put(c, 1);
			}
		}
		
		//code to print the numbers of each character
		Set<Map.Entry<Character,Integer>> mapEntry= hashmap.entrySet();
		for(Map.Entry<Character,Integer> m:mapEntry )
		{
			
			if(m.getValue()>1)
			{
			System.out.println(m.getKey()+ ":"+ m.getValue() );
			}
		}
		
	}
	public static void main(String[] args) {
		findDuplicate("Programming");
		System.out.println("____________________________");
		findDuplicate("java");
	}

}
