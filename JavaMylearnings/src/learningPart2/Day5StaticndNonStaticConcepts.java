package learningPart2;

public class Day5StaticndNonStaticConcepts {
         
	String name= "Tom";//non static global variable
	static int age=25;// static global variable
	public static void main(String[] args) {
		
		//global variables can be accessed all across the methods with some conditions( static can be accessed directly/non static can be accessed only with object)
		//to call non static method or variable we need to create class object 
		
		//to call static variable or method we can call
		//1.directly by name
		sum();
		//2. by class name
		Day5StaticndNonStaticConcepts.sum();
		//same goes for static variable by name or by classname 
		System.out.println(age);
		System.out.println(Day5StaticndNonStaticConcepts.age);
		
		//calling non static variables and methods
		Day5StaticndNonStaticConcepts obj= new Day5StaticndNonStaticConcepts();
		System.out.println(obj.name);
		//can i access static method by object refrence ? yes 
		obj.sum();// can be called by object but it's giving warning since the static method can be directly called.
		
	}
	
	public void sendmail() //non static method
	{
		System.out.println("send method");
	}
	
	public static void sum()// static method
	{
		System.out.println("sum method");
	}

}
