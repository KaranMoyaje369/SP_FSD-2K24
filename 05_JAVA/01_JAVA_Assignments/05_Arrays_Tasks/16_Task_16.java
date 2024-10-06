
//Write a program to Print Unique Elements in Array

import java.util.Scanner;

public class Task_16 {

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
		
		System.out.println(); // adding new line for spacing...
		System.out.println(); // adding new line for spacing...
			
		System.out.print("Unique Value in a given Array Is : ");
		for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;

            
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                System.out.print(arr[i] + " ");
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
// 3
// 5
// 3
// 6
// 3
// 2
// Original Array Is : 1 2 3 4 3 5 3 6 3 2 

// Unique Value in a given Array Is : 1 2 3 4 5 6 



