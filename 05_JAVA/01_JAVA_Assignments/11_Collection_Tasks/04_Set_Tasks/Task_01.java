package set_tasks;

import java.util.HashSet;

//Write a Java program to remove all of the elements from a hash set

public class Task_01 {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Karan");
		hashSet.add("Sahil");
		hashSet.add("Dhiraj");
		hashSet.add("Ajay");
		System.out.println("Current HashSet : " + hashSet);

		hashSet.clear();
		System.out.println("After HashSet Clear : " + hashSet);
	}
}

/*
 * Output :
 * 
 * Current HashSet : [Sahil, Dhiraj, Karan, Ajay]
 * After HashSet Clear : []
 * 
*/
	