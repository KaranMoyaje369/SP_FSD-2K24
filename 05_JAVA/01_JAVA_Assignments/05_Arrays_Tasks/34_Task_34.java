//write a program to print values in reverse order

import java.util.Scanner;

public class Task_34 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of An Array : ");
		int sizeOfArray =sc.nextInt();
		
		int[] arr = new int[sizeOfArray];
		for(int i=0; i<sizeOfArray; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Original Array Is : ");
		for(int element : arr) {
			System.out.print(element+" ");
		}
		
		System.out.println();  // Add new line for spacing..
		System.out.println();  // Add new line for spacing..
		
		System.out.print("Reversed Array Is : ");
		for(int i = sizeOfArray-1; i >= 0; i--) {
			System.out.print(arr[i]+" ");
		}

	}

}


// Output :


// Enter Size of An Array : 5
// 23
// 45
// 76
// 34
// 56
// Original Array Is : 23 45 76 34 56 

// Reversed Array Is : 56 34 76 45 23



