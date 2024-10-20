package list_tasks;

// Remove Elements at index 5

import java.util.ArrayList;
import java.util.List;

public class Task_03 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Apple");
		list.add("Mango");
		list.add("Orange");
		list.add("Kiwi");
		list.add("PineApple");
		list.add("Strawberry");

		System.out.println("List : " + list);

		// removing element at index five
		list.remove(5);
		System.out.println("After Removing Elements List : " + list);

	}

}


/*
 * Output :
 * 
 * List : [Apple, Mango, Orange, Kiwi, PineApple, Strawberry]
 * After Removing Elements List : [Apple, Mango, Orange, Kiwi, PineApple]
*/