package Day2;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.BaseStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStream {

	public static void main(String[] args) {
     ForkJoinPool fpool= new ForkJoinPool();
     System.out.println(fpool.getParallelism());
     
     
     //convert stream to prallel stream
     Stream stream= Stream.of("Ram","mohan","Sita");
     BaseStream base=stream.parallel();
     System.out.println(base.isParallel());
     System.out.println("***********************************");
     //2nd use parallelStream() for collections
     Arrays.asList("Ram","mohan","Sita").parallelStream().forEach(System.out::println);
     
     System.out.println("***********************************");
     //3rd example
     IntStream.range(1,10).parallel().forEach(System.out::println);
     

	}

}
