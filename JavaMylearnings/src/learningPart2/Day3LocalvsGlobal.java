package learningPart2;

public class Day3LocalvsGlobal {
	
	//Global /class variable
	String name="Tom";
	int age=25;//used throughout the program
	

	public static void main(String[] args) {
		
		int i=10;//local variable
		System.out.println(i);
		Day3LocalvsGlobal obj= new Day3LocalvsGlobal();
		//copy of non static method and variable are given to object new Day3LocalvsGlobal() 
		System.out.println(obj.name);
		System.out.println(obj.age);
		

	}
	public void abc()//age is local variable 
	{
		int i=20;
		int j=30;
		int age=25;
	}

}
