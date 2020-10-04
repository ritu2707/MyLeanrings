package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListConcept {

	//test
	public static void main(String[] args) {
		
		int a[]= new int[4];//static array- size is fixed
		
		//dynamic array-----collection--1. array list
		//1. it excepts duplicate values
		//2. maintain on the basis of order--0,1,2,3
		//3. It is not syncronized--so it is slow
		//4. allows random access
		
		ArrayList ar= new ArrayList();//ArrayList is a class//non generic array list 
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		System.out.println(ar.size());
		ar.add(400);//3
		ar.add(500);//4
		ar.add('e');
		ar.add(23.44);
		ar.add("hello");
		System.out.println(ar.size());//size of the arraylist 
		
		System.out.println(ar.get(4));//to get the value from a particualr index
		
		//to retrieve all the values we use for loop in case of array and arraylist 
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		ArrayList <Integer> ar1= new ArrayList <Integer>();//since it is generic now only it will allow integer.
		ar1.add(1);
		ar1.add(2);
		
		
		
		//Employee Class Object
		Employee e= new Employee("Naveen",23,"IT");
		Employee e1= new Employee("Rohit",24,"Ops");
		Employee e2= new Employee("Divya",26,"Dev");
		
		//Arraylist to store objects----of user defined class
		ArrayList <Employee> ar4= new ArrayList <Employee>();
		ar4.add(e);
		ar4.add(e1);
		ar4.add(e2);
		//System.out.println(ar4.get(1));
		//Iterator is used to get the values for the objects in case of Array List 
		Iterator <Employee> itr= ar4.iterator();
		while(itr.hasNext())
		{
			Employee emp=itr.next();
			if(emp.age>25)
			{
				System.out.println(emp.name);
			}
		}	
		System.out.println("_______________to be tested _______________________");
//			while(itr.hasNext())
//			{
//				Employee emp1=itr.next();
//				if(emp1.age>25)
//				{
//					System.out.println(emp1.name);
//				}
//			}
		
		
		//******************************
		System.out.println("********");
		//addAll()--this function add one arraylist to the exisitng arraylist 
		ArrayList <String> ar2= new ArrayList <String>();
		ar2.add("hello");
		ar2.add("World");
		
		ArrayList <String> ar6= new ArrayList <String>();
		ar6.add("hello1");
		ar6.add("World1");
		
		ar2.addAll(ar6);
		for(int i=0;i<ar2.size();i++)
		{
			System.out.println(ar2.get(i));
		}
		//similar we have RemoveAll()
		//retainAll()-- to print only the common value of two array list
		ArrayList <String> ar7= new ArrayList <String>();
		ar7.add("hello");
		ar7.add("World");
		
		ArrayList <String> ar8= new ArrayList <String>();
		ar8.add("hello");
		ar8.add("World1");
		ar7.retainAll(ar8);
		for(int i=0;i<ar7.size();i++)
		{
			System.out.println(ar7 .get(i));
		}
		
	}

}
