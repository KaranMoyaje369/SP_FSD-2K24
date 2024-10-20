package set_tasks;

import java.util.HashSet;

//Write a Java program to Removes first Occurrence of the element specified in the argument list from the hashset

public class Task_13 {
	public static void main(String[] args) {

		HashSet<String> hashSet1 = new HashSet<String>();
		hashSet1.add("Black");
		hashSet1.add("White");
		hashSet1.add("Blue");
		hashSet1.add("Orange");
		hashSet1.add("Pink");
		System.out.println("HashSet 1 : " + hashSet1);

		hashSet1.remove("Blue");
		System.out.println("After Removing some Element : " + hashSet1);
	}
}

// Output :

// HashSet 1 : [White, Pink, Blue, Black, Orange]
// After Removing some Element : [White, Pink, Black, Orange]


