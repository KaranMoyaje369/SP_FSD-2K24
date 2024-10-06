
//write a Java Program to replace lower-case characters with upper-case and vice-versa

package Wipro_Coding_Que;

import java.util.Scanner;

public class Task_16 {

	public static String swapCase(String str) {
		StringBuilder swappedString = new StringBuilder();

		for (char ch : str.toCharArray()) {
			if (Character.isLowerCase(ch)) {
				swappedString.append(Character.toUpperCase(ch));
			} else if (Character.isUpperCase(ch)) {
				swappedString.append(Character.toLowerCase(ch));
			} else {
				swappedString.append(ch);
			}
		}

		return swappedString.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String inputString = scanner.nextLine();

		String result = swapCase(inputString);

		System.out.println("String after swapping cases: " + result);

		scanner.close();
	}
}

// Output :

// Enter a string: Welcome to India
// String after swapping cases: wELCOME TO iNDIA


