
// write a java program to create to string values by using scanner concate it and arrange in alphabitical order.

package Wipro_Coding_Que;

import java.util.Arrays;
import java.util.Scanner;

public class Task_20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first string: ");
		String firstString = scanner.nextLine();

		System.out.print("Enter the second string: ");
		String secondString = scanner.nextLine();

		String concatenatedString = firstString + secondString;

		char[] charArray = concatenatedString.toCharArray();

		Arrays.sort(charArray);

		String sortedString = new String(charArray);

		System.out.println("Concatenated and Sorted String: " + sortedString);

		scanner.close();
	}
}

// Output :

// Enter the first string: Hello
// Enter the second string: World
// Concatenated and Sorted String: HWdellloor


