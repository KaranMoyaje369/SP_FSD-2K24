package set_tasks;

//Write a Java program to Remove elements from HashSet collection based on a specified predicate

import java.util.HashSet;

public class Task_29 {

	public static void main(String[] args) {
		HashSet<Integer> nums = new HashSet<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		nums.add(7);
		nums.add(8);
		nums.add(9);
		nums.add(10);

		System.out.println("HashSet Elements : " + nums);

		if (nums.removeIf(val -> (val > 5))) {
			System.out.println("Items removed successfully.");
		} else {
			System.out.println("Unable to remove Items.");
		}
		System.out.println("HashSet Elements : " + nums);
	}
}

// Output :

// HashSet Elements : [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
// Items removed successfully.
// HashSet Elements : [1, 2, 3, 4, 5]


