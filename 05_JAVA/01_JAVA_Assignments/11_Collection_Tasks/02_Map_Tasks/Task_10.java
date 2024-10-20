package map_tasks;

import java.util.HashMap;

//Write a Java program to get the value of a specified key in a map

public class Task_10 {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Black");
		hashMap.put(2, "Orange");
		hashMap.put(3, "White");
		hashMap.put(4, "Red");
		hashMap.put(5, "Pink");

		String val = hashMap.get(4);
		System.out.println("Value Is at Key 4  : " + val);
	}
}

// Output :

// Value Is at Key 4  : Red


