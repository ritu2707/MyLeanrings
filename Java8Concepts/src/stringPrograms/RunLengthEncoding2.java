package stringPrograms;

public class RunLengthEncoding2 {

	public static void main(String[] args) {
		String a="T4G2E5";
        expand(a);
	}

	private static void expand(String a) {
		// TODO Auto-generated method stub
		int n=a.length();
		for(int i=0;i<n;i++)
		{
			int aa=0;
			int k=0;
			if(a.charAt(i)=='0'||a.charAt(i)=='1'||a.charAt(i)=='2'||a.charAt(i)=='3'||a.charAt(i)=='4'||a.charAt(i)=='5')
			{
				  int x=a.charAt(i);
				  char c=a.charAt(i);
				 
				   aa=Integer.parseInt(String.valueOf(c));
				
			}
			while(k<aa)
			{
				System.out.print(a.charAt(i-1));
				k++;
				
			}
		}
	}

}
