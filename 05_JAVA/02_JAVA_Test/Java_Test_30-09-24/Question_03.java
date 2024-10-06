package Java_Test;

public class Question_03 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// Original Array
		System.out.println("Odd Number in a given Array : ");
		for (int i : arr) {
			if (i % 2 != 0)
				System.out.print(i + " ");
		}
	}
}


// Output :

// Odd Number in a given Array : 
// 1 3 5 7 9 