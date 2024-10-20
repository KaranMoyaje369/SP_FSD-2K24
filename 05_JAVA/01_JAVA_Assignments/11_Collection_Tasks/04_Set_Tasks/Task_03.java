package set_tasks;

import java.util.HashSet;

//Write a Java program to compare two hash sets

public class Task_03 {

	public static void main(String[] args) {

		HashSet<String> hashSet1 = new HashSet<String>();
		hashSet1.add("Black");
		hashSet1.add("White");
		hashSet1.add("Blue");
		hashSet1.add("Orange");
		hashSet1.add("Pink");
		System.out.println("HashSet 1 : " + hashSet1);

		HashSet<String> hashSet2 = new HashSet<String>();
		hashSet2.add("Black");
		hashSet2.add("Pink");
		hashSet2.add("Orange");
		hashSet2.add("blue");
		System.out.println("HashSet 2 : " + hashSet2);

		System.out.println("Comparing Two Sets ....");
		for (String e : hashSet1) {
			System.out.println(hashSet2.contains(e));
		}
	}
}


/*
 * Output :
 * HashSet 1 : [White, Pink, Blue, Black, Orange]
 * HashSet 2 : [Pink, blue, Black, Orange]
 * Comparing Two Sets ....
 * false
 * true
 * false
 * true
 * true
 *
*/

