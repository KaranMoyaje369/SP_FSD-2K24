package set_tasks;

import java.util.HashSet;

//Write a Java program to Create a HashSet with different types of items

public class Task_21 {

	public static void main(String[] args) {

		HashSet diffTypes = new HashSet();
		diffTypes.add(4);
		diffTypes.add("Hello");
		diffTypes.add(23.33);
		diffTypes.add(true);

		System.out.println("HashSet Is with Different Data Types : " + diffTypes);
	}
}


// Output :

// HashSet Is with Different Data Types : [4, Hello, 23.33, true]


