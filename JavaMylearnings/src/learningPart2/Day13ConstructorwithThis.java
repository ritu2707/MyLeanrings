package learningPart2;

public class Day13ConstructorwithThis {


	String name;
	int age;
	public Day13ConstructorwithThis(String name,int age)
	{
		this.age=age;
		this.name=name;
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String[] args) {
		
		Day13ConstructorwithThis obj = new Day13ConstructorwithThis("Tom",25);
		//in case we want to intialize the global variable by the value passed in constructor then use this keyword.
	}

}
