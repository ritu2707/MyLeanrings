package LearningPrograms;

public class PrimeNumber1 {

	//prime number is one which can be divided by number or 1.
	//13,2
	//1 and o are not prime number
	//2 is the lowest prime number
	//negative number can not prime number
	
	//to find a number is prime or not
	public static boolean isPrime(int num)
	{
		if(num<=1)
		{
			return false;
		}
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
			
		}
		return true;
	}
	
	public static void primenumbercount(int num)
	{
		for(int i=2;i<=num;i++)
		{
			Boolean b= isPrime(i);
			if(b==true)
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
		
		
		System.out.println(isPrime(2));
		System.out.println(isPrime(5));
		System.out.println(isPrime(4));
		 primenumbercount(7);
	}

}
