package LearningPart3;

public class Inheritence {

	public static void main(String[] args) {
		
	//if same methods are there in parent as well as child, child method is called, it is called method overriding
	//method over riding--- compile time polymerphism
      BMW b= new BMW();
      b.start();// method overriding
      b.stop();
      b.theftsafety();
      
      //car object 
      Car c= new Car();
      c.start();
      c.stop();
      
      //run time polymerphism// top casting 
      // child object is referred by parent class reference variable ---run time 
      Car c1= new BMW();
      c1.start();
      c1.stop();
     //c1.theftsafety();      theftsafety cannot be called even by reference variable
      
      
   //downcasting
  	//BMW b1= new Car();// big cannot be fit into small one
  	 //complie time no error, run time it wil throw error
      //BMW b1= (BMW)new Car();//class cast exception downcasting not allowed
	}
	
	
}


