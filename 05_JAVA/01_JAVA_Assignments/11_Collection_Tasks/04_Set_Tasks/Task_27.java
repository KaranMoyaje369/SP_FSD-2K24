package set_tasks;

import java.util.HashSet;
import java.util.Spliterator;

//Write a Java program to Print HashSet elements using spliterator() method

public class Task_27 {

	public static void main(String[] args) {

		HashSet<Integer> nums1 = new HashSet<Integer>();
		nums1.add(10);
		nums1.add(20);
		nums1.add(30);
		nums1.add(40);
		nums1.add(50);
		nums1.add(60);

		Spliterator<Integer> itr = nums1.spliterator();
		System.out.print("HashSet Elements : \n");
		itr.forEachRemaining((n) -> System.out.print(n + " "));
	}
}

// Output :

// HashSet Elements : 
// 50 20 40 10 60 30 



