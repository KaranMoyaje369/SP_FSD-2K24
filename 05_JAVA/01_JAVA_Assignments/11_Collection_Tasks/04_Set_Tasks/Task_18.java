package set_tasks;

import java.util.HashSet;

//Write a Java program to Copy Set content to another HashSet

public class Task_18 {

	public static void main(String[] args) {

		HashSet<String> hashSet1 = new HashSet<String>();
		hashSet1.add("Black");
		hashSet1.add("White");
		hashSet1.add("Blue");
		hashSet1.add("Orange");
		hashSet1.add("Pink");
		System.out.println("HashSet 1 : " + hashSet1);

		HashSet<String> hashSet2 = new HashSet<String>();
		hashSet2.add("1");
		hashSet2.add("2");
		hashSet2.add("3");
		hashSet2.add("4");
		hashSet2.add("5");
		System.out.println("HashSet 2 : " + hashSet2);

		hashSet1.addAll(hashSet2);
		System.out.println("Copy Element of HashSet 2 to HashSet 1 : " + hashSet1);

	}
}


// Output :


// HashSet 1 : [White, Pink, Blue, Black, Orange]
// HashSet 2 : [1, 2, 3, 4, 5]
// Copy Element of HashSet 2 to HashSet 1 : [1, 2, White, Pink, 3, 4, Blue, 5, Black, Orange]



