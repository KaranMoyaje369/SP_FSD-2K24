// //Write a program to store elements in an array and print it

import java.util.Scanner;

public class Task_36 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of An Array : ");
		int sizeOfArray =sc.nextInt();
		
		int[] arr = new int[sizeOfArray];
		for(int i=0; i<sizeOfArray; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Elements Are Successfully Stored in Array... ");
		
		System.out.println();  // Add new line for spacing..
		System.out.println();  // Add new line for spacing..
		
		System.out.print("Now It's Time to Print an Array : ");
		for(int element : arr) {
			System.out.print(element+" ");
		}
	}

}


// Output :


// Enter Size of An Array : 5
// 34
// 45
// 56
// 76
// 33
// Elements Are Successfully Stored in Array... 

// Now It's Time to Print an Array : 34 45 56 76 33 


