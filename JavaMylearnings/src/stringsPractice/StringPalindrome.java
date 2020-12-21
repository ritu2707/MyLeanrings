package stringsPractice;

import org.junit.Test;

import junit.framework.Assert;

public class StringPalindrome {

	
	public static boolean stringPalindrome(String str)
	{
		//4-1=3 0 1 2 3
		String rev="";
		char chararray[]=str.toCharArray();
		for(int i=chararray.length-1;i>=0;i--)
		{
			rev=rev+chararray[i];
			
		}
		System.out.println(rev);
		return(str.equalsIgnoreCase(rev));
	}

	
	@Test
	public void testStringPlaindrome()
	{
		boolean x=stringPalindrome("Abba");
		System.out.println(x);
		
		
	}
}

