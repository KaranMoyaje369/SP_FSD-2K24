//Write a program to Reverse Each Word of a String

public class Task_25 {

	public static String reverseEachWord(String str) {

		String[] wordsArray = str.split(" ");
		StringBuilder result = new StringBuilder();

		for (String word : wordsArray) {
			String reversedWord = new StringBuilder(word).reverse().toString();
			result.append(reversedWord).append(" ");
		}
		return result.toString().trim();
	}

	public static void main(String[] args) {
		String inputString = "Hello World";
		System.out.println("Input String : "+inputString);
		String result = reverseEachWord(inputString);
		System.out.print("Result Is : "+result);
	}
}

// Output :

// Input String : Hello World
// Result Is : olleH dlroW


