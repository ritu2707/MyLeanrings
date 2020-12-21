package splitString;

public class Permutation {
	
public static void PermutationM(String a, int l,int n)
{
	if(l==n)
	{
		System.out.println(a);
	}
	else
	{
		for(int i=l;i<=n;i++)
		{
			a=Swap(a,l,i);
			PermutationM(a,l+1,n);
			
		}
	}
}
	private static String Swap(String a, int i, int j) {
	// TODO Auto-generated method stub
		char temp;
        char arrayC[]= a.toCharArray();
        temp=arrayC[i];
        arrayC[i]=arrayC[j];
        arrayC[j]=temp;
       return String.valueOf(arrayC);
       
	
}
	public static void main(String[] args) 
	{
		String a="ABC";
		int size=a.length();
		PermutationM(a,0,size-1);
		
	}
}
