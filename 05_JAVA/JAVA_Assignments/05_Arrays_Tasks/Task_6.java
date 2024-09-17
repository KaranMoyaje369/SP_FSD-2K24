//Write a program to array elements print all Odd number

import java.util.Scanner;

public class Task_6 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of an Array : ");
		int sizeOfArray = sc.nextInt();

		int[] arr = new int[sizeOfArray];
		for (int i = 0; i < sizeOfArray; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Original Array Is : ");
		for (int element : arr) {
			System.out.print(element + " ");
		}
		
		System.out.println();  // add new line for spacing....
		System.out.println();  // add new line for spacing....
		
		
		System.out.println("Odd Number in given Array is : ");
		for(int element : arr) {
			
			if(element % 2 != 0) {
				System.out.println(element+" ");
			}
		}
	}

}


// Output : 


// Enter Size of an Array : 10
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

// Odd Number in given Array is : 
// 1 
// 3 
// 5 
// 7 
// 9 


