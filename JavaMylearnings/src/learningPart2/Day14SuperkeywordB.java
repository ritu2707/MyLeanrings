package learningPart2;

public class Day14SuperkeywordB extends Day14SuperkeywordA{// B is having parent A so before calling B default constructor, it calls A's
	
	//super is called to call parent class constructor
	//inside one constructor only there is one super keyword possible
	public Day14SuperkeywordB()
	{
		super(10,20);//only to call parameterized constructor of the parent class
		//Otherwise by default it will call parent default constructor
		//super(10);//it is wrong becz super is only called once
		System.out.println("Class B Constructor");
	}

	public static void main(String[] args) {
		
		Day14SuperkeywordB obj= new Day14SuperkeywordB();
		//if parent class A has another constructor and we want to cal that we need to use Super keyword
		 	
	}

}
