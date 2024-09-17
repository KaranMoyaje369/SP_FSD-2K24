//Write a program to calculate the average value of array elements

import java.util.Scanner;

public class Task_21 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of an Array : ");
		int sizeOfArray = sc.nextInt();
		
		int[] arr = new int[sizeOfArray];
		for(int i = 0; i < sizeOfArray; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sumOfArray=0;
		System.out.print("Original Array Is : ");
		for(int element : arr) {
			System.out.print(element+" ");
			sumOfArray += element;
		}
		
		System.out.println();  // adding new line for spacing...
		System.out.println();  // adding new line for spacing...
		
		int totalAvg = sumOfArray / sizeOfArray;
		System.out.print("Sum Of All Elements present in given Array Is : "+sumOfArray);
		System.out.println();  // adding new line for spacing...
		
		System.out.print("Size Of Array Is : "+sizeOfArray);
		System.out.println();  // adding new line for spacing...
		
		System.out.print("Average Of All Elements present in given Array Is : "+totalAvg);

	}

}

// Output : 

// Enter Size of an Array : 5
// 10
// 20
// 30
// 40
// 50
// Original Array Is : 10 20 30 40 50 

// Sum Of All Elements present in given Array Is : 150
// Size Of Array Is : 5
// Average Of All Elements present in given Array Is : 30






