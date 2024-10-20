package set_tasks;

import java.util.HashSet;

//Write a Java program to Print a HashSet collection using the foreach loop

public class Task_22 {

	public static void main(String[] args) {

		HashSet diffTypes = new HashSet();
		diffTypes.add(4);
		diffTypes.add("Hello");
		diffTypes.add(23.33);
		diffTypes.add(true);

		System.out.println("Print HashSet Using For Each Loop....");
		for (Object e : diffTypes) {
			System.out.println(e);
		}

	}
}


// Output :

// Print HashSet Using For Each Loop....
// 4
// Hello
// 23.33
// true



