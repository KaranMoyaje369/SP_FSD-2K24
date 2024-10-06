
//Write a program to search an element in an array

import java.util.Scanner;

public class Task_8 {

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
		
		System.out.print("Enter a Number which are you want to search in given Array : ");
		int input = sc.nextInt();
		
		boolean isFound = false;
		
		for(int i = 0; i < sizeOfArray; i++) {
			if(arr[i] == input) {
				isFound = true;
				System.out.println(input+" Is Found in Array...");
				break;
			} 
		}
		if(!isFound) {
			System.out.println(input+" Is Not Found in Array...");
		}
	}

}

// Output : 

// Enter Size of an Array : 3
// 1
// 2
// 3
// Original Array Is : 1 2 3 

// Enter a Number which are you want to search in given Array : 3
// 3 Is Found in Array...


