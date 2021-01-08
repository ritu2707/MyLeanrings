package stringPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstNonRepetativechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="elephant";
	//once we want count of each elemnts of so many things 
		//we should use hashmap
		// since we want first non repetative i.e order matters
		//so we will use LinkedHashMap
		
		char[] charArray=input.toCharArray();
		
		HashMap<Character,Integer> hasmap= new LinkedHashMap<Character,Integer>();
		
		for(char c:charArray)
		{
			if(hasmap.containsKey(c))
			{
				hasmap.put(c,hasmap.get(c)+1);
			}
			else
			{
				hasmap.put(c, 1);
			}//h->1,e->1,l->1,l->2,o->1
		}
		
		
       Set<Map.Entry<Character,Integer>> hashset= hasmap.entrySet();
       for(Map.Entry<Character,Integer> h:hashset)
       {
    	   if(h.getValue()==1)
    	   {
    		   System.out.println(h.getKey()); 
    	   }
    	   
       }
      
	}

}
