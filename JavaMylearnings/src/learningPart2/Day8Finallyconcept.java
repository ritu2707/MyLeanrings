package learningPart2;

public class Day8Finallyconcept {

	public static void main(String[] args) {
		
		state();
		state1();

	}
  public static void state()
  {
	  try {
		  System.out.println("try method 1");
	  }
	  finally
	  {
		  System.out.println("finally statement is always displayed");
	  }
  }
  public static void state1()
  { 
	  int i=10;
	  try {
		 int k= i/0;
	  }
	  catch(NullPointerException e)//it is not executed as it has NUllPointerException but i/0 is ArithmeticException
	  {
		  System.out.println("catch block");
	  }
	  finally
	  {
		  System.out.println("finally statement is always displayed");
	  }
  }
}
