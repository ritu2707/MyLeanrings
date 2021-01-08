package stringPrograms;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class checkAnagram {
	
	private static boolean isAnagram(String a, String b)
	{
		char[] a1=a.toCharArray();
		char[] b1=b.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(b1);
		
//		if(a1.equals(b1))
//		{
//			return true;
//		}
//		else {
//			return false;
//		}
		return Arrays.equals(a1, b1);
	}

	@Test
	public void testIsAnagram() { 
		assertTrue(isAnagram("word", "wrdo")); 
		assertTrue(isAnagram("mary", "army")); 
		assertTrue(isAnagram("stop", "tops"));
		assertTrue(isAnagram("boat", "btoa")); 
		assertFalse(isAnagram("pure", "in")); 
		assertFalse(isAnagram("fill", "fil")); 
		assertFalse(isAnagram("b", "bbb")); 
		assertFalse(isAnagram("ccc", "ccccccc"));
		assertTrue(isAnagram("a", "a")); 
		assertFalse(isAnagram("sleep", "slep")); 
		
		}

	//Read more: https://javarevisited.blogspot.com/2013/03/Anagram-how-to-check-if-two-string-are-anagrams-example-tutorial.html#ixzz6gmBGnVRm
		
	
//	public static void main(String[] args) {
//		boolean x=anagram("marry","arrym");
//		System.out.println(x);
//	}
}
