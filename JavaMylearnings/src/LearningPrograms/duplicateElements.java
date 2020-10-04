package LearningPrograms;

import java.util.HashSet;
import java.util.Set;

public class duplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		String names[]= {"java","c","c++","Python","java","c"};
		
		//1. by using two for loop ,it's more complex o nsquare ,worst solution as it takes more time
		for(int i=0;i<names.length-1;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].equals(names[j]))
				{
					System.out.println("duplicate values are :"+ names[i]);
				}
			}
		}
		
		//2/ by using HashSet class, it inherits Set interface
		//hashset only stores unique values 
		Set <String> set= new HashSet<String>();
		for(String name: names)
		{
			if(set.add(name)== false)
			{
				System.out.println("duplicate element in names array is :"+ name);
			}
		}
		
	}

}
