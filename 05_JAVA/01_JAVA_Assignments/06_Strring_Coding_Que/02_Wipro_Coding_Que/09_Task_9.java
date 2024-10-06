
//write a java program to reverse each word of a given string

package Wipro_Coding_Que;

public class Task_9 {

	public static String reverseEachWord(String str) {
		String[] words = str.split(" ");
		StringBuilder reversedString = new StringBuilder();

		for (String word : words) {
			StringBuilder reversedWord = new StringBuilder(word);
			reversedString.append(reversedWord.reverse().toString()).append(" ");
		}
		return reversedString.toString().trim();
	}

	public static void main(String[] args) {
		String inputString = "Java Programming is fun";

		String result = reverseEachWord(inputString);
		System.out.println("Original String: " + inputString);
		System.out.println("String with each word reversed: " + result);
	}
}

// Output :

// Original String: Java Programming is fun
// String with each word reversed: avaJ gnimmargorP si nuf


