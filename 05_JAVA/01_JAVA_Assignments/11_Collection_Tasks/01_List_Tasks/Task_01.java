package list_tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// //Write a Java program to create a new array list, add some elements and print out the collection

public class Task_01 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Apple");
		list.add("Mango");
		list.add("Orange");
		list.add("Kiwi");

		System.out.println("List : " + list);
		Collections.sort(list);
		System.out.println("Sorted List : " + list);

	}

}


/*
 * Output :
 * 
 * List : [Apple, Mango, Orange, Kiwi]
 * Sorted List : [Apple, Kiwi, Mango, Orange]
 
*/