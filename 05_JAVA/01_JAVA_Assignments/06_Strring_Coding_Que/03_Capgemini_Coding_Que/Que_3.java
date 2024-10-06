
// Q3. Write a program to check whether the string is lexicographically equal to another string
// Input Format
// Input to get two strings.
// Output Format
// Display the output as shown in the sample output.
// Note :
// if (string1 > string2) it returns a positive value(difference between the characters)
// if both the strings are equal lexicographically i.e.(string1 == string2) it returns 0.
// if (string1 < string2) it returns a negative value((difference between the characters)


package Capgemini_Coding_Que;

import java.util.Scanner;

public class  Que_3 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter String 1 : ");
		String string1 = scanner.nextLine();
		System.out.print("Enter String 1 : ");
		String string2 = scanner.nextLine();

		// Compare the two strings
		int result = string1.compareTo(string2);

		
		if (result > 0) {
			System.out.println("String 1 is greater than String 2");
		} else if (result < 0) {
			System.out.println("String 1 is less than String 2");
		} else {
			System.out.println("String 1 is equal to String 2");
		}

		scanner.close();
	}
}



// Output :
 
// Enter String 1 : orange
// Enter String 1 : orange
// String 1 is equal to String 2


