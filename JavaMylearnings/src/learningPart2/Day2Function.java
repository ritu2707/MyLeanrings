package learningPart2;

public class Day2Function {

	// starting point of java execution
	// copy of each non static method( not static method)of the class is given to the object refereed by reference variable obj
	public static void main(String[] args) {// main is static 
		Day2Function obj= new Day2Function();
		obj.test();
		int result1=obj.pqr();
		System.out.println(result1);
		String s=obj.qa();
        System.out.println(s);
		int result=obj.divison(20, 10);
		System.out.println(result);
		// main method is void it cannot return any value
	}
	
	//non static method
	//return type= void
	public void test()// since it is void retrun type it doensot return any value
	{
		System.out.println("test method");
	}
 
	//return type= int
	public int pqr()//return type should be same as the variable data type which is being returned
	{
		System.out.println("pqr method");
		int a=10;
		int b= 20;
		int c= a+b;
		return c;
	}
	//return type= String
	public String qa()
	{
		System.out.println("qa method");
		String s="selenium";
		return s;
	}
	//x,y= arguments
	//return type= integer
	public int divison(int x,int y)
	{
		System.out.println("division method");
		int d=x/y;
		return d;
		
	}
}
