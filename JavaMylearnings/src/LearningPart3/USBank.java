package LearningPart3;

//in Interface there is only method declaration ,no method body.
//in interface the variables can be declared,and they are by default static and values cannot be changed.
//no static method for interface
//Interface are abstract in nature ,means no object can be created.
//in Interface there is no main method 
public interface USBank {
	
	
	int min_bal= 100;//interface variable is defined then it cannot be changed later. it's final.
	public void credit();//only declare not define
	public void debit();
	public void transfer();
	
	
}
