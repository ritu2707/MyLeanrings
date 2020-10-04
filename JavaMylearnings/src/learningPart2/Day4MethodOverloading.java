package learningPart2;

public class Day4MethodOverloading {

	public static void main(String[] args) {
	
		Day4MethodOverloading obj= new Day4MethodOverloading();
		obj.sum();
		obj.sum(14);
		int result= obj.sum(12, 20);
		System.out.println(result);
	}
	// methods cannot be created inside another method
	// methods with same name and same parameters are not allowed
    // method overloading--->when methods name are same but different types/numbers of parameters within the same class 
	//main method can be overloaded even practically we do not use that.
	public void sum()
	{
		System.out.println("sum method 1");
	}
	
	public void sum(int i) {
		System.out.println("sum method 2");
		
	}
	public int sum(int j,int k)
	{
		System.out.println("sum method 3");
		int sum=j+k;
		return sum;
	}
}
