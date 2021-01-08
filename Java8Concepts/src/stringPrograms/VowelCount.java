package stringPrograms;

public class VowelCount {
	
	private static void countVowel()
	{
		String[] input= {"ritu","ashish","apple","boy"};
		for(String i:input)
		{
			char[] charcterarray=i.toCharArray();
			int count=0;
			for(char c:charcterarray)
			{
				switch(c) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					count++;
					break;
					
					default:
				}
			}
			System.out.println("count of vowels in "+ i+ ":"+ count);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countVowel();
	}

}
