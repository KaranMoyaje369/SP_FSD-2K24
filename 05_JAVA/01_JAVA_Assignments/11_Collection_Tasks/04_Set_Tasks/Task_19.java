package set_tasks;

import java.util.HashSet;

//Write a Java program to Copy all elements from HashSet to an array

public class Task_19 {

	public static void main(String[] args) {

		HashSet<String> hashSet1 = new HashSet<String>();
		hashSet1.add("Black");
		hashSet1.add("White");
		hashSet1.add("Blue");
		hashSet1.add("Orange");
		hashSet1.add("Pink");
		System.out.println("HashSet 1 : " + hashSet1);

		String[] arr = new String[hashSet1.size()];
		hashSet1.toArray(arr);
		for (String e : arr) {
			System.out.println(e);
		}
	}
}

// Output :

// HashSet 1 : [White, Pink, Blue, Black, Orange]
// White
// Pink
// Blue
// Black
// Orange




