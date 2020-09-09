package Assignment;

import java.util.Scanner;


//Reverse a String

public class Assignment_1C {

	public static void main(String[] args) {

		String userstring = UserInput(); // method for user input
		Reverse(userstring);//Method for reversing the string

		// TODO Auto-generated method stub
	}
//Method for reversing the string
	public static void Reverse(String userstring) {

		String name = userstring;
		String rev = "";
		//String name = ;
		for (int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		
		}

		System.out.println(rev);
	}
// method for user input
	public static String UserInput() {

		Scanner myscanner = new Scanner(System.in);
		System.out.println("PLease enter a string to reverse");
		String userinput = myscanner.nextLine();

		return userinput;

	}

}
