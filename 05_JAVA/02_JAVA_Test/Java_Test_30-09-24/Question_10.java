package Java_Test;

import java.util.Arrays;

public class Question_10 {

	public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        
        int[] array2 = {6, 7, 8, 9, 10};
        
        int[] mergedArray = new int[array1.length + array2.length];
        
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }
        
        for (int i = 0; i < array2.length; i++) {
            mergedArray[array1.length + i] = array2[i];
        }
        
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
	}

}



// Output :


// Merged Array: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
