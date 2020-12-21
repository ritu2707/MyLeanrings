package Practice;

public class Beta extends alpha{
	
	 public Beta() 
	 {  System.out.print("beta ");  } 
	  
	    void go() 
	    { 
	        type = "b "; 
	        System.out.print(this.type + super.type); 
	    } 
	    
	    public static void main(String[] args) 
	    { 
	        new Beta().go(); 
	    } 

}
