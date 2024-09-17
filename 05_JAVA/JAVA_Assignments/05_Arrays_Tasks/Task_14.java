//Write a program to array elements to print sum of Odd Numbers

import java.util.Scanner;

public class Task_14 {

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
		
		int sumOfArray = 0;
		System.out.print("Odd Number in given Array Is : ");
		for(int element : arr) {
			if(element % 2 != 0) {
				System.out.print(element+" ");
				sumOfArray += element;
			}
		}
		
		System.out.println();  // adding new line for spacing...
		System.out.println();  // adding new line for spacing...
		System.out.println("Sum Of Odd Number Present in a given Array is : "+sumOfArray);

	}

}



// Output : 


// Enter Size of an Array : 5
// 1
// 2
// 3
//4
// 5
// Original Array Is : 1 2 3 4 5 

// Odd Number in given Array Is : 1 3 5 

// Sum Of Odd Number Present in a given Array is : 9




