

import java.util.Arrays;
public class Task_28 {

	    // Function to find the missing and repeating elements
	    void findEle(int a[], int s) {
	        
	        // Step 1: Calculate the sum of the first 's' natural numbers
	        long nsum = (s * (s + 1)) / 2;

	        // Step 2: Calculate the sum of squares of the first 's' natural numbers
	        long nsqrsum = (s * (s + 1) * (2 * s + 1)) / 6;

	        long sum = 0;
	        long sqrsum = 0;

	        // Step 3: Calculate the sum and sum of squares of the array elements
	        for (int i = 0; i < s; i++) {
	            sum += a[i];
	            sqrsum += ((long) a[i] * a[i]);
	        }

	        // Step 4: Calculate the differences between the expected and actual sums
	        long diffSum = sum - nsum; // a1 - a2
	        long diffSqSum = sqrsum - nsqrsum; // a1^2 - a2^2

	        // Step 5: Find the sum of a1 and a2 using the formula
	        long sumA1A2 = diffSqSum / diffSum; // a1 + a2

	        // Step 6: Calculate a1 and a2
	        long a1 = (sumA1A2 + diffSum) / 2;
	        long a2 = sumA1A2 - a1;

	        // Step 7: Output the result
	        System.out.println("For array: " + Arrays.toString(a));
	        System.out.println("Repeating element (a1): " + a1);
	        System.out.println("Missing element (a2): " + a2);
	    }

	    public static void main(String[] args) {
	        // Example with a different array input
	    	Task_28 obj = new Task_28();

	        int arr[] = {1, 2, 3, 4, 4}; // 4 is repeating, 5 is missing
	        int size = arr.length;

	        obj.findEle(arr, size);
	    }
	}


// Output : 


// For array: [1, 2, 3, 4, 4]
// Repeating element (a1): 4
// Missing element (a2): 5




