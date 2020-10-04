package LearningPrograms;

public class swapInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=20;
		int y=6;
		//1 using third integer
		int temp=x;
		x=y;
		y=temp;
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("******************");
		//2. without using third variable
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x);
		System.out.println(y);
		//3. using * / operator 
		System.out.println("******************");
		x=x*y;
		y=x/y;
		x=x/y;
		System.out.println(x);
		System.out.println(y);
		//4. using xor operator
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println(x);
		System.out.println(y);
	}

}
