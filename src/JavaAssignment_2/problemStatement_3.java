package JavaAssignment_2;

import java.util.Scanner;

public class problemStatement_3 {
	int a;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		
			System.out.println("Jill enter your number");

			cardMessage(sc.nextLine());

	}

	// TODO Auto-generated method stub

	public static void cardMessage(String a) {

		switch (a) {
		case "1":
			System.out.println("Card 1 Message");
			break;
		case "2":
			System.out.println("Card 2 Message");
			break;
		case "3":
			System.out.println("Card 3 Message");
			break;
		case "4":
			System.out.println("Card 4 Message");
			break;
		case "5":
			System.out.println("Card 5 Message");
			break;
		case "6":
			System.out.println("Card 6 Message");
			break;
		case "7":
			System.out.println("Card 7 Message");
			break;
		case "8":
			System.out.println("Card 8 Message");
			break;
		case "9":
			System.out.println("Card 9 Message");
			break;

		case "10":
			System.out.println("Card 10 Message");
			break;

		default:
			System.out.println("Try again.Enter number 1- 10");
		}
	}

}
