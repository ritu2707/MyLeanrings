package LearningPrograms;

public class ReverseString5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//we cannot usee .reverse() function for doing swap
		//1, method using for loop
		String s="Selenium";
		int leng= s.length();
		String rev="";
		System.out.println(leng);
		for(int i=leng-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
         System.out.println(rev);
         String s2="hello";
         //2nd way is using StringBuffer class in java it has reverse function but String class doesnot have Reverse function
         StringBuffer sb=new StringBuffer(s2);
         System.out.println(sb.reverse());
	}

}
