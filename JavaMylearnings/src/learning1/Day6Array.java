package learning1;

public class Day6Array {

	public static void main(String[] args) {
	// Array is to store similar data type in a variable
		// one dimensional array
		
		//disadvantage of array- 
		//1. size is fixed--static array--to overcome this problem we use collection-array list,hash table- dynamic array
		//2. similar data types values are only stored---to overcome --we use Object array
		
		//1. int array:
		//lowest index is 0
		//highest index = n-1 where n is the size of array 
		
		int i[]= new int[4]; //square bracket to give the exact index 
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[0]);
		System.out.println(i[2]);
		//System.out.println(i[4]);//will give arrayindexoutofboundexception famous exception
		System.out.println(i.length);//size of array i
		//print all the values of array 
		for(int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);
		}
		
		// 2. double array:
		double d[]= new double[3];
		d[0]=12.45;
		d[1]=23.45;
		d[2]=90.23;
		System.out.println(d[0]);
		
		//3. character array
		char c[]= new char[3];
		c[0]='a';
		c[1]= '2';
		c[2]='!';
		System.out.println(c[1]);
		
		//4. boolean array 
		boolean b[]= new boolean[2];
		b[0]=true;
		b[1]=false;
		System.out.println(b[0]);
		
		//5.String array :
		String s[]= new String[2];
		s[0]="hello";
		s[1]="world";
		System.out.println(s[0]+" " +s[1]);
		
		//6. Object array :Object is superclass
		Object o[]= new Object[6];
		o[0]=12;
		o[1]="tom";
		o[2]=12.23;
		o[3]='1';
		o[4]="12/2/1992";
		o[5]= true;
		System.out.println(o[4]);
		for(int k=0;k<o.length;k++)
		{
			System.out.println(o[k]);
		}
				
		
		

	}

}
