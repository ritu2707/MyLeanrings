package Practice;

public class Programmer extends Author 
{ 
    public  static void write() 
    { 
        System.out.println("Writing code"); 
    } 
  
    public static void main(String[] args) 
    { 
        Author a = new Programmer(); 
        Author.write(); 
    } 
}
