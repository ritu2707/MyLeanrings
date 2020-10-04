package learningPart2;

public class Day7CallbyValueCallbyref {

	int p;//global , non static variable
	int q;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day7CallbyValueCallbyref obj =new Day7CallbyValueCallbyref();
		int x=10;
		int y=20;
		int sum=obj.testsum(x, y);//call by value /pass by value
		System.out.println(sum);
		
		obj.p=30;
		obj.q=40;
		//after swap//call by reference used
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}
	//call by value
	public int testsum(int a,int b)
	{  a=30;
	   b=40;
		int c=a+b;
		return c;
	}
	
	//call by reference
	public void swap(Day7CallbyValueCallbyref t)//Reference variable of the object is sent 
	{
		int temp=t.p;
		t.p=t.q;
		t.q=temp;
		
	}

}
