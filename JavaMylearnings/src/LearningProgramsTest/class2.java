package LearningProgramsTest;

//if there is a function public void foo() in base class and if it is overridden in derived class, then access specifier for foo() cannot be anything other than public in derived class.
//If foo() is private function in base class, then access specifier for it can be anything in derived class.

 class class2 extends class1{
	
	public void method1()
	{
		System.out.println("hello 2");
	}

}
// class Base { 
//	    private void foo() { System.out.println("Base"); } 
//	} 
//	  
//	class Derived extends Base { 
//	  
//	    // works fine 
//	    public void foo() { System.out.println("Derived"); }  
//	} 
//	  
//	public class Main { 
//	    public static void main(String args[]) { 
//	        Derived d = new Derived(); 
//	        d.foo(); 
//	    } 
//	} 