package list_tasks;

import java.util.ArrayList;

public class Task_17 {

	public static void main(String[] args) {

		ArrayList<String> numbers = new ArrayList<String>();
		numbers.add("1");
		numbers.add("2");
		numbers.add("3");
		numbers.add("4");
		numbers.add("5");
		numbers.add("6");
		System.out.println("List 1 : " + numbers);

		ArrayList<String> cloneNew = (ArrayList<String>) numbers.clone();
		System.out.println("Clone List : " + cloneNew);
	}
}

/*
 * Output :
 * 
 * List 1 : [1, 2, 3, 4, 5, 6]
 * Clone List : [1, 2, 3, 4, 5, 6]
 
 */


