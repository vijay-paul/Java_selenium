package Assignment;

import java.io.IOException;
import java.util.Scanner;

public class Assignment_1B {

	public static void main(String[] args) {

		month(userInput());
		

	}

// method to get user input 

	public static int userInput() {

		Scanner myscanner = new Scanner(System.in);
		System.out.println("Enter Number");
		int userinput = 0;

		// validation to accept only numbers
		try {
			userinput = myscanner.nextInt();
		} catch (Exception e) {
			System.out.println("Please enter only numbers");
		}

		return userinput;

	}

	// method to show which month

	public static void month(int userinput) {
		// validation if user enters less than 1 or more than 12
		if (userinput < 1 || userinput > 13) {
			System.out.println("Please enter number between 1 to 12");

		}

		else {

			// switch case to display month
			switch (userinput)

			{

			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("February");
				break;
			case 3:
				System.out.println("March");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("June");
				break;
			case 7:
				System.out.println("July");
				break;

			case 8:
				System.out.println("August");
				break;
			case 9:
				System.out.println("September");
				break;
			case 10:
				System.out.println("October");
				break;
			case 11:
				System.out.println("November");
				break;

			case 12:
				System.out.println("December");
				break;
			}
		}
	}

}
