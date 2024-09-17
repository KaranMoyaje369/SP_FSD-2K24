//Write a program copy all elements of one array into another array

import java.util.Scanner;

public class Task_22 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of An Array : ");
		int sizeOfArray = sc.nextInt();
		
		int[] arr = new int[sizeOfArray];
		
		for(int i = 0; i < sizeOfArray; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Original Array Is : ");
		for(int element : arr) {
			System.out.print(element+" ");
		}
		
		System.out.println(); // Add new Line Spacing...
		System.out.println(); // Add new Line Spacing...
		

		int[] copyArray = new int[sizeOfArray];
		
		for(int i = 0; i < arr.length; i++) {
			copyArray[i] = arr[i];
		}
		
		System.out.print("Copied Array Is : ");
		for(int element : copyArray) {
			System.out.print(element+" ");
		}
	}

}


// Output :


// Enter Size of An Array : 4
// 1
// 2
// 3
// 4
// Original Array Is : 1 2 3 4 

// Copied Array Is : 1 2 3 4 


