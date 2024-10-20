package map_tasks;

//Write a Java program to copy all of the mappings from the specified map to another map

import java.util.HashMap;

public class Task_03 {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
		hashMap1.put(1, "Apple");
		hashMap1.put(2, "Banana");
		hashMap1.put(3, "Orange");
		System.out.println("HashMap 1 : " + hashMap1);

		HashMap<Integer, String> hashMap2 = new HashMap<Integer, String>();
		hashMap2.put(1, "Black");
		hashMap2.put(2, "White");
		hashMap2.put(3, "Pink");
		System.out.println("HashMap 2 : " + hashMap2);

		hashMap2.putAll(hashMap1);
		;
		System.out.println("Copy HashMap 2 : " + hashMap2);

	}
}

/*

 * HashMap 1 : {1=Apple, 2=Banana, 3=Orange}
 * HashMap 2 : {1=Black, 2=White, 3=Pink}
 * Copy HashMap 2 : {1=Apple, 2=Banana, 3=Orange}
 
*/