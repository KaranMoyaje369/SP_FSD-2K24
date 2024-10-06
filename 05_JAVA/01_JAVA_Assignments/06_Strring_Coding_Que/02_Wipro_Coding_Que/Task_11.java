
//write a java program to find the count of uppercase and lowercase digits and special chrs

package Wipro_Coding_Que;

public class Task_11 {

	public static void countCharacters(String str) {
		System.out.println("Given String : " + str + "\n");
		int uppercaseCount = 0;
		int lowercaseCount = 0;
		int digitCount = 0;
		int specialCharCount = 0;

		for (char ch : str.toCharArray()) {
			if (Character.isUpperCase(ch)) {
				uppercaseCount++;
			} else if (Character.isLowerCase(ch)) {
				lowercaseCount++;
			} else if (Character.isDigit(ch)) {
				digitCount++;
			} else if (!Character.isWhitespace(ch)) {
				specialCharCount++;
			}
		}

		System.out.println("Uppercase letters: " + uppercaseCount);
		System.out.println("Lowercase letters: " + lowercaseCount);
		System.out.println("Digits: " + digitCount);
		System.out.println("Special characters: " + specialCharCount);
	}

	public static void main(String[] args) {
		String inputString = "Hello World! 123 @Java#2024";

		countCharacters(inputString);
	}
}

// Output : 

// Given String : Hello World! 123 @Java#2024

// Uppercase letters: 3
// Lowercase letters: 11
// Digits: 7
// Special characters: 3
