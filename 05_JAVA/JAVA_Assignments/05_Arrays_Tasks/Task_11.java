//Write a program to array elements to print sum of Cubic Values

import java.util.Scanner;

public class Task_11 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of an Array : ");
		int sizeOfArray = sc.nextInt();
		
		int[] arr = new int[sizeOfArray];
		for(int i = 0; i < sizeOfArray; i++) {
			arr[i] = sc.nextInt();		
		}
		
		System.out.print("Original Array : ");
		for(int element : arr) {
			System.out.print(element+" ");
		}
		System.out.println();  // adding new line for spacing...
		System.out.println();  // adding new line for spacing...
		
		
		System.out.print("Cubic Array : ");
		for(int element : arr) {
			System.out.print((element*element*element)+" ");
		}
		
		
		int sumOfCubicArray = 0;
		for(int element : arr) {
			sumOfCubicArray += (element*element*element); 
		}
		System.out.println();  // adding new line for spacing...
		System.out.println();  // adding new line for spacing...
		
		System.out.print("Sum Of Cubic Array Is : "+sumOfCubicArray);
			
	}

}

// Output :


// Enter Size of an Array : 4
// 1
// 2
// 3
// 4
// Original Array : 1 2 3 4 

// Cubic Array : 1 8 27 64 

// Sum Of Cubic Array Is : 100



