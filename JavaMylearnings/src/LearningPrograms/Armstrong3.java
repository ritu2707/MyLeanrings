package LearningPrograms;

public class Armstrong3 {

	//153
	//1*1*1+5*5*5+3*3*3=153
	//407- sum of cube of each digit of the number = number itself.
	public static void isArmstrong(int num)
	{
		int cube=0;
		int r=0;
		int t=num;
		while(num>0)
		{
			r=num%10;
			cube=cube+(r*r*r);
			num=num/10;
		}
		if(t==cube)
		{
			System.out.println("number is armstrong number");
		}
		else
		{
			System.out.println("number is not armstrong number ");
		}
	
		
	}
	public static void main(String[] args) {

		isArmstrong(153);
		isArmstrong(0);
		isArmstrong(1);
	}

}
