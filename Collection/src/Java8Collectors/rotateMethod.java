package Java8Collectors;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class rotateMethod {

	public static void main(String[] args) 
    { 
       Integer[] array1= {10,40,12,60,57};
       
       System.out.println("original array :"+ Arrays.toString(array1));
       
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
       
       Collections.rotate(Arrays.asList(array1), 2);
       System.out.println(Arrays.toString(array1));
       
       System.out.println("_____________________________________");
       
       int[] array2= {12,45,6,78,9};
       Arrays.sort(array2);
       System.out.println(Arrays.toString(array2));
       Collections.rotate(Arrays.asList(array2),2);
       System.out.println(Arrays.toString(array2));
    } 
}
