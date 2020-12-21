package LearningProgramsTest;

 class class1 {

	protected  void method1()// if class1 method is static or protected also it will not run, give compiler error
	{
		System.out.println("hello 1");
	}
}
// class Base { 
//	    public void foo() { System.out.println("Base"); } 
//	} 
//	  
//	class Derived extends Base { 
//	  
//	    // compiler error  
//	    private void foo() { System.out.println("Derived"); }  
//	} 
//	  
//	public class Main { 
//	    public static void main(String args[]) { 
//	        Derived d = new Derived(); 
//	        d.foo(); 
//	    } 
////	} 