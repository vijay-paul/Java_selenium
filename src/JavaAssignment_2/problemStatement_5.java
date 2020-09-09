package JavaAssignment_2;

public class problemStatement_5 {
public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub

		
		problemStatement_5 intobject = new problemStatement_5(5);// passing integer
		problemStatement_5 floatobject = new problemStatement_5(10f); //passing float 
		problemStatement_5 noattribute= new problemStatement_5(); // passing no attribute
	}
	//First constructor takes an integer value as attribute. 
	public problemStatement_5(int a) {
		
		
		System.out.println("Displaying your integer value"+a);
	}
	
	//Second constructor takes a float value as attribute.
public problemStatement_5(float a) {
		
		
	System.out.println("Displaying your float value" +a);
		
	}

//Third constructor does not take any attribute
public problemStatement_5( ) {
	
	System.out.println("No attribute");
	
	
}

	

}
