package learning1;

public class Day4Loops {

	public static void main(String[] args) {
		// loops concepts 
		
		//1. while loop :if i++ is not added, it will go in infinite loop
		int i =1;// Initialization
		while(i<=10) {// Conditional
			System.out.println(i);
			i++;//incremental/decremental part 
		}
       //2. for loop  :
		for(int j=0;j<=10;j++)//initialization conditional and incremental part
		{
			System.out.println(j);
		}
		System.out.println("************");
		// print 10 to 1
		for(int k=10;k>0;k--)
		{
			System.out.println(k);
		}
	}

}
