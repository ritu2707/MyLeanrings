package learningPart2;

public class Day12ConstructorConcept {

	//Constructor can be overloaded
	//it does not return value
	//be default a hidden constructor is already there so whenever we create a object default constructor will be called.
	//if we have created parameterised constructor ,JVM doesnot create by default constructor
	public Day12ConstructorConcept()
	{
		System.out.println("default constructor");
	}
	public Day12ConstructorConcept(int i)
	{
		System.out.println("one parameter");
		System.out.println(i);
	}
	
	public Day12ConstructorConcept(int i,int j)
	{
		System.out.println("2 paramters");
		System.out.println(i+j);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day12ConstructorConcept obj= new Day12ConstructorConcept();//in another word it is calling default constructor
		Day12ConstructorConcept obj1= new Day12ConstructorConcept(10);//no need to call obj. constructor name 
		Day12ConstructorConcept obj2= new Day12ConstructorConcept(10,20);//the moment we create reference variable nd new it will call constructors
		
		
	}

}
