package stringPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.junit.Test;

public class findNumbers {
  private static boolean numbersFind(String s)
  {
	  Pattern p=Pattern.compile("[0-9]");
	  Matcher m=p.matcher(s);
	  if(m.find())
	  {
		  return true;
	  }
	  else {
		  return false;
	  }
  }
  
  @Test
  public void checkNumber()
  {
	  Assert.assertTrue(numbersFind("Ritu456"));
	  Assert.assertFalse(numbersFind("Ritu"));
	  
	  
  }
}
