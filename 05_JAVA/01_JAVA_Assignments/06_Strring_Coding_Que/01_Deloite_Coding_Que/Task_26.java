
//Write a program to reverse words in a given string

public class Task_26 {

	public static String reverseWordsInString(String str) {
		String[] wordsArray = str.split(" ");
		StringBuilder result = new StringBuilder();

		for (int i = wordsArray.length - 1; i >= 0; i--) {
			result.append(wordsArray[i]).append(" ");
		}
		return result.toString().trim();
	}

	public static void main(String[] args) {
		String inputString = "Hello World from Java";
		System.out.println("Input String : "+inputString);
		String result = reverseWordsInString(inputString);
		System.out.println("Result Is : "+result);
	}
}

// Output : 

// Input String : Hello World from Java
// Result Is : Java from World Hello


