
//Write a program to find the maximum and minimum element in an array

import java.util.Scanner;

public class Task_5 {

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

		int maxNum = arr[0];
		int minNum = arr[0];

		for (int element : arr) {
			if (element > maxNum) {
				maxNum = element;

			} else if (element < minNum) {
				minNum = element;

			}
		}

		System.out.println("Maximum Number Is : " + maxNum);
		System.out.println("Minimum Number Is : " + minNum);

	}

}

// Output :

// Enter Size of an Array : 5
// 1
// 2
// 3
// 4
// 5
// Original Array Is : 1 2 3 4 5 
//
// Maximum Number Is : 5
// Minimum Number Is : 1



