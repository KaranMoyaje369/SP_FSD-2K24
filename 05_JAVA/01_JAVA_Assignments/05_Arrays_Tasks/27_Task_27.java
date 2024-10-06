
//write a java program print the largest element in an array

import java.util.Scanner;

public class Task_27 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		System.out.print("Enter Size of An Arrray : ");
		int sizeOfArray = input.nextInt();

		int[] arr = new int[sizeOfArray];
		for (int i = 0; i < sizeOfArray; i++) {
			arr[i] = input.nextInt();
		}

		System.out.print("Original Array Is : ");
		for (int element : arr) {
			System.out.print(element + " ");
		}

		System.out.println(); // Add new Line Spacing...
		System.out.println(); // Add new Line Spacing...
		
		int largElem = 0;
		for(int element : arr) {
			if(element > largElem) {
				largElem = element;
			}
		}
		System.out.print("Large Element in a given Array is : "+largElem);
	}
}


// Output : 


// Enter Size of An Arrray : 5
// 10
// 2
// 2
// 3
// 10
// Original Array Is : 10 2 2 3 10 

// Large Element in a given Array is : 10



