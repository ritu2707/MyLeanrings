package learning1;

public class Day3IfElse {

	public static void main(String[] args) {
	
		// comparison operators <,>,<=,>=,==,!=
		//= is assignment operator but == is comparison operator
		int a=500;
		int b=200;
		
		if (b>a)
		{ 	
			System.out.println("b is greater than a");
		}
		else
		{
			System.out.println("a is greater than b");
		}

		int c= 400;
		int d=900;
		if(c!=d)
		{
			System.out.println("c and d are not equal");
		}
		
		// write s logic to find the highest number out of three numbers
		int a1= 200;
		int b1=600;
		int c1=900;
		if (a1>b1 & a1>c1) //false& false =false
		{
			System.out.println("a1 is the greatest");
				
		}
		else if(b1>c1)
		{
			System.out.println("b1 is the greatest");
		}
		else
			System.out.println("c1 is the greatest");
	}

}