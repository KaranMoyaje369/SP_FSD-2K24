//write a java program sort the elements of an array in ascending order

import java.util.Arrays;
import java.util.Scanner;

public class Task_25 {

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
		
		Arrays.sort(arr);
		System.out.print("Sorting Array in Ascending Order is : ");
		for(int element : arr) {
			System.out.print(element+" ");
		}


	}

}

// Output : 


// Enter Size of An Arrray : 5
// 10
// 34
// 35
// 32
// 57
// Original Array Is : 10 34 35 32 57 

// Sorting Array in Ascending Order is : 10 32 34 35 57 



