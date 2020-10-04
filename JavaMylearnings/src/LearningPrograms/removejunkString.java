package LearningPrograms;

public class removejunkString {
	public static void main(String[] args) {
		
		String s="!!@@##### Selenium !@@###";
		//removing junk or special character by help of regularExprerssion
		
		String s1= s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
	}

}
