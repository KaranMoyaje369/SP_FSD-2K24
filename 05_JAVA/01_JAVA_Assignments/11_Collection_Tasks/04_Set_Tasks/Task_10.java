package set_tasks;

import java.util.HashSet;

//Write a Java program to get the number of elements in a hash set

public class Task_10 {

	public static void main(String[] args) {

		HashSet<String> hashSet1 = new HashSet<String>();
		hashSet1.add("Black");
		hashSet1.add("White");
		hashSet1.add("Blue");
		hashSet1.add("Orange");
		hashSet1.add("Pink");
		System.out.println("HashSet 1 : " + hashSet1);

		System.out.println("Size Of Above HashSet IS : " + hashSet1.size());
	}
}


// Output :

// HashSet 1 : [White, Pink, Blue, Black, Orange]
// Size Of Above HashSet IS : 5


