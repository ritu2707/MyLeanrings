package Testc;

public class Test5 {
	
	public static void fact(int n)
	{
	int factorial=1;
	
	if(n==0)
	{
		System.out.println(1);
	}
	else
	{
		while(n>0)
		{
			factorial=factorial*n;
			n--;
		}
	}
		
			
		
		System.out.println(factorial);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//check if the year is leap year or not
		fact(8);
	}

}
