//Write a program to Delete Duplicate Elements from an Array

import java.util.Scanner;

public class Task_23 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter Size of An Arrray : ");
		int sizeOfArray = input.nextInt();

		int[] arr = new int[sizeOfArray];
		for (int i = 0; i < sizeOfArray; i++) {
			arr[i] = input.nextInt();
		}

		System.out.print("Original Array Is : ");
		for (int element : arr) {
			System.out.print(element + " ");
		}

		System.out.println(); // Add new Line Spacing...
		System.out.println(); // Add new Line Spacing...

		int j = 0;
		
		for (int i = 0; i < sizeOfArray; i++) {
			int k;
			
			for (k = 0; k < i; k++) {
				if (arr[i] == arr[k]) {
					break; 
				}
			}


			if (k == i) {
				arr[j++] = arr[i];
			}
		}

		// Print the array without duplicates
		System.out.print("Array without duplicates: ");
		for (int i = 0; i < j; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

// Output : 


// Enter Size of An Arrray : 5
// 10
// 21
// 23
// 10
// 23
// Original Array Is : 10 21 23 10 23 

// Array without duplicates: 10 21 23 


