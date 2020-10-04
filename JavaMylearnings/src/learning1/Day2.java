package learning1;

public class Day2 {

	public static void main(String[] args) {
		
		//string concatenation
		// if string is written first then double or integer if added will behave as string
		//+ is concatenation operator 
		// println is used to add a new line
		//print is used to just print the line at the console
		int a=100;
		int b=200;
		String x="hello";
		String y= "world";
		
		double d1= 12.33;
		double d2= 45.66;
		boolean b1= true;
		
		System.out.println(a+b);
		System.out.println(x+y);//execution will be from left to right
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+y+b);
		System.out.println(d1+d2);
		System.out.println(x+y+d1+d2);
		System.out.println("the value of a:"+a);
		System.out.print("hello world");
		System.out.println("hello testing");
		System.out.println(x+b1);

	}

}
