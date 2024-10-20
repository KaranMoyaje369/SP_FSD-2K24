package set_tasks;

import java.util.HashSet;
import java.util.Iterator;

//Write a Java program to iterate through all elements in a hash list

public class Task_11 {

	public static void main(String[] args) {

		HashSet<String> hashSet1 = new HashSet<String>();
		hashSet1.add("Black");
		hashSet1.add("White");
		hashSet1.add("Blue");
		hashSet1.add("Orange");
		hashSet1.add("Pink");
		System.out.println("HashSet 1 : " + hashSet1);

		Iterator<String> itr = hashSet1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}


// Output :


// HashSet 1 : [White, Pink, Blue, Black, Orange]
// White
// Pink
// Blue
// Black
// Orange


