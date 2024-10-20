package map_tasks;

//Write a Java program to remove all the mappings from a map

import java.util.HashMap;

public class Task_04 {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Black");
		hashMap.put(2, "White");
		hashMap.put(3, "Orange");
		System.out.println("Original HashMap : " + hashMap);

		hashMap.clear();
		System.out.println("Clear HashMap : " + hashMap);
		System.out.println("Is Empty : " + hashMap.isEmpty());

	}
}

/*
 * Original HashMap : {1=Black, 2=White, 3=Orange}
 * Clear HashMap : {}
 * Is Empty : true
 
*/