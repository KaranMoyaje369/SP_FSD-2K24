
//write a java program find the longest repeating sequence in a string

package Wipro_Coding_Que;

public class Task_15 {

	public static String longestRepeatingSequence(String str) {
		int n = str.length();
		String longestSubstring = "";
		int maxLength = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int length = 0;
				while (j + length < n && str.charAt(i + length) == str.charAt(j + length)) {
					length++;
				}

				if (length > maxLength) {
					maxLength = length;
					longestSubstring = str.substring(i, i + length);
				}
			}
		}

		return longestSubstring;
	}

	public static void main(String[] args) {
		String inputString = "abcabcdeabc";

		String result = longestRepeatingSequence(inputString);

		if (!result.isEmpty()) {
			System.out.println("Longest repeating sequence: " + result);
		} else {
			System.out.println("No repeating sequence found.");
		}
	}
}

// Output :

// Longest repeating sequence: abc


