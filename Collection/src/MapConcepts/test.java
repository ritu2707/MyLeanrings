package MapConcepts;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t[]= new String [5];
		t[0]= "one";
		t[1]= "two";
		t[2]="three";
		t[3]="four";
		t[4]="five";
		int lenght= t.length;
		System.out.println(lenght);
		
		for(int i=0; i<lenght;i++)
		{
			if(t[i].charAt(0)!='t')
			{
				System.out.println(t[i]);
				
			}
			
//				
//					
		}
		

	}

}
