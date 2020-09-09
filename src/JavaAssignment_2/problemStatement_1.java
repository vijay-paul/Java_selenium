package JavaAssignment_2;

public class problemStatement_1 {
	
// mulitple method with integer as input 
	public void multiply(int a , int b) {
		int c= a*b;
		System.out.println(c);
	}

	// same mulitple method with float  as input 
	public void multiply(float a , float b) {
		
		float c = a*b;
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		problemStatement_1 object = new problemStatement_1();
		
		object.multiply(5,6);
		object.multiply(5.3f, 4.2f);
		
	}

	}


