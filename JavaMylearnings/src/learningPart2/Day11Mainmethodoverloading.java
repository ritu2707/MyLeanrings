package learningPart2;

public class Day11Mainmethodoverloading {

	
	//main method can be overloaded
	//but concept is method name can be same ,arguments type and number should be different
	//which main method wil be executed-- JVM will search for standard main method as per signature so 1st one 
	//to call all other 3 they all need to be called from main method
	//since the methods are static they can be called directly or with class name outside the class.
	//if 1st method is not there other cannot be executed.
	//main method of class A can be called inside main method of class B by help of class name.
	public static void main(String[] args) {
		System.out.println("main method 1");
		Day11Mainmethodoverloading.main(10);
		main( "hello");
		main(3, 3);
	}
	
	public static void main(String s)
	{
		System.out.println("main method 2");
	}
	public static void main(int i)
	{
		System.out.println("main method 3");
	}
	public static void main(int i,int j)
	{
		System.out.println("main method 4");
	}
}
