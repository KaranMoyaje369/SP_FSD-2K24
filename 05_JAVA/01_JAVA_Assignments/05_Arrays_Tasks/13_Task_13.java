
//Write a program to array elements to print sum of Negative Numbers

import java.util.Scanner;

public class Task_13 {
	

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
		
		int negativeNum = 0;
		System.out.print("Negative Number in a Given Array Is : ");
		for(int element : arr) {
			if(element < 0) {
				System.out.print(element+" ");
				negativeNum += element;
			}
		}
		
		System.out.println();  // adding new line for spacing...
		System.out.println();  // adding new line for spacing...
		
		System.out.print("Sum Of Negative Number in a Given Array Is : "+negativeNum);

	}

}

// Output :

// Enter Size of an Array : 5
// 1
// 0
// -3
// -4
// 5
// Original Array Is : 1 0 -3 -4 5 

// Negative Number in a Given Array Is : -3 -4 

// Sum Of Negative Number in a Given Array Is : -7


