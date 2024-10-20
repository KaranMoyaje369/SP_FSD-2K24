package list_tasks;

import java.util.ArrayList;
import java.util.Collections;

public class Task_15 {

	public static void main(String[] args) {

		ArrayList<String> numbers = new ArrayList<String>();
		numbers.add("1");
		numbers.add("2");
		numbers.add("3");
		numbers.add("4");
		System.out.println("List 1 : " + numbers);

		ArrayList<String> alphabet = new ArrayList<String>();
		alphabet.add("A");
		alphabet.add("B");
		alphabet.add("C");
		alphabet.add("D");
		System.out.println("List 2 : " + alphabet);

		// List 1 copy to List 2
		Collections.copy(alphabet, numbers);
		System.out.println("\nList 1 copy to List 2 \n");
		System.out.println("List 1 : " + numbers);
		System.out.println("List 2 : " + alphabet);

	}
}

/*
 * Output :
 * 
 * List 1 : [1, 2, 3, 4]
 * List 2 : [A, B, C, D]
 * 
 * List 1 copy to List 2 
 * 
 * List 1 : [1, 2, 3, 4]
 * List 2 : [1, 2, 3, 4]
 
 */ 
