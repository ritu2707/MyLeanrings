package stringPrograms;

//import org.springframework.util.StringUtils;

public class countACharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input ="today is monday";
		System.out.println("Count number of a");
		int count=0;
		char[] characterArray=input.toCharArray();
		
		
		//1. by help of Spring Framework -> StringUtils method countOfOccurance()
		//int count= StringUtils.
		
		//2nd way is using Apache StringUtils class method
		//int count= org.apache.commons.lang.StringUtils.countMatches(input, "a");
		
		//3rd by help of loop
		for(int i=0; i<characterArray.length-1;i++)
		{
			if(characterArray[i]=='a')
				count++;
		}
		System.out.println(count);

	}

}
