package map_tasks;

import java.util.HashMap;

//Write a Java program to get a shallow copy of a HashMap instance

public class Task_06 {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "One");
		hashMap.put(2, "Two");
		hashMap.put(3, "Three");
		System.out.println("Original HashMap Is : " + hashMap);

		HashMap<Integer, String> newHashMap = new HashMap<Integer, String>();
		newHashMap = (HashMap) hashMap.clone();
		System.out.println("New Clone HashMap Is : " + newHashMap);
	}
}

// Output :

// Original HashMap Is : {1=One, 2=Two, 3=Three}
// New Clone HashMap Is : {1=One, 2=Two, 3=Three}


