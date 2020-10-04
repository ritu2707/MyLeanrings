package learningPart2;

public class Day15ThrowKeyword {

	
	//difference between Throws and Throw
	//throw is used to throw deliberately user defined exception
	//once you add throw then u hav to add throws to the main method
	public static void main(String[] args) throws Exception {
	System.out.println("ABC name");
	
	throw new Exception("Naveen Exception");//deliberately exception
	//since it isa stopping from moving to next line 
	//try catch block is preferred method as comapred to throws keyword for Throw.
	//System.out.println("PQR name");

	}

}
