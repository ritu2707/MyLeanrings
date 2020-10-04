
package Learning4AbstractConcept;

public abstract class Bank {
	
	//for abstract  class at least one abstract method is required, it can have many abstract and non abstract methods.
		//first method is only abstract method and rest 2 are non abstract
	//so this is called partial abstraction
	//hiding the logic is called abstraction
	//objects cannot be created for Abstract class or Interface .
	//Abstract class can have non static as well as final and static variable

	
	// Interface can have no methods which can be defined it can have only declaration of method
	//so by help of interface we achieve full abstraction
	//in case of interface we can have only static nd final variable
	public  abstract void loan();//abstract class is having an abstract method which does not have any body.

	//non abstract method
	public void credit()
	{
		System.out.println("credit method");
	}
	//non abstract method
	public void debit()
	{
		System.out.println("debit method");
	}
}
