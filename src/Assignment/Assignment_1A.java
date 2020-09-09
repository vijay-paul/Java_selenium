package Assignment;

import java.util.Scanner;


//Create a reusable piece of code that will print name of the user. Depending on the input
//value, the output should vary. 

public class Assignment_1A {

	public static void main(String[] args) {

		String name = userInput(); // using String return type
		printname(name); // using String return type
		program2();// using Void return type
	}

	//method to get input from user and return user name to print 
	public static String userInput() {

		Scanner myscanner = new Scanner(System.in);
		System.out.println("Enter Username");
		String username = myscanner.nextLine();
		return username;

	}
   //method to print the username got as input from user
	public static void printname(String username) {

		System.out.println("You have entered your name as  " + username);
	

	}

	
	////method to get input from user and return user name to print  using void return type 
	public static void program2() {

		Scanner myscanner = new Scanner(System.in);
		System.out.println("Enter Username");
		String username = myscanner.nextLine();
		System.out.println("You have entered your name as  " + username);

	}

}
