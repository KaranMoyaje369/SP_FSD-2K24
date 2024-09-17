//Write a program to read n number of values in an array and display in reverse order

import java.util.Scanner;

public class Task_7 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of an Array : ");
		int sizeOfArray = sc.nextInt();
		
		int[] arr = new int[sizeOfArray];
		for(int i = 0; i < sizeOfArray; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Original Array is : ");
		for(int element : arr) {
			System.out.print(element+" ");
		}
		
		System.out.println();  // add new line for spacing....
		System.out.println();  // add new line for spacing....
		
		System.out.print("Reversed Array Is : ");
		for(int i = sizeOfArray-1; i >= 0 ; i--) {
			System.out.print(arr[i]+" ");
		}
	}

}

// Output : 

// Enter Size of an Array : 3
// 4
// 5
// 6
// Original Array is : 4 5 6 

// Reversed Array Is : 6 5 4 


