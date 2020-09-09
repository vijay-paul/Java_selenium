package JavaAssignment_2;

public class problemStatement_4 {

	public static void main(String[] args) {

		find();

	}

	public static void find() {

		Shark shark = new Shark();
		shark.kinde();
		shark.Habitat();
		shark.Family();
		shark.Type();

		System.out.println(shark.kinde() + " is an " + shark.Family() + "which lives in " + shark.Habitat()
				+ "hense it is" + shark.Type());

		// Shark is an Animal which lives in Water, hence it is Aquatic.

	}

}