
//write a Java Program to find Reverse of the string.

package Wipro_Coding_Que;

import java.util.Scanner;

public class Task_17 {

	public static String reverse(String str) {
		StringBuilder reversedString = new StringBuilder();

		for (int i = str.length() - 1; i >= 0; i--) {
			reversedString.append(str.charAt(i));
		}
		return reversedString.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String inputString = scanner.nextLine();

		String result = reverse(inputString);
		System.out.println("Reversed String: " + result);

		scanner.close();
	}
}

// Output :

// Enter a string: Welcome to sleeping world
// Reversed String: dlrow gnipeels ot emocleW


