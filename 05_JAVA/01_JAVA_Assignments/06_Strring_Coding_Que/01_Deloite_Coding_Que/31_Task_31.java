
//Write a program to test if a given string contains the specified sequence of char values

public class Task_31 {

	public static boolean containsCharSequence(String str, String sequence) {
		return str.contains(sequence);
	}

	public static void main(String[] args) {
		String inputString = "Learning Java is interesting";
		String charSequence = "Java";

		boolean isFound = containsCharSequence(inputString, charSequence);

		if (isFound) {
			System.out.println("The sequence '" + charSequence + "' is found in the string.");
		} else {
			System.out.println("The sequence '" + charSequence + "' is not found in the string.");
		}
	}
}

// Output :

// The sequence 'Java' is found in the string.


