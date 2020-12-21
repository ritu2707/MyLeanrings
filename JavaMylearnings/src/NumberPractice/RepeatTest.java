package NumberPractice;

public class RepeatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //7
		//1 5 3 4 3 5 6
		int n[]= {1, 5, 3, 4, 3, 5 ,6};
		int m=n.length;
		
		findRepeat( n,  m);
	}

	private static void findRepeat(int[] n, int m) {
		// TODO Auto-generated method stub
		for(int i=0;i<m;i++)
		{
			for(int j=i+1;j<m;j++) {
			if(n[i]==n[j])
			{
				System.out.println(" repeating element is found"+ n[i] +"At" + i+"index");
			}
			
				
			}
				
		}
	}

}
