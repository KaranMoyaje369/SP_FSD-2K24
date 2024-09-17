//Write a program to array elements print all Negative number

import java.util.Scanner;

public class Task_17 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of an Array : ");
		int sizeOfArray = sc.nextInt();
		
		int[] arr = new int[sizeOfArray];
		for(int i = 0; i < sizeOfArray; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Original Array Is : ");
		for(int element : arr) {
			System.out.print(element+" ");
		}
		
		System.out.println();  // adding new line for spacing...
		System.out.println();  // adding new line for spacing...
		
		System.out.print("Negative Number in a Given Array Is : ");
		for(int element : arr) {
			if(element < 0) {
				System.out.print(element+" ");
			}
		}

	}

}

// Output :

// Enter Size of an Array : 5
// -3
// 5
// -6
// 2
// -8
// Original Array Is : -3 5 -6 2 -8 

// Negative Number in a Given Array Is : -3 -6 -8



