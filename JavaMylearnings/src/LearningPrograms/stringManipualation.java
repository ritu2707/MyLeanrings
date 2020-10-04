package LearningPrograms;

public class stringManipualation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String is a class
		String s="my country is India";
		//1. size of String
		System.out.println("size of String is  :"+s.length());
		//2. character at 6th location
		System.out.println("character at 6th location is :"+ s.charAt(6));
		//3.index value of a character
		System.out.println(s.indexOf('y'));// 1st occurrence of y
		System.out.println(s.indexOf('y',s.indexOf('y')+1));//2nd occurrence of y
		System.out.println(s.lastIndexOf('y', 0));
		System.out.println(s.indexOf("is"));
		System.out.println(s.indexOf("hello"));//if a string or character not available it will return -1
		
		//compare two strings
		String s1="my country is India and I love it";
		String ss2= "my country is India AND I love it";
		System.out.println("....................test ..............");
		System.out.println(s1.equals(ss2));// verify the sequence of character including space.
		System.out.println(s1.compareTo(ss2));//verify the difference of length
		System.out.println(s1.equalsIgnoreCase(ss2));//verify the length and sequence of characters irrespective of upper and lower case
		System.out.println("...............test end...................");
		System.out.println(s1.length());
		System.out.println(s.length());
		System.out.println("..................................");
		
		//sub string
		System.out.println(s.substring(0, 9));
		String s2="  hello  World ";
		//trim
		System.out.println(s2.trim());//trim can only remove before and after space
		System.out.println("..................................");
		System.out.println(s2.replace(" ", ""));//between space can be removed by replace
		//split
		String s4="hello_my_world_well";
		String test[]=s4.split("_");
		for(int i=0;i<test.length;i++)
		{
			System.out.println(test[i]);
		}
		
		//concatr function
		System.out.println(s4.concat("s"));
		
		String a="hello";
		String b="World";
		int x=1;
		int y=2;
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(a+b+(x+y));
		
	}

}
