
//write a Java program to find the duplicate characters in a string

package Wipro_Coding_Que;

public class Task_3 {

	public static void findDuplicateCharacters(String str) {
		str = str.toLowerCase();

		boolean[] isDuplicate = new boolean[256];

		System.out.println("Given String : "+str);
		System.out.println("\nDuplicate characters in the string:");
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (isDuplicate[c]) {
				continue;
			}

			if (str.indexOf(c, i + 1) != -1 && c != ' ') {
				isDuplicate[c] = true;
				System.out.print(c + " ");
			}
		}
	}

	public static void main(String[] args) {
		String inputString = "Programming in Java";
		findDuplicateCharacters(inputString);
	}
}

// Output :

// Given String : programming in java

// Duplicate characters in the string:
// r g a m i n 


