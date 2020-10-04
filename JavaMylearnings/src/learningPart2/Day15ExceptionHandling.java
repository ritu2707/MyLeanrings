package learningPart2;

public class Day15ExceptionHandling {

	int a=10;
	//in java there r a lot of exceptions and to handle that we have exception handling
	//becz of this handling code won't be terminated and next line will be executed.
	public static void main(String[] args) {
		
		//1. Arithmetic exception
		//int i=9/0;
		// sSystem.out.println(i);
		//once you try to print you wil get arithmetic exception
		
		//2. null pointer exception
		//if object is null or object reference is null then you try to access the class variable with that object 
		//Day15ExceptionHandling obj=new Day15ExceptionHandling();
		//obj=null;
		//System.out.println(obj.a);
		//another way to get it 
		//Day15ExceptionHandling obj= null;
		
		//exception handling is of different types
		//1. try-catch block
		try {
			int i=9/0;//if this code throws and exception it is caught by catch
			
		}
		//since we cannot remeber all errors or exception it's better to use Exception e
		//even we can use Throwable e or Object e as those r parents of Exception and Error class.
		//Object is the Super Class even parent of Throwable Class.
		catch (ArithmeticException  e){
			e.printStackTrace();//prints the error 
			System.out.println("abc");
		}

	}

}
