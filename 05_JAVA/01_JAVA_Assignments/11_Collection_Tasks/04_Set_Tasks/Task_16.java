package set_tasks;

import java.util.HashSet;

//Write a Java program to Adding duplicate elements to HashSet

public class Task_16 {

	public static void main(String[] args) {

		HashSet<String> hashSet1 = new HashSet<String>();
		hashSet1.add("Black");
		hashSet1.add("White");
		hashSet1.add("Blue");
		hashSet1.add("Orange");
		hashSet1.add("Pink");
		System.out.println("HashSet 1 : " + hashSet1);

		// adding duplicate elements
		hashSet1.add("Black");
		hashSet1.add("White");

		System.out.println("After adding duplicate elements in a HashSet : " + hashSet1);
	}
}


// Output :

// HashSet 1 : [White, Pink, Blue, Black, Orange]
// After adding duplicate elements in a HashSet : [White, Pink, Blue, Black, Orange]



