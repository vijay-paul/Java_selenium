package Demo2;
import Demo1.Methods;

public class Test {

	public static void main(String[] args) {
		
		Methods date=new Methods();
		
		System.out.println("Today is "+date.day());  // printing day calling date method from demo 1 package
		
		System.out.println("It is "+date.month());    // printing month calling month method from demo 1 package
		
		System.out.println("It is "+date.year());  // printing year calling year method from demo 1 package
		
		
	}

}
