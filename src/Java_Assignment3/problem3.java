package Java_Assignment3;

import java.util.Scanner;

public class problem3 {

	public static void main(String[] args) {
		
		System.out.println("Enter Numer 1");
		float a = userinput(); // User input 1 
		System.out.println("Enter Numer 2");
		float b= userinput(); // user input 2 
		
		
		System.out.println("The addition of 2 number is "+add(a,b)); // Method to add 2 number 
		System.out.println("The subtraction of 2 number is "+subtraction(a,b));// Method to subtract 2 number 
		System.out.println("The Multiplication of 2 number is "+Multiply(a,b)); //Method to multiply 2 number 
		// TODO Auto-generated method stub

		
	
	}
	
	// method for user inputonly numbers 

	public static float userinput() {
		float number = 0;
		boolean result = false;
		Scanner sc = new Scanner(System.in);

		do {
			if (sc.hasNextFloat()) {
				number = sc.nextFloat();
				result = true;
			} else {
				sc.nextLine();
				System.out.println("Enter only number ");
			}
		} while (!result);

		result = true;
		return number;

	}
	
	public static float add(float a , float b) {
		
		float add = a+b ;
		
		
		
		return add ;
		
		
		
	}

	public static float  Multiply(float a , float b) {
		
		float mult = a*b ;
		
		
		
		return mult ;
		
		
		
	}
	

	public static float subtraction(float a , float b) {
		
		float sub = a-b ;
		
		
		
		return sub ;
		
		
		
	}
	
}
		
	
	
	
	

