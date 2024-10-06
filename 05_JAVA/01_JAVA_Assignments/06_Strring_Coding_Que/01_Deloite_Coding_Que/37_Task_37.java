
//Write a program to Swap Two Strings without Third String Variable

public class Task_37 {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";

		System.out.println("Before Swap:");
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);

		str1 = str1 + str2;

		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());

		System.out.println("\nAfter Swap:");
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
	}
}

// Output :

// Before Swap:
// str1: Hello
// str2: World

// After Swap:
// str1: World
// str2: Hello


