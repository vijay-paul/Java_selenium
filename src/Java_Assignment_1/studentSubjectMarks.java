package Java_Assignment_1;

import java.util.Scanner;

public class studentSubjectMarks {
	String Name;
	int Maths;
	int English;
	int Science;
	int SocialSciense;

	public int Maths() {
		// TODO Auto-generated method stub
		do {

			System.out.println("Enter MAths Mark");

			Maths = userinput();

			if (Maths < 0 || Maths > 100) {
				System.out.println("Enter number between 0-100 only");
			}

		} while (Maths < 0 || Maths > 100);

		return Maths;
	}

	public int English() {
		// TODO Auto-generated method stub
		do {

			System.out.println("Enter EnglishMark");

			English = userinput();

			if (English < 0 || English > 100) {
				System.out.println("Enter number between 0-100 only");
			}

		} while (English < 0 || English > 100);

		return English;

	}

	public int science() {

		// TODO Auto-generated method stub
		do {

			System.out.println("Enter science Mark");

			Science = userinput();

			if (Science < 0 || Science > 100) {
				System.out.println("Enter number between 0-100 only");
			}

		} while (Science < 0 || Science > 100);

		return Science;

	}

	public int Socialscience() {
		// TODO Auto-generated method stub
		do {

			System.out.println("Enter SocialSciense Mark");

			SocialSciense = userinput();

			if (SocialSciense < 0 || SocialSciense > 100) {
				System.out.println("Enter number between 0-100 only");
			}

		} while (SocialSciense < 0 || SocialSciense > 100);

		return SocialSciense;

	}

	public int average(int total) {

		int average = total / 4;
		System.out.println(average);
		return average;

		// TODO Auto-generated method stub

	}

	public int userinput() {
		int number = 0;
		boolean result = false;
		Scanner sc = new Scanner(System.in);

		do {
			if (sc.hasNextInt()) {
				number = sc.nextInt();
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
