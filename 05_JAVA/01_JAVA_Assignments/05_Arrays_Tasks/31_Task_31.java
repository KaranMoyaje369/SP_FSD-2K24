
//write a java program print Odd and Even Numbers from an Array

import java.util.Scanner;

public class Task_31 {

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
		
		System.out.print("Even Number in a Array Is : ");
		for(int element : arr) {
			if(element % 2 == 0) {
				System.out.print(element+" ");
			}
		}
		
		System.out.println();  // Add new line for spacing..
		System.out.println();  // Add new line for spacing..
		
		System.out.print("Odd Number in a Array Is : ");
		for(int element : arr) {
			if(element % 2 != 0) {
				System.out.print(element+" ");
			}
		}

	}

}


// Output :

// Enter Size of An Array : 10
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10
// Original Array Is : 1 2 3 4 5 6 7 8 9 10 

// Even Number in a Array Is : 2 4 6 8 10 

// Odd Number in a Array Is : 1 3 5 7 9 



