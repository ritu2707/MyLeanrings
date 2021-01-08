package Day2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CustomermainClass {
        //using StreamFilterExample2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<StreamFilterExample2> cust1= Arrays.asList(
    		                    new StreamFilterExample2("Ritu",31),
    		                    new StreamFilterExample2("Ashish",32),
    		                    new StreamFilterExample2("Shubham",27) );
       
       StreamFilterExample2 cust2= cust1.stream()
       .filter(ele-> ele.getName().contains("Ashish"))
       .findAny()
       .orElse(null);
       
       System.out.println(cust2.getId()+ " :"+ cust2.getName());
       
       //2nd example
       System.out.println("***********************2nd example*******************");
       //filter with multiple condition && ==
       
       //example of map
       String name=cust1.stream()
       .filter(ele-> "Shubham".equals(ele.getName()))
       .map(StreamFilterExample2::getName)
       .findAny()
       .orElse(null);
       System.out.println(name);
       
       //print sll the names 
       List<String> customernames= cust1.stream().map(StreamFilterExample2::getName).collect(Collectors.toList());
	  System.out.println(customernames);
	  
	  List<String> customernames2=cust1.stream().filter(ele -> ele.getId()>30)
			  .map(ele->ele.getName()) 
			  .collect(Collectors.toList());
	  System.out.println(customernames2);
	  }

}
