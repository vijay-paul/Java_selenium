package Java_Assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList_Java3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arrlist = new ArrayList<String>();
		System.out.println(arrlist);
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println(" Add to the list ");

			arrlist.add(sc.nextLine());

		}

		System.out.println(arrlist);
		System.out.println("*************");

		Iterator it = arrlist.iterator();
		
		//Removing element one by one using iterator 

		
		while (it.hasNext()) {
			int i = 0;

			System.out.println(arrlist.remove(i) + "Removed");

		}

		// System.out.println( arrlist.remove(i)+"Removed from the list");

		//

	}

}
