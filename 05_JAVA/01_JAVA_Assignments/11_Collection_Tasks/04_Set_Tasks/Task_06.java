package set_tasks;

import java.util.HashSet;

//Write a Java program to convert a hash set to an array

public class Task_06 {

	public static void main(String[] args) {

		HashSet<String> hashSet1 = new HashSet<String>();
		hashSet1.add("Black");
		hashSet1.add("White");
		hashSet1.add("Blue");
		hashSet1.add("Orange");
		hashSet1.add("Pink");
		System.out.println("HashSet 1 : " + hashSet1);

		System.out.println("Converting to HashSet to an Array...");
		String[] arr = new String[hashSet1.size()];
		hashSet1.toArray(arr);

		for (String e : arr) {
			System.out.println(e + " ");
		}

	}
}

// Output :

// HashSet 1 : [White, Pink, Blue, Black, Orange]
// Converting to HashSet to an Array...
// White 
// Pink 
// Blue 
// Black 
// Orange 

