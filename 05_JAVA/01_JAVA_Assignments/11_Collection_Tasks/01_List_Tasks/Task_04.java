package list_tasks;

//Sorted Array List

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task_04 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Apple");
		list.add("Mango");
		list.add("Orange");
		list.add("Kiwi");
		list.add("PineApple");
		list.add("Strawberry");

		System.out.println("List : " + list);

		Collections.sort(list);
		System.out.println("Sorting List : " + list);

	}

}


/*
 * Output :
 * 
 * List : [Apple, Mango, Orange, Kiwi, PineApple, Strawberry]
 * Sorting List : [Apple, Kiwi, Mango, Orange, PineApple, Strawberry]
*/