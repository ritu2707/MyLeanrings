package learningPart2;

import java.util.Date;

public class Day6WrapperClass {

	public static void main(String[] args) {
		
		String s="100";
		System.out.println(s+20);
		// hoe to convert this string to integer
		//we have Wrapper class for that 
		
		int i=Integer.parseInt(s);
		System.out.println(i+20);
		//for every data type conversion we have different Wrapper class
		String g="12.33";
		double d= Double.parseDouble(g);
		System.out.println(d+10);
		
		String c="true";
		boolean b= Boolean.parseBoolean(c);
		System.out.println(b);
		
		//String e= "23/12/2009";
		//long d1= Date.parse(e);
		
		//integer to String
	    int w=200;
	    System.out.println(w+20); //it eil give sum of 200 and 20 i.e 220 but if we want 20020 
	    String q=String.valueOf(w);
	    System.out.println(q+20);
	    
	    // if string value is not a proper to get converted to integer
	    String k= "100A";
	    int t=Integer.parseInt(k);//it throws NumberFormatException as it is not a correct candidate 
	    
	    
		
		
		

	}

}
