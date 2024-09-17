//Write a program to Sort Numeric Array In Descending Order

import java.util.Arrays;
import java.util.Scanner;

public class Task_24 {

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
		
		Arrays.sort(arr);
		System.out.print("Sorting Array in Descending Order is : ");
		for(int i = sizeOfArray-1; i >= 0; i--) {
			System.out.print(arr[i] +" ");
		}
	}

}

// Output :


// Enter Size of An Arrray : 5
// 10
// 20
// 30
// 40
// 50
// Original Array Is : 10 20 30 40 50 

// Sorting Array in Descending Order is : 50 40 30 20 10 



