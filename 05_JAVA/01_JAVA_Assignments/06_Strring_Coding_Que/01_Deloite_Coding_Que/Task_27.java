
//Write a program How to search a word inside a string?

public class Task_27 {

	public static boolean searchWordInString(String str, String word) {
		return str.contains(word);
	}

	public static void main(String[] args) {
		String inputString = "Java programming is fun";
		System.out.println("Given String : "+inputString);
		String wordToSearch = "programming";

		boolean isFound = searchWordInString(inputString, wordToSearch);

		if (isFound) {
			System.out.println("The word '" + wordToSearch + "' is found in the string.");
		} else {
			System.out.println("The word '" + wordToSearch + "' is not found in the string.");
		}
	}
}

// Output :

// Given String : Java programming is fun
// The word 'programming' is found in the string.


