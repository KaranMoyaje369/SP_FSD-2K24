package set_tasks;

import java.util.HashSet;

//Write a Java program to clone a hash set to another hash set

public class Task_07 {

	public static void main(String[] args) {

		HashSet<String> hashSet1 = new HashSet<String>();
		hashSet1.add("Black");
		hashSet1.add("White");
		hashSet1.add("Blue");
		hashSet1.add("Orange");
		hashSet1.add("Pink");
		System.out.println("HashSet 1 : " + hashSet1);

		HashSet<String> cloneHashSet = new HashSet<String>();
		cloneHashSet = (HashSet<String>) hashSet1.clone();

		System.out.println("Clone Hash Set Is : " + cloneHashSet);
	}
}


// Output :

// HashSet 1 : [White, Pink, Blue, Black, Orange]
// Clone Hash Set Is : [White, Pink, Black, Blue, Orange]


