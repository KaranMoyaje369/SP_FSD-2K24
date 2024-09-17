//Write a program in to array size to be user input print it

import java.util.Scanner;

public class Task_10 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of an Array : ");
		int sizeOfArray = sc.nextInt();

		System.out.println("Enter " +sizeOfArray+" Elements : ");
		int[] arr = new int[sizeOfArray];
		for (int i = 0; i < sizeOfArray; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Array Elements Are : ");
		for (int element : arr) {
			System.out.print(element + " ");
		}
	}

}

// Output : 


// Enter Size of an Array : 4
// Enter 4 Elements : 
// 1
// 2
// 3
// 4
// Array Elements Are : 1 2 3 4 



