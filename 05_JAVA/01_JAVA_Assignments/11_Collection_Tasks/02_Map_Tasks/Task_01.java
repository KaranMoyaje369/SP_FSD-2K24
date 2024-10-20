package map_tasks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// //Write a Java program to associate the specified value with the specified key in a HashMap

public class Task_01 {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Black");
		hashMap.put(2, "White");
		hashMap.put(3, "Orange");
		hashMap.put(4, "Blue");
		hashMap.put(5, "Red");

		for (Map.Entry x : hashMap.entrySet()) {
			System.out.println(x.getKey() + " " + x.getValue());
		}

		System.out.println("\nBy Using Iterator :\n");
		Set<Entry<Integer, String>> result = hashMap.entrySet();
		Iterator<Entry<Integer, String>> itr = result.iterator();
		while (itr.hasNext()) {
			Entry<Integer, String> finalRes = itr.next();
			System.out.println(finalRes.getKey() + " " + finalRes.getValue());
		}
	}
}

/*
 * Output :
 * 
 * 1 Black
 * 2 White
 * 3 Orange
 * 4 Blue
 * 5 Red
 * 
 * By Using Iterator :
 * 
 * 1 Black
 * 2 White
 * 3 Orange
 * 4 Blue
 * 5 Red
 
*/