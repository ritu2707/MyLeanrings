package Testc;

public class Test2 {

	public void oddNum(int m,int n)
	{
		for(int i=m;i<n;i++)
		{
			if(i%2!=0)
			{
				System.out.println("odd number is "+ i);
			}
			else
				System.out.println("Even number is "+i);
				
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Test2 t=new Test2();
        t.oddNum(1, 100);
        
	}

}
