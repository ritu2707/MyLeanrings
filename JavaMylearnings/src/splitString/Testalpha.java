package splitString;

public class Testalpha {
	
	//asccii value of a-z= 097-122
	//assccii A-Z          065-090
	public static void replaceWord(String s,int k)
	{
		String newS="";
		int dup=k;
		for(int i=0;i<s.length();++i)
		{
			int value= s.charAt(i);
			System.out.println(value);
			if(value+k>122)
			{
			    k -= (122 - value); 
                k = k % 26; 
                  
                newS += (char)(96 + k); 
			}
			newS=newS+(char)(value+k);
			k = dup;
		}
		System.out.println(newS);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     replaceWord("baz", 5);
	}

}
