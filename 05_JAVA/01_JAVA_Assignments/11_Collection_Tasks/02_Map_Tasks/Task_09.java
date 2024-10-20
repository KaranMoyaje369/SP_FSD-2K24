package map_tasks;

import java.util.HashMap;
import java.util.Set;

//Write a Java program to create a set view of the mappings contained in a map

public class Task_09 {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Black");
		hashMap.put(2, "Orange");
		hashMap.put(3, "White");
		hashMap.put(4, "Red");
		hashMap.put(5, "Pink");

		Set set = hashMap.entrySet();
		System.out.println("Entry Set Is : " + set);
	}

}

// Output :

// Entry Set Is : [1=Black, 2=Orange, 3=White, 4=Red, 5=Pink]


