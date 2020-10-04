package learningPart2;

public class Day10SingeltonClass {

	//In OOOPs concept a singleton class is such a patter where only one object is created 
	//how to achieve
	//1. make the constructor private
	//2. write a static method(getInstance) with return type object of this singleton class (called lazy initialization)
	
	//difference between normal class and singleton class
	//for normal class we use constructor to instantiate the object but in singleton class we use getInstance method.
	 private static Day10SingeltonClass sigleton_instance= null;
	 public String str;
	 
	 private Day10SingeltonClass()
	 {
		 str ="working on singleton class pattern";
	 }

	private static Day10SingeltonClass getInstance() {
		if (sigleton_instance==null)
			sigleton_instance= new Day10SingeltonClass();
			return sigleton_instance;
	}
	
	
	public static void main(String[] args) {
		Day10SingeltonClass s= Day10SingeltonClass.getInstance();
		Day10SingeltonClass r= Day10SingeltonClass.getInstance();
		Day10SingeltonClass t= Day10SingeltonClass.getInstance();
		s.str=(s.str).toUpperCase();
		System.out.println(s.str);
		System.out.println(r.str);
		System.out.println(t.str);
		
		t.str=(t.str).toLowerCase();
		System.out.println(s.str);
		System.out.println(r.str);
		System.out.println(t.str);
	}

}
