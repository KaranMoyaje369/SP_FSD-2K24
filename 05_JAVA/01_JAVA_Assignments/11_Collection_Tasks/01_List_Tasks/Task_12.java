package list_tasks;

import java.util.ArrayList;

public class Task_12 {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("one");
		list1.add("Two");
		list1.add("Three");
		list1.add("Four");
		list1.add("Five");
		list1.add("Six");
		list1.add("Seven");
		list1.add("Eight");
		System.out.println("List 1 : " + list1);
		System.out.println("First Element : " + list1.get(0));
		System.out.println("Last Element : " + list1.get(list1.size() - 1));

	}

}

/*
 * Output :
 * 
 * List 1 : [one, Two, Three, Four, Five, Six, Seven, Eight]
 * First Element : one
 * Last Element : Eight
 
*/