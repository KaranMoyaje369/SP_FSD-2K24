//write a java program sort the elements of an array in ascending order

import java.util.Arrays;
import java.util.Scanner;

public class Task_19 {

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
		
		Arrays.sort(arr);
		System.out.print("Sorting Array in Ascending : ");
		for(int element : arr) {
			System.out.print(element+" ");
		}
		

	}

}


// Output :


// Enter Size of an Array : 5
// 10
// 234
// 4
// 2
// 5
// Original Array Is : 10 234 4 2 5 

// Sorting Array in Ascending : 2 4 5 10 234 



