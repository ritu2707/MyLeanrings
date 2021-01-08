package stringPrograms;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class ReverseString {
  
	public static String reverse(String s)
	{
		char[] characterArray=s.toCharArray();
		
		int i=0;
		int j=characterArray.length-1;
		if(s==null|| s.isEmpty())
		{
			return s;
		}
		
		while(i<j)
		{
			char temp =characterArray[i];
			characterArray[i]=characterArray[j];
			characterArray[j]=temp;
			i++;
			j--;
			
		}
		//new String or String.valueOf() can be used for charcater array to return String.
		//return new String(characterArray);
		return String.valueOf(characterArray);
	}
	
	 @Test
	 public void reverseBlank()
	 {
		 Assert.assertEquals(" ", reverse(" "));
		
	 }
	 
	 @Test
	 public void reverseNull()
	 {
		 Assert.assertEquals(null, reverse(null));
		
	 }
	 @Test
	 public void reverseString()
	 {
		 Assert.assertEquals("olleH", reverse("Hello"));
		
	 }
	 @Test
	 public void reversePalindrome()
	 {
		 Assert.assertEquals("amma", reverse("amma"));
		
	 }
	
}
