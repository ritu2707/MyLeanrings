package learningPart2;

public class Day15ThrowsKeyword {

	//in throw way we cannot report error or any message 
	//now JVM will handle the exception for main method
	//we can mix try catch along with throws
	//eg- sum can have try catch nd just div can have throws keyword
	public static void main(String[] args) throws ArithmeticException{//since main is calling sum method
		Day15ThrowsKeyword obj= new Day15ThrowsKeyword();
     obj.sum();
	}
   public void sum() throws ArithmeticException//since div is called in sum method 
   {
	   div();
   }
   
   public void div() throws ArithmeticException
   {
	   int i=9/0;//arithmetic exception it will be handled by throws keyword
   }
}
