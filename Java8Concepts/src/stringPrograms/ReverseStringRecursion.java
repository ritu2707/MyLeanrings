package stringPrograms;

public class ReverseStringRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="My name is Ritu";
		
//		//1st method inbuilt reverse method of StringBuilder
//		StringBuilder s= new StringBuilder(input);
//		String reverse1= s.reverse().toString();
//		System.out.println("Reverse using StringBuilder :"+ reverse1);
//		
//		
//		//2nd way using StringBuffer reverse method
//		String reverse2= new StringBuffer(input).reverse().toString();
//		System.out.println("Reverse using StringBuffer :"+ reverse2);
//		
//		//3rd using Iteration
//		String reverse3= reverse(input);
//		System.out.println("Reverse using Iteration :"+ reverse3);
//		
		//4th using recursion
		String reverse4= reverseRecursion(input);
		System.out.println("Reverse using Recursion :"+ reverse4);
	}

	private static String reverseRecursion(String input) {
		// TODO Auto-generated method stub
		if(input.length()<2) {
			return input;
		}
		
		//System.out.println(input.substring(1));
		//System.out.println(input.charAt(0));
		return reverseRecursion(input.substring(1))+input.charAt(0);
		
	}

	private static String reverse(String input) {
		// TODO Auto-generated method stub
		StringBuilder s= new StringBuilder();
	char[] newchar= input.toCharArray();
	
	for(int i=newchar.length-1;i>=0;i--)
	{
		
		s.append(newchar[i]);
	}
		//return s.toString();
	//return new String(s);
	return String.valueOf(s);
		
	}

}
