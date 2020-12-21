package LearningPrograms;

public class Factorial4 {

	//factorial of a number-
	//4= 4*3*2*1=24
	//3=3*2*1=6
	//factorial of 0=1
	
	public static void factorial(int num)
	{
		int fact=0;
		
		while(num>0)
		{
	     fact=num*(num-1);
	     num=num-1;
	     
		}
		
	}
	public static void main(String[] args) {

		factorial(20);
	}

}
