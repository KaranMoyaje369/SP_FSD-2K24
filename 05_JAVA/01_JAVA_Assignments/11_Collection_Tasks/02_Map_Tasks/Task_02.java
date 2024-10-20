package map_tasks;

//Write a Java program to count the number of key-value (size) mappings in a map

import java.util.HashMap;

public class Task_02 {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Black");
		hashMap.put(2, "White");
		hashMap.put(3, "Orange");
		hashMap.put(4, "Blue");
		hashMap.put(5, "Red");

		System.out.println("Count of Key-value in HashMap : " + hashMap.size());
	}
}


// Output :

// Count of Key-value in HashMap : 5
