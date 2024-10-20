package set_tasks;

import java.util.HashSet;

//Write a Java program to Print HashSet elements using parallelStream() method

public class Task_28 {

	public static void main(String[] args) {
		HashSet<Integer> nums = new HashSet<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);

		System.out.println("HashSet Elements : ");
		nums.parallelStream().forEach(System.out::println);
	}
}

// Output :

// HashSet Elements : 
// 40
// 10
// 30
// 20
// 50


