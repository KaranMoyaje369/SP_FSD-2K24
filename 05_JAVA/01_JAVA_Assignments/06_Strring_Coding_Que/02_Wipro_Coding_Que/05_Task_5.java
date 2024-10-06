
//write a java program to count the number of words in a string

package Wipro_Coding_Que;

public class Task_5 {

	public static int countWords(String str) {
		System.out.println("Given String : "+str);
		if (str == null || str.isEmpty()) {
			return 0;
		}

		String[] words = str.trim().split("\\s+");
		return words.length;
	}

	public static void main(String[] args) {
		String inputString = "  Java programming is fun  ";
		int wordCount = countWords(inputString);

		System.out.println("The total number of words in the string: " + wordCount);
	}
}


// Output : 

// Given String :   Java programming is fun  
// The total number of words in the string: 4

