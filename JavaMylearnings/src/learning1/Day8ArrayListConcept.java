package learning1;

import java.util.ArrayList;

public class Day8ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList();
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		ar.add(400);//3
		System.out.println(ar.size());
		ar.add("Tom");//3
		ar.add("M");//4
		ar.add(23.13);//5
		ar.remove(4);
		System.out.println(ar.size());
		System.out.println(ar.get(1));
		//System.out.println(ar.get(9)); index out of Bound exception
		System.out.println("******************************");
		//to print all the value of arraylist
		for(int i=0; i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
       // restrict arraylist to store only one type of datatype
		ArrayList <Integer> ar1= new ArrayList();
		ar1.add(12);
		ar1.add(200);
		System.out.println(ar1.get(0));
		//ar1.add(32.23); not allowed 
		
	}

}
