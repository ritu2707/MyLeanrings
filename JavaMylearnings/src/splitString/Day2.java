package splitString;

public class Day2 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input:
//			2
//			geEkS
//			FoR
//			Output:
//			geeks
////			FOR
		
		String s="geEkS";
		String s1="FoR";
		checkcase( s);
		checkcase( s1);

	}

	private static void checkcase(String s) {
		// TODO Auto-generated method stub
		int l=s.length();
		String newValue;
		System.out.println(s.charAt(0));
		
		if(s.charAt(0)>=65 && s.charAt(0)<=90)
		{
			  newValue= s.toUpperCase();
		}
		else {
			 newValue=s.toLowerCase();
		}
			
		System.out.println(newValue);
		
	}
	
	
	

}
