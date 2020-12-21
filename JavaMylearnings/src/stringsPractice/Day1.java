package stringsPractice;

//occurance of any chnaracter in a String can be found by APIs--- 
//1. Spring Framework - StringUtils class has countOccurancesOf(input,"a")
//2. by Apache common lang Stringutils lass countMatches(input,"a")
//3. by for each loop, or for loop charAt[i]=='a'

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String teststring="my country is India";
       System.out.println(countRepeatingchar(teststring));
	}

	private static int countRepeatingchar(String string) {
		
		//int num= StringUtils.countOccurrencesOf(string, "a");
		// TODO Auto-generated method stub
		int count=0;
		char chararray[]= string.toCharArray();
		for(char c:chararray)
		{
			if(c=='i'|| c=='I') {
				count++;
			}
			
		}
		return count;
	}

	
}
