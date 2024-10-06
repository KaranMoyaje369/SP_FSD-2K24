
//WAP to find the first repeated and non-repeated charecter in the given string

package Wipro_Coding_Que;

import java.util.Scanner;

public class Task_12 {

	public static void findCharacters(String str) {
		int[] charCount = new int[256];

		for (char ch : str.toCharArray()) {
			charCount[ch]++;
		}

		char firstRepeated = '\0';
		char firstNonRepeated = '\0';

		for (char ch : str.toCharArray()) {
			if (charCount[ch] == 1 && firstNonRepeated == '\0') {
				firstNonRepeated = ch;
			}
			if (charCount[ch] > 1 && firstRepeated == '\0') {
				firstRepeated = ch;
			}

			if (firstRepeated != '\0' && firstNonRepeated != '\0') {
				break;
			}
		}

		if (firstRepeated != '\0') {
			System.out.println("First Repeated Character: " + firstRepeated);
		} else {
			System.out.println("No Repeated Character Found.");
		}

		if (firstNonRepeated != '\0') {
			System.out.println("First Non-Repeated Character: " + firstNonRepeated);
		} else {
			System.out.println("No Non-Repeated Character Found.");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String inputString = scanner.nextLine();

		findCharacters(inputString);

		scanner.close();
	}

}

// Output :

// Enter a string: Karan
// First Repeated Character: a
// First Non-Repeated Character: K


