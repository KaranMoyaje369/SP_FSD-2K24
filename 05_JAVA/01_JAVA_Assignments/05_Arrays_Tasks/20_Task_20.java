
//Write a program to Sort Numeric Array In Ascending Order

import java.util.Arrays;

public class Task_20 {

	public static void main(String[] args) {


		int[] arr = {10,50,34,23,43};
		System.out.print("Original Array Is : ");
		for(int element : arr) {
			System.out.print(element+" ");
		}
		
		System.out.println();  // adding new line for spacing...
		System.out.println();  // adding new line for spacing...
		
		Arrays.sort(arr);
		System.out.print("Sorting Numeric Array in Ascending Order is : ");
		for(int element : arr) {
			System.out.print(element+" ");
		}

	}

}

// Output :

// Original Array Is : 10 50 34 23 43 

// Sorting Numeric Array in Ascending Order is : 10 23 34 43 50 



