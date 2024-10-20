package set_tasks;

import java.util.HashSet;

//Write a Java program to empty an hash set

public class Task_09 {

	public static void main(String[] args) {

		HashSet<String> hashSet1 = new HashSet<String>();
		hashSet1.add("Black");
		hashSet1.add("White");
		hashSet1.add("Blue");
		hashSet1.add("Orange");
		hashSet1.add("Pink");
		System.out.println("HashSet 1 : " + hashSet1);
		System.out.println("Is Empty : " + hashSet1.isEmpty());

		hashSet1.removeAll(hashSet1);
		System.out.println("After Clearing HashSet : " + hashSet1);
		System.out.println("Is Empty : " + hashSet1.isEmpty());
	}
}

// Output :

// HashSet 1 : [White, Pink, Blue, Black, Orange]
// Is Empty : false
// After Clearing HashSet : []
// Is Empty : true



