
//write a java program to reverse a string

package Wipro_Coding_Que;

public class Task_7 {

	public static String reverse(String str) {
		StringBuilder reversedString = new StringBuilder(str);
		return reversedString.reverse().toString();
	}

	public static void main(String[] args) {
		String inputString = "Hello World";
		String reversed = reverse(inputString);
		System.out.println("Original String: " + inputString);
		System.out.println("Reversed String: " + reversed);
	}
}


// Output :

// Original String: Hello World
// Reversed String: dlroW olleH

