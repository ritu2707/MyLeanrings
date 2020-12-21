package stringsPractice;

import java.util.ArrayList;

public class Day7 {
	public void reverseString(String word)
	
    {
		
		System.out.println(word);
        String[] wordArray=word.split("\\.");
		for(int i=0; i<=wordArray.length-1;i++)
		{
			  System.out.println(wordArray[i]);
		}
      
        String reverse="";
       
        for(int i=wordArray.length-1; i>=0;i--)
        {
        	
            reverse=reverse+"."+wordArray[i];
        }
        
        System.out.println(reverse.substring(1));
        
    }
	public static void main (String[] args) {
		//code
		Day7 g=new Day7();
		g.reverseString("i.like.this");
		g.reverseString("my.name.is");
		
	}


}
