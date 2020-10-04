package LearningPrograms;

public class Palindrome2 {

	//reverse number is same as the number
	//151 454 161
	
	public static void palindromecheck(int n)
	{
		int reminder=0;
		int sum=0;
		int t;
		t=n;
		
		while(n>0)
		{
			reminder=n%10;
			sum=(sum*10)+reminder;
			n=n/10;
		}
		if(sum==t)
		{
			System.out.println(" is palindrom number");
		}
		else
		{
			System.out.println(" is not palindrome number");
		}
		
	}
	
	public static void main(String[] args) {
		palindromecheck(245);
		palindromecheck(151);

	}

}
