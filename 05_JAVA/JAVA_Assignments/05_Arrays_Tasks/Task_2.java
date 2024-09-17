
//Write a program to copy the elements of one array into another array
import java.util.Arrays;
import java.util.Scanner;
public class Task_2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Size Of Array : ");
		int sizeOfArray = input.nextInt();
		
		int[] arr = new int[sizeOfArray];
		
		System.out.println("Enter The Elements of the Array : ");
		for(int i = 0; i < sizeOfArray; i++) {
			arr[i] = input.nextInt();
		}
		
		System.out.println("Array Is :" );
		System.out.println(Arrays.toString(arr));
		System.out.println();  // add new line for spacing....
		
		int[] copyArray = new int[sizeOfArray];
		
		for(int i = 0; i < sizeOfArray; i++) {
			copyArray[i] = arr[i];
		}
		
		System.out.println("Copied Array Is : ");
//		for(int element : copyArray) {
//			System.out.print(element +" ");
		
		System.out.println(Arrays.toString(copyArray));
		}  
		
		
	}



// Output : 

// Enter The Elements of the Array : 
// 1
// 2
// 3
// 4
// Array Is :
// [1, 2, 3, 4]
//
// Copied Array Is : 
// [1, 2, 3, 4] 





