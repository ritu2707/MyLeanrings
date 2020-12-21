package splitString;

import java.util.regex.Pattern;

public class RegExpDay2 {

	public static void checkMethod(String s)
	{
		//String[] c=s.split("for");
		String regex="#1234";
//		for(String s1:c)
//		{
//			System.out.println(s1);
//		}
		String text = "geeks1for2geeks3"; 
		  
        // Specifies the string pattern which is to be searched 
        String delimiter =  "\\d"; 
        Pattern pattern = Pattern.compile(delimiter, 
                                        Pattern.CASE_INSENSITIVE); 
  
        // Used to perform case insensitive search of the string 
        String[] result = pattern.split(text); 
        for(String s4:result)
        {
        	System.out.println(s4);
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "#1234GeeksforGFeeks";
		checkMethod(s);

	}

}
