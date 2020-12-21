package Java8Collectors;

public class TrailingZeroescount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long l = 25; 
		long t=4000000;
		long s=00067;
	        System.out.println("Number of trailing zeros = "+Long.numberOfTrailingZeros(l));
	        System.out.println(Long.numberOfTrailingZeros(t));
	        System.out.println(Long.numberOfTrailingZeros(s));
	        System.out.println(Long.numberOfLeadingZeros(s));
	                
	}

}
