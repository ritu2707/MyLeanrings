package LearningPrograms;

public class swapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //using SubString method
		
		String a="hello";
		String b="world";
		System.out.println("value of a :"+a);
		System.out.println("value of b :"+b);
		//1 step- append
		 a=a+b;//helloworld
		 //2 step- use sub string method
		 b= a.substring(0,b.length() );//10-5
		 //3 step -using second time sub string
		 a= a.substring(b.length());
		 System.out.println("after swapping value of a and b");
		 System.out.println("value of a :"+a);
		 System.out.println("value of b :"+b);
	}

}
