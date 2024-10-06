//Write a program to create a new string repeating every character twice of a given string

import java.util.Scanner;

public class Task_22 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = scanner.nextLine();

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			result.append(currentChar).append(currentChar);
		}

		System.out.println("New string with every character repeated twice: " + result.toString());

	}

}


// Output :


// Enter a string:
// karan
// New string with every character repeated twice: kkaarraann



