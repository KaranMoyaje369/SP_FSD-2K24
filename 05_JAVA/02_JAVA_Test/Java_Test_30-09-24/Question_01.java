package Java_Test;
import java.util.Arrays;


public class Question_01 {

	public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        
        int[] copyArr = Arrays.copyOf(arr, arr.length);

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        System.out.println("\nCopied Array:");
        for (int num : copyArr) {
            System.out.print(num + " ");
        }

	}

}


// Output :


//  Original Array:
//  1 2 3 4 5 
//  Copied Array:
//  1 2 3 4 5 



