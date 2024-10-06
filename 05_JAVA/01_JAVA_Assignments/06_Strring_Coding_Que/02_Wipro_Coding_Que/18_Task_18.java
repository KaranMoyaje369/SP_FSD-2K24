
// write a java program How to Reverse a String in Java Word by Word

package Wipro_Coding_Que;

import java.util.Scanner;

public class Task_18 {

	public static String reverseWords(String str) {
		String[] words = str.split("\\s+");
		StringBuilder reversedString = new StringBuilder();

		for (int i = words.length - 1; i >= 0; i--) {
			reversedString.append(words[i]);
			if (i != 0) {
				reversedString.append(" ");
			}
		}

		return reversedString.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String inputString = scanner.nextLine();

		String result = reverseWords(inputString);

		System.out.println("Reversed String Word by Word: " + result);

		scanner.close();
	}
}


// Output :

// Enter a string: karan Moyaje
// Reversed String Word by Word: Moyaje karan


