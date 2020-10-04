package LearningPrograms;

public class reverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. by using algorithm 
		int n=12345;
		int rev=0;
		//to reverse we will add the remainder to the number quotient divided by 10
		while(n!=0)
		{
			rev=rev*10+ n%10;//0*10+5//50+4//540+3//5430+2//54320+1
			n=n/10;//1234//123//12//1//0
		}
        System.out.println("reverse of the number is "+ rev);
        
        //2. by using StringBuffer class
        int n1=1234567;
        System.out.println(new StringBuffer(String.valueOf(n1)).reverse());
       
	}

}
