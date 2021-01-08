package Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      UnaryOperator<Integer> fun= x->x*70;
      int result= fun.apply(3);
      System.out.println(result);
      
      List<String> list1= Arrays.asList("Ritu","Ashish","Java","Python");
      System.out.println(list1);
      
      list1.replaceAll(ele-> ele+"Rise");
      System.out.println(list1 );
      
      
	}

}
