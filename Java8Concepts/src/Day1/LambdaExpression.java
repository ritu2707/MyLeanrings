package Day1;

public class LambdaExpression {

	public static void main(String[] args) {
		// we used to write the anonymous class for interface having on method
		//alternate of that is lambda expression
		//1st way 
//		Page p=new Page() {
//
//			@Override
//			public void greet(String name) {
//				// TODO Auto-generated method stub
//				System.out.println("name is "+name);
//			}
//			
//		};
		
		Page p=(name)->System.out.println("name is :"+name);
		
		p.greet("Ritu");
	}

}
