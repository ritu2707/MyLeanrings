package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class Interation8java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String> series=new ArrayList<String> ();
     series.add("game of thrones");
     series.add("Big bang theory");
     series.add("Friends");
     series.add("breaking bad");
     
     //1st way using java8 feature for each method and lambda expression
     System.out.println("using lamda and forEach method");
     series.forEach(shows->{
    	 System.out.println(shows);
     });
     
     //2nd way is using Iterator 
     System.out.println("using Interator  ");
     Iterator<String> i=  series.iterator();
     while(i.hasNext())
     {
    	 System.out.println(i.next());
    	 
     }
     //3. using Iterator and java 8 lambda and for eachRemaining method
     
     System.out.println("using java 8 lambda and for eachRemaining method");
     Iterator<String> i1=  series.iterator();
    i1.forEachRemaining(show->{
    	System.out.println(show);
    });
    //4. for each loop
    System.out.println("using for each loop");
    for (String show: series)
    {
    	System.out.println(show);
    }
    
    //5. using most common for loop and index way
    //6. using listIterator method
    //this way prints in backward direction
    
	}

}
