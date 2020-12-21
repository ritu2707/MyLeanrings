package NumberPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RepeatTest2Way {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]= {1, 5, 3, 4, 3, 5 ,6};
		int m=n.length;
		
		findRepeat( n,  m);
		

	}

	private static void findRepeat(int[] n, int m) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> map1=new HashMap<Integer,Integer>();
		for(int i=0;i<m;i++)
		{
			if(map1.containsKey(n[i]))
			{
				map1.put(n[i], map1.get(n[i])+1);
			}
			else
			{
			map1.put(n[i], 1);
			}
			
		}
		
		//traversing through map to check repeated integer 
		Set<Map.Entry<Integer, Integer>> entrySet = map1.entrySet(); 
		System.out.println("List of duplicate Integer array");
		for (Map.Entry<Integer, Integer> entry : entrySet) 
		{ 
			if (entry.getValue() > 1) 
			{ 
				System.out.println( entry.getKey()+":"+ entry.getValue());
			}
			
		}
	}

}
