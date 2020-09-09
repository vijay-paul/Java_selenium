package Java_Assignment_1;

import java.util.Scanner;

public class Bidding {

	public static void main(String[] args) {
		
		System.out.println(" Michael enter your BID");
		float bidder_A=userinput();
		System.out.println(" Bruce enter your BID");
		float bidder_B=userinput();
		
		if(bidder_A<bidder_B) {
			
			System.out.println("Michael won the BID ");
		}
		else {
			System.out.println("Bruce  won the BID ");
		}
		
		
		// TODO Auto-generated method stub

	}

	
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
}
