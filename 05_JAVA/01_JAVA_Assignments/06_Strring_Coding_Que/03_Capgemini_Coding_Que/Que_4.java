
// Q4. Write a program to remove consecutive vowels from a string.
// Input Format
// Input to get a string.
// Output Format
// the output displays the string after removing consecutive vowels from it.


package Capgemini_Coding_Que;

import java.util.Scanner;

public class Que_4 {

	public static String removeConsecutiveVowels(String s) {

		StringBuilder result = new StringBuilder();

		String vowels = "aeiouAEIOU";

		result.append(s.charAt(0));

		for (int i = 1; i < s.length(); i++) {
			char currentChar = s.charAt(i);
			char prevChar = s.charAt(i - 1);

			if (vowels.indexOf(currentChar) != -1 && vowels.indexOf(prevChar) != -1) {
				continue;
			}

			result.append(currentChar);
		}

		return result.toString();
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Types something here");
		String s = scanner.nextLine();

		String result = removeConsecutiveVowels(s);
		System.out.println(result);

		scanner.close();
	}
}

// Output : 

// Types something here
// kaaraan
// karan
