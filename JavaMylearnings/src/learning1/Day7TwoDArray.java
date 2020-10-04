package learning1;

public class Day7TwoDArray {

	public static void main(String[] args) {

      // 2-D array
		// it will be used in selenium to fetch the data or insert data from excel sheet 
		String str[][]= new String[2][3];
		System.out.println(str.length);// total number of rows here---2
		System.out.println(str[0].length);//total number of columns here- 3
		//first row
		str[0][0]="hello";
		str[0][1]= "ram";
		str[0][2]="sita";
		//second row
		str[1][0]="ritu";
		str[1][1]="Shubham";
		str[1][2]="Ashish";
		 System.out.println(str[0][1]);
		 //print the values for printing 2D array
		 //row=0---- col 0 to 2
		 //row=1----col 0 to 2
		 for(int row=0;row<str.length;row++)
		 {
			 for(int col=0; col<str[0].length;col++)
			 {
				 System.out.println(str[row][col]);
			 }
		 }
		
		

	}

}
