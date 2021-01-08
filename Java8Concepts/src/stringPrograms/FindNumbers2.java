package stringPrograms;

import java.util.regex.Pattern;

public class FindNumbers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] input= {"12345","R345","567890","456789","QWE345"};
		
		Pattern p= Pattern.compile("\\d{6}");
		for(String i:input)
		{
			System.out.println(i +":" + p.matcher(i).matches());
		}

	}

}
