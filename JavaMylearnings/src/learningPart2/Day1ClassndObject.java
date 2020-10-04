package learningPart2;

public class Day1ClassndObject {  
	//global variable
	int mod;
	int wheel;

	public static void main(String[] args) {
		//OOPs concept 1
		//new Day1ClassndObject() is object here
		// obj and obj2 are Object reference variable
		// "new" keyword is used to create object of the class
		//below we are passing the class property to each object 
		Day1ClassndObject obj= new Day1ClassndObject();
		Day1ClassndObject obj2= new Day1ClassndObject();
		obj.mod= 2005;
		obj.wheel=4;
		
		obj2.mod=2014;
		obj2.wheel=3;
		
		System.out.println(obj.mod);
		System.out.println(obj.wheel);
		
		System.out.println(obj2.mod);
		System.out.println(obj2.wheel);
		
	}

}
