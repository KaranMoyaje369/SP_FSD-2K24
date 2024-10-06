//Write a program to find the maximum occurring character in a string

import java.util.Scanner;

public class Task_17 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = scanner.nextLine();

		input = input.toLowerCase().replaceAll("\\s+", "");

		int[] charCount = new int[256]; 

		for (int i = 0; i < input.length(); i++) {
			charCount[input.charAt(i)]++;
		}

		char maxChar = ' ';
		int maxCount = 0;

		for (int i = 0; i < charCount.length; i++) {
			if (charCount[i] > maxCount) {
				maxCount = charCount[i];
				maxChar = (char) i; 
			}
		}

		System.out.println("Maximum occurring character: " + maxChar);
		System.out.println("Occurrence: " + maxCount);

	}

}


// Output :


// Enter a string:
// Hello Karan
// Maximum occurring character: a
// Occurrence: 2



