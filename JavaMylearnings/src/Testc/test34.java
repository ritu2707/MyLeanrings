package Testc;

import java.util.HashMap;

public class test34 {
	
	//Key = 5
	//Input = "bazz"
		//	output = "gfee"
	
	public static void test12(String s,int n)

	{   
     String newS= new String();
     for(int i=0;i<s.length();i++)
     {
    	 newS+= (char)(s.charAt(i)+5);
     }
     System.out.println(newS);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Key = 5;
		String Input = "bazz";
		test12(Input,Key);
	}

}
