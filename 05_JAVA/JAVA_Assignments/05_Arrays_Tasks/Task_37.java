//Write a program in to find the sum of all elements of the array

import java.util.Scanner;

public class Task_37 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of An Array : ");
		int sizeOfArray =sc.nextInt();
		
		int[] arr = new int[sizeOfArray];
		for(int i=0; i<sizeOfArray; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sumOfArray = 0;
		System.out.print("Original Array Is : ");
		for(int element : arr) {
			System.out.print(element+" ");
			sumOfArray += element;
		}
		
		System.out.println();  // Add new line for spacing..
		System.out.println();  // Add new line for spacing..
		
		System.out.print("Sum of all Elements in Array Is : "+sumOfArray);

	}

}

// Output :


// Enter Size of An Array : 5
// 23
// 53
// 345
// 3
// 2
// Original Array Is : 23 53 345 3 2 

// Sum of all Elements in Array Is : 426



