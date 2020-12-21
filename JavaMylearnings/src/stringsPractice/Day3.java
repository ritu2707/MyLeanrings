package stringsPractice;

import java.util.regex.Pattern;

import org.junit.Assert;
import org.junit.Test;
// it didn't weork

public class Day3 {
	
	private  static int countVolume(String str)
	{ 
		int vowl=0;
		
		char charArray[]= str.toCharArray();
		for(char c:charArray)
		{
	       if(Pattern.matches("[aeiou]", Character.toString(c)));
	       vowl++;
	
		}
		
		return vowl;
		
	}
@Test
public void testcount()
{
	int num= countVolume("my name is ritu aparna");
	Assert.assertEquals(7, num);
}

}

