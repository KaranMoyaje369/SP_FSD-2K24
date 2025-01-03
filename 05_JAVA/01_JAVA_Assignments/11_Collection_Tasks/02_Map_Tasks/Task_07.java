package map_tasks;

import java.util.HashMap;

//Write a Java program to test if a map contains a mapping for the specified key

public class Task_07 {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Black");
		hashMap.put(2, "Orange");
		hashMap.put(3, "White");
		hashMap.put(4, "Red");
		hashMap.put(5, "Pink");
		System.out.println("Given HashMap IS : " + hashMap);

		System.out.println("Check Black is Present or Not...");
		if (hashMap.containsKey(1)) {
			System.out.println("Yes ! " + hashMap.get(1));
		} else {
			System.out.println("No !");
		}
	}
}

/*
 * Output :
 * Given HashMap IS : {1=Black, 2=Orange, 3=White, 4=Red, 5=Pink}
 * Check Black is Present or Not...
 * Yes ! Black

*/
