package Assignment;

public class Assignment_4D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Atmcheck();// Method for ATM Pin

	}

	public static void Atmcheck() {

		int atmnumber = 5678;

		Assignment_1B input = new Assignment_1B(); // Creating object and calling userinput method from different classs

		for (int i = 0; i <= 3; i++) {

			if (i == 3) {//checking if number max number of tries is reached

				System.out.println("Atm Blocked");
			} else if (atmnumber == input.userInput()) {//Comparing if ATM number is matching user input 
				System.out.println("Access Granted");
				break;
			} else {

				System.out.println("Incorrect Pin Enter again");

			}
		}

	}

}
