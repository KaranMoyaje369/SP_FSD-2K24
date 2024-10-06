
//write a java program remove all the white spaces from a string

package Wipro_Coding_Que;

import java.util.Scanner;

public class Task_14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String inputString = scanner.nextLine();

		String noWhitespaceString = inputString.replaceAll("\\s+", "");

		System.out.println("String after removing all whitespace: \"" + noWhitespaceString + "\"");

		scanner.close();
	}
}

// Output :

// Enter a string: Karan Moyaje
// String after removing all whitespace: "KaranMoyaje"



