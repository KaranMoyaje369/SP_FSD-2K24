
//write a java program to modify the string in the following pattern
//in:this is hello world   out: THIS si HELLO dlrow

package Wipro_Coding_Que;

public class Task_10 {

	public static String modifyString(String str) {
		String[] words = str.split(" ");
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < words.length; i++) {
			if (i % 2 == 0) {
				result.append(words[i].toUpperCase());
			} else {
				StringBuilder reversedWord = new StringBuilder(words[i]);
				result.append(reversedWord.reverse().toString());
			}

			if (i < words.length - 1) {
				result.append(" ");
			}
		}

		return result.toString();
	}

	public static void main(String[] args) {
		String inputString = "this is hello world";

		String modifiedString = modifyString(inputString);
		System.out.println("Original String: " + inputString);
		System.out.println("Modified String: " + modifiedString);
	}
}

// Output :

// Original String: this is hello world
// Modified String: THIS si HELLO dlrow


