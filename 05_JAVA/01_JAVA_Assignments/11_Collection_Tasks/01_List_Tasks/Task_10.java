package list_tasks;

import java.util.ArrayList;

// Join Two Array List

public class Task_10 {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("one");
		list1.add("Two");
		list1.add("Three");
		list1.add("Four");
		System.out.println("List 1 : " + list1);

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Five");
		list2.add("Six");
		list2.add("Seven");
		list2.add("Eight");
		System.out.println("List 2 : " + list2);

		ArrayList<String> list = new ArrayList<String>();
		list.addAll(list1);
		list.addAll(list2);
		System.out.println("Combine Two Array List : " + list);

	}

}

/*
 * Output :
 * 
 * List 1 : [one, Two, Three, Four]
 * List 2 : [Five, Six, Seven, Eight]
 * Combine Two Array List : [one, Two, Three, Four, Five, Six, Seven, Eight]
 
*/