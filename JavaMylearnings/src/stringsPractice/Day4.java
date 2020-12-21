package stringsPractice;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;



public class Day4 {
	
	//to check if two words are anagram or not
	//like pot, top
	
	public static boolean checkAnagram(String word1, String word2)
	{
		
		int l1=word1.length();
		int l2=word2.length();
		if(l1!=l2)
		{
		return false;
		}
		else
		{
			char c1[]=word1.toCharArray();
			char c2[]=word2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			//return c1.equals(c2);
			return Arrays.equals(c1, c2);
		}
		
		
	}
	
	@Test
	public void testAnagram()
	{
		//assertTrue(Day4.checkAnagram("word", "wrdo"));       
        //assertFalse(Day4.checkAnagram("b", "bbb"));
		boolean b=Day4.checkAnagram("marry", "rryam");
		System.out.println(b);
	}

}
