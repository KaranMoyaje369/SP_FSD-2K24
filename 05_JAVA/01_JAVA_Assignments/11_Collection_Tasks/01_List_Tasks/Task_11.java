package list_tasks;

import java.util.ArrayList;

public class Task_11 {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("one");
		list1.add("Two");
		list1.add("Three");
		list1.add("Four");
		System.out.println("List 1 : " + list1);
		list1.removeAll(list1);
		System.out.println("After Removing All Elements in a list : " + list1);
		System.out.println("It is Empty : " + list1.isEmpty());

	}

}

/*
 * Output :
 * 
 * List 1 : [one, Two, Three, Four]
 * After Removing All Elements in a list : []
 * It is Empty : true

*/