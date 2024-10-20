package list_tasks;

// Reverse Array List


import java.util.ArrayList;
import java.util.Collections;

public class Task_07 {

	public static void main(String[] args) {

		ArrayList<String> book = new ArrayList<String>(4);
		book.add("HTML");
		book.add("CSS");
		book.add("JS");
		book.add("ReactJS");
		book.add("JAVA");
		book.add("MySQL");
		book.add("NodeJs");

		System.out.println("Original List : " + book);
	    Collections.reverse(book);
	    System.out.println("After Reversing List : "+book);

	}

}

/*
 * Output :
 * 
 * Original List : [HTML, CSS, JS, ReactJS, JAVA, MySQL, NodeJs] 
 * After Reversing List : [NodeJs, MySQL, JAVA, ReactJS, JS, CSS, HTML]
 * 
 */
