package Java_Assignment_1;

public class StudentMarksPercentage {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		studentSubjectMarks student = new studentSubjectMarks();

		int total = student.Maths() + student.English() + student.science() + student.Socialscience();
		System.out.println(total);
		int average = student.average(total);
		System.out.println("Performance Grade of student is");
		performace(average);

	}

	public static void performace(int average) {

		if (average < 40) {
			System.out.println("Poor");
		}
		if (average > 40 && average < 60) {
			System.out.println("Average");

		}

		if (average > 60 && average < 80) {
			System.out.println("Good");
		}

		if (average > 80 && average < 90) {
			System.out.println("Very Good ");
		}
		if (average > 90) {
			System.out.println("Excellent");
		}

	}

}
