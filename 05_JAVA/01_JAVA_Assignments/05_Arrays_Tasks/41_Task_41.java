
//write a java program find Third Largest Number in an Array

import java.util.Arrays;

public class Task_41 {

	public static void main(String[] args) {


		int[] arr = {10,200,500,34,300,100,350,400,1000,2000,5000};
		
		Arrays.sort(arr);
		
		if (arr.length >= 3) {
            int thirdLargest = arr[arr.length - 3];
            System.out.println("The third largest number is: " + thirdLargest);
        } else {
            System.out.println("Array doesn't have enough elements to find the third largest.");
        }

	}

}

// Output :

// The third largest number is: 1000


