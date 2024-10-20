package set_tasks;

import java.util.ArrayList;
import java.util.HashSet;

//Write a Java program to Adding ArrayList elements to HashSet

public class Task_17 {

	public static void main(String[] args) {

		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		arrList.add(4);
		arrList.add(5);
		System.out.println("Given Array List : " + arrList);

		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.addAll(arrList);
		System.out.println("HashSet IS : " + hashSet);

	}
}

// Output :

// Given Array List : [1, 2, 3, 4, 5]
// HashSet IS : [1, 2, 3, 4, 5]



