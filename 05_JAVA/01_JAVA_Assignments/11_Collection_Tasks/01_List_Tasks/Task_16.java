package list_tasks;

import java.util.ArrayList;

public class Task_16 {

	public static void main(String[] args) {

		ArrayList<String> numbers = new ArrayList<String>();
		numbers.add("1");
		numbers.add("2");
		numbers.add("3");
		numbers.add("4");
		numbers.add("5");
		numbers.add("6");
		System.out.println("List 1 : " + numbers);

		System.out.println("After Extract some Part : " + numbers.subList(0, 3));
	}
}

/*
 * Output :
 * 
 * List 1 : [1, 2, 3, 4, 5, 6]
 * After Extract some Part : [1, 2, 3]

*/