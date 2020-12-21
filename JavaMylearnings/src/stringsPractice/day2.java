package stringsPractice;

import org.junit.Assert;
import org.junit.Test;
//count number of vowel and constant in a string
public class day2 {
	
	private  static int countVolume(String str)
	{ 
		int vowl=0;
		
		char charArray[]= str.toCharArray();
		for(char c:charArray)
		{
			switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':	
				vowl++;
				
				break;
				default:
	
			}
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

