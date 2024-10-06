
//wriate a javaprogram to count the number of charecter in a string

package Wipro_Coding_Que;

import java.util.Scanner;

public class Task_13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String inputString = scanner.nextLine();
		
		int characterCount = inputString.length(); 

		System.out.println("The total number of characters in the string is: " + characterCount);

		scanner.close(); 
	}
}

// Output :

// Enter a string: karan
// The total number of characters in the string is: 5


