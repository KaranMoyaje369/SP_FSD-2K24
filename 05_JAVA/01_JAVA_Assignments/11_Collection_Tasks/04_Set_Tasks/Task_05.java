package set_tasks;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//Write a Java program to convert a hash set to a tree set

public class Task_05 {

	public static void main(String[] args) {

		HashSet<String> hashSet1 = new HashSet<String>();
		hashSet1.add("Black");
		hashSet1.add("White");
		hashSet1.add("Blue");
		hashSet1.add("Orange");
		hashSet1.add("Pink");
		System.out.println("HashSet 1 : " + hashSet1);

		Set<String> treeSet = new TreeSet<String>(hashSet1);
		System.out.println("Tree Set Is : " + treeSet);
	}
}

/*
 * Output :
 * 
 * HashSet 1 : [White, Pink, Blue, Black, Orange]
 * Tree Set Is : [Black, Blue, Orange, Pink, White]
 *
*/