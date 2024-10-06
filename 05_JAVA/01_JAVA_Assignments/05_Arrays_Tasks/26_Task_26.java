
//write a program given array find duplicate numbers



import java.util.Scanner;

public class Task_26 {

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
		
		System.out.print("Duplicate Elements in a given Array Is : ");
		for(int i = 0; i < sizeOfArray; i++) {
			for(int j = i + 1; j < sizeOfArray; j++) {
				if(arr[i] == arr[j]) {
					System.out.print(arr[i]+" ");
					break;
				}
			}
		}
	}

}

// Output :


// Enter Size of An Arrray : 5
// 1
// 2
// 3
// 2
// 1
// Original Array Is : 1 2 3 2 1 

// Duplicate Elements in a given Array Is : 1 2 



