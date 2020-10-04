package LearningPart3;

public class Day2TestBank {

	public static void main(String[] args) {
	
		System.out.println(USBank.min_bal);//since it is static variable can be referred by interface/class name
		//USBank b=new USBank();//since it is interface
		HSBCBank obj= new HSBCBank();
		obj.credit();// dynamic polymorphism
		obj.debit();
		obj.transfer();
		obj.educationLoan();
		
		//dynamic polymerphism --child class object can be referred by Interface reference variable 
        USBank obj1= new HSBCBank();
        obj1.credit();
        obj1.debit();
        obj1.transfer();
        //obj1.educationLoan();  cannot access educationloan
        
	}

}
