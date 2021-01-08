package Day1;

import java.util.function.Supplier;

public class SupplierInterface {
public static void main(String[] args) {
	
	getText(() -> "java");
	
}

private static void getText(Supplier<String> text) {
	// TODO Auto-generated method stub
	System.out.println(text.get().length());
	
}
}
