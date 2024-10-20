package list_tasks;

// Increase Size

import java.util.ArrayList;

public class Task_06 {

	public static void main(String[] args) {

		ArrayList<String> book = new ArrayList<String>(4);
		book.add("HTML");
		book.add("CSS");
		book.add("JS");
		book.add("ReactJS");

		System.out.println("Original List : " + book);

		book.ensureCapacity(7);
		book.add("JAVA");
		book.add("MySQL");
		book.add("NodeJs");
		System.out.println("After Increasing Capacity : " + book);

	}

}

/*
 * Output :
 * 
 * Original List : [HTML, CSS, JS, ReactJS]
 * After Increasing Capacity : [HTML, CSS, JS, ReactJS, JAVA, MySQL, NodeJs]
		 
*/