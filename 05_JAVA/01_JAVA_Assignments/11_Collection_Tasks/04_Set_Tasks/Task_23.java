package set_tasks;

import java.util.HashSet;

//Write a Java program to Check whether a HashSet contains a specified item or not

public class Task_23 {

	public static void main(String[] args) {

		HashSet<String> hashSet1 = new HashSet<String>();
		hashSet1.add("Black");
		hashSet1.add("White");
		hashSet1.add("Blue");
		hashSet1.add("Orange");
		hashSet1.add("Pink");
		System.out.println("HashSet 1 : " + hashSet1);

		if (hashSet1.contains("Black")) {
			System.out.println("Black IS Found !");
		} else {
			System.out.println("Black Is Not Found !");
		}
	}
}


// Output :

// HashSet 1 : [White, Pink, Blue, Black, Orange]
// Black IS Found !



