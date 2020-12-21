package Testc;

import java.util.regex.Pattern;

public class Test12 {
//String s= Your Policy Number is P-10000543/00 created sucesfully .

public static void extractValue()

{
	String s="Your Policy Number is P-10000543/00 created sucesfully ";

    String arrayC[]= s.split(" ");
    int size= arrayC.length;
    for(int i=0;i<size-1;i++)
    {
    	if(arrayC[i].contains("-"))
    		System.out.println(arrayC[i]);
    }

}
public static void extractValue2()

{
	String s="Your Policy Number is P-10000543/00 created sucesfully ";
	
	String REGEX="P-";
	
	//Creating a pattern using REGEX
	Pattern pattern= Pattern.compile(REGEX);

    String arrayC[]= pattern.split(s);
    for(int i=0;i<arrayC.length;i++)
    {
    	System.out.println(arrayC[i]);
    }

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		extractValue();
		extractValue2();
	}

}
