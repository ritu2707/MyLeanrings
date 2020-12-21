package Testc;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of the rectangle");
		double length= s.nextDouble();
		System.out.println("Enter the width of the rectangle");
		double width= s.nextDouble();
		double area= length*width;
		System.out.println("area of the rectangle " + area);
		
		//another way if you donot want user tyo provide
		int l=10;
		int w=20;
		System.out.println("area of the rectangle "+ l*w);
		

	}

}
