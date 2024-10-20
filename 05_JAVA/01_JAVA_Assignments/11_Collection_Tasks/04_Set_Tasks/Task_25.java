package set_tasks;

import java.util.HashSet;

//Write a Java program to Find the union of HashSet collections

public class Task_25 {

	public static void main(String[] args) {

		HashSet<Integer> hashSet1 = new HashSet<Integer>();
		hashSet1.add(10);
		hashSet1.add(23);
		hashSet1.add(50);
		hashSet1.add(40);
		hashSet1.add(20);
		System.out.println("HashSet 1 : " + hashSet1);

		HashSet<Integer> hashSet2 = new HashSet<Integer>();
		hashSet2.add(30);
		hashSet2.add(20);
		hashSet2.add(50);
		System.out.println("HashSet 2 : " + hashSet2);

		hashSet1.addAll(hashSet2);
		System.out.println("Union HashSet : " + hashSet1);
	}
}

// Output :

// HashSet 1 : [50, 20, 23, 40, 10]
// HashSet 2 : [50, 20, 30]
// Union HashSet : [50, 20, 23, 40, 10, 30]



