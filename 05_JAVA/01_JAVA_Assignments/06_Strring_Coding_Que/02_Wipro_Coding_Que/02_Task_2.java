
//write a java program to find count the total number of vowels and consonants in a string

package Wipro_Coding_Que;

public class Task_2 {

	public static void main(String[] args) {
		String inputString = "Hello World";
		System.out.println("Given String : " + inputString);
		inputString = inputString.toLowerCase();

		int vowelCount = 0;
		int consonantCount = 0;

		for (int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;
			} else if (ch >= 'a' && ch <= 'z') {
				consonantCount++;
			}
		}

		System.out.println("Total Vowels: " + vowelCount);
		System.out.println("Total Consonants: " + consonantCount);
	}
}

// Output : 


// Given String : Hello World
// Total Vowels: 3
// Total Consonants: 7


