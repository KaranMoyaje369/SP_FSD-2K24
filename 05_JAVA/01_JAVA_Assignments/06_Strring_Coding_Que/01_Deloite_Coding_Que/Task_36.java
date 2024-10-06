
//Write a program to Swap Two Strings

public class Task_36 {

	public static void main(String[] args) {

		String str1 = "Welcome";
		String str2 = "India";

		System.out.println("Before Swapping----");
		System.out.println("String 1 : " + str1);
		System.out.println("String 2 : " + str2);

		String swapString = str1;
		str1 = str2;
		str2 = swapString;

		System.out.println("After Swapping----");
		System.out.println("String 1 : " + str1);
		System.out.println("String 2 : " + str2);

	}

}

// Output :

// Before Swapping----
// String 1 : Welcome
// String 2 : India
// After Swapping----
// String 1 : India
// String 2 : Welcome
