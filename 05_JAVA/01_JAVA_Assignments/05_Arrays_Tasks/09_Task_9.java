
//Write a program to find the second smallest element in an array

import java.util.Arrays;
import java.util.Scanner;

public class Task_9 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of an Array : ");
		int sizeOfArray = sc.nextInt();

		int[] arr = new int[sizeOfArray];
		for (int i = 0; i < sizeOfArray; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Original Array Is : ");
		for (int element : arr) {
			System.out.print(element + " ");
		}
		
		System.out.println();  // add new line for spacing....
		System.out.println();  // add new line for spacing....
		
		Arrays.sort(arr);
		System.out.print("Sorting Array Is : ");
		for (int element : arr) {
			System.out.print(element + " ");
		}
		
		System.out.println();  // add new line for spacing....
		System.out.println();  // add new line for spacing....
		
		System.out.println("First Smallest Number Is : " +arr[0]);
		System.out.print("Second Smallest Number Is : " +arr[1]);
		
	}

}


// Output : 


// Enter Size of an Array : 5
// 89
// 38
// 7
// 56
// 66
// Original Array Is : 89 38 7 56 66 

// Sorting Array Is : 7 38 56 66 89 

// First Smallest Number Is : 7
// Second Smallest Number Is : 38


