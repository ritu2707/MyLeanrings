package learning1;

public class Day5IncrementndDecrementOp {

	public static void main(String[] args) {
		 int i=1;
		 int j=i++; //post increment- first assign i to j and then increase the value of i 
		 System.out.println(i);
		 System.out.println(j); 

		 
		 System.out.println("************************");
		 int a=1;
		 int b=++a;//pre increment- first increase the value of a and then assign to b
		 System.out.println(a);
		 System.out.println(b);
		 int m=2;
		 int n=m--;//post decrement
		 System.out.println(m);
		 System.out.println(n);
		 
		 int p=2;
		 int q=--p;//pre decrement
		 System.out.println(p);
		 System.out.println(q);
		 
	}

}
