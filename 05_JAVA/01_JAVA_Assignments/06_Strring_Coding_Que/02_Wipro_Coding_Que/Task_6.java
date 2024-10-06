
//write a java program to count the total number of occurences of a
//given character in a string

package Wipro_Coding_Que;

public class Task_6 {
	public static int countOccurrences(String str, char ch) {
		System.out.println("Given String : "+str);
		int count = 0;
		str = str.toLowerCase();
		ch = Character.toLowerCase(ch);

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		String inputString = "Java Programming Language";
		char characterToSearch = 'a';

		int occurrences = countOccurrences(inputString, characterToSearch);

		System.out.println("The character '" + characterToSearch + "' occurs " + occurrences + " times in the string.");
	}
}

// Output :

// Given String : Java Programming Language
// The character 'a' occurs 5 times in the string.


