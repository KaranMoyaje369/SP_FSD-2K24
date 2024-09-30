package Java_Test;

public class Question_06 {

	public static void main(String[] args) {

		int[] array = { 12, 3, 45, 6, 12, 18, 45, 7, 8, 10 };

		System.out.println("Unique elements in the array:");

		for (int i = 0; i < array.length; i++) {
			boolean isUnique = true;

			for (int j = 0; j < array.length; j++) {
				if (i != j && array[i] == array[j]) {
					isUnique = false; 
					break;
				}
			}

			if (isUnique) {
				System.out.print(array[i] + " ");
			}
		}
	}

}

// output :

// Unique elements in the array:
// 3 6 18 7 8 10 
