package stringPrograms;

public class RunLengthEncoding1 {
//W6T4G2E5
	public static void main(String[] args) {
		 String a= "WWWWWWTTTTGGEEEEE";
		 runlength(a);

	}

	private static void runlength(String a) {
//		char[] arraychar=a.toCharArray();
//		
//		int size= arraychar.length;
//		
//		int i=0;
//		
//		for(i=0;i<size;i++)
//		{
//			int count=1;
//			while(i<size-1 && arraychar[i]==arraychar[i+1])
//				count++;
//			System.out.println(arraychar[i]);
//			System.out.println(count);
		
//			
//		}
		int n= a.length();
		for(int i=0;i<n;i++)
		{
			int count=1;
			while(i<n-1 && a.charAt(i)==a.charAt(i+1))
			{
				count++;
				i++;
			}
			System.out.print(a.charAt(i));
			System.out.print(count);
		}
		
	}

}
