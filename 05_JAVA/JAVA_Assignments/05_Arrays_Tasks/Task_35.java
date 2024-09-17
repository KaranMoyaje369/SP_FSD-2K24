//write a java program find smallest number

import java.util.Scanner;

public class Task_35 {

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
		
		int minNum = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < minNum) {
				minNum = arr[i];
			}
		}
		
		System.out.print("Smallest Number in a given Array Is : "+minNum);
		
	}

}

// Output :


// Enter Size of An Array : 5
// 34
// 45
// 56
// 445
// 76
// Original Array Is : 34 45 56 445 76 

// Smallest Number in a given Array Is : 34



