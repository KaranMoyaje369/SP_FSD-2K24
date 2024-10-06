
//Write a program to get the character (Unicode code point) at the given index within the String

public class Task_39 {

	public static void main(String[] args) {
		String inputString = "Hello World!";
		int index = 4;

		int unicodeCodePoint = inputString.codePointAt(index);

		System.out.println("Character at index " + index + ": " + inputString.charAt(index));
		System.out.println("Unicode code point at index " + index + ": " + unicodeCodePoint);
	}
}


// Output :

// Character at index 4: o
// Unicode code point at index 4: 111

