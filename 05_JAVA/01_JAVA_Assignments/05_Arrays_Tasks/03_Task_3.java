
//Write a program to array elements to print cubic values

import java.util.Arrays;
import java.util.Scanner;

public class Task_3 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Size of the Array : ");
		int sizeOfArray = sc.nextInt();
		
		int[] arr = new int[sizeOfArray];
		
		for(int i = 0; i < sizeOfArray; i++) {
			
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Original Array Is : ");
		for(int element : arr) {
			System.out.print(element+" ");
		}
		
		System.out.println();  // add new line for spacing....
		System.out.println();  // add new line for spacing....
		
		int[] cubicArray = new int[sizeOfArray];
		
		for(int i = 0; i < sizeOfArray; i++) {
			cubicArray[i] = arr[i];
		}
		
		System.out.print("Cubic Array Is : ");
		for(int element : cubicArray) {
			System.out.print((element*element*element)+" ");
		}
		
	}

}


// Output :

// Enter Size of the Array : 4
// 1
// 2
// 3
// 4
// Original Array Is : 1 2 3 4 

// Cubic Array Is : 1 8 27 64 
 

