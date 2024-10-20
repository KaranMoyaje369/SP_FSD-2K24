package list_tasks;

// Add elements using its index

import java.util.ArrayList;
import java.util.List;

public class Task_02 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Apple");
		list.add("Mango");
		list.add("Orange");
		list.add("Kiwi");

		System.out.println("List : " + list);

		// adding elements

		list.add(1, "Banana");
		list.add(3, "Guava");

		System.out.println("After Adding New Elements : " + list);

	}

}

/*
 * Output :
 * 
 * List : [Apple, Mango, Orange, Kiwi]
 * After Adding New Elements : [Apple, Banana, Mango, Guava, Orange, Kiwi]

 
*/