package set_tasks;

import java.util.HashSet;

//Write a Java program to Create a HashSet with string items

public class Task_20 {

	public static void main(String[] args) {

		HashSet<String> hashSet1 = new HashSet<String>();
		hashSet1.add("Black");
		hashSet1.add("White");
		hashSet1.add("Blue");
		hashSet1.add("Orange");
		hashSet1.add("Pink");
		System.out.println("HashSet 1 : " + hashSet1);

	}
}


// Output :

// HashSet 1 : [White, Pink, Blue, Black, Orange]



