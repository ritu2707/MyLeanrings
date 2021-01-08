package Day2;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumberParallelStream {
public static void main(String[] args) {
	
	System.out.println(primeNumber(8));
	//for one number finding is fine 
	//but for a bigger range we use parallel Stream
	long count= Stream.iterate(0,n->n+1)
			    .limit(50)
			 //   .parallel() 
			    .filter(PrimeNumberParallelStream::primeNumber)
			    .peek(x-> System.out.println(x))
			    .count();
}

public static boolean primeNumber(int n)
{
	if(n<=1)
	return false;
	
	return !IntStream.range(2,n/2).anyMatch(ele->n%ele==0);
	
}
}
