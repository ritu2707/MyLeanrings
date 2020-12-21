package stringsPractice;

public class Day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=2;
       int b=7;
       
       //swap the numbers without using temp variable
       //1st- by multiply and divide
       //2nd- add and then subtract
       //3rd- by doing xor operation
       
        a= a*b;//a=14, b=7
        b= a/b;//b=2,a=14
        a=a/b;
        System.out.println(a+ " "+ b);
        
       
       
       
       
	}

}
