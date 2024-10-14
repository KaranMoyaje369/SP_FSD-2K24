package Exception_Handling_Tasks;

// Exercise 5: Null Pointer Exception

// Write a Java program that attempts to access a method or property of an object that is null and handles the "NullPointerException."

public class Exercise_5 {

	public static void main(String[] args) {

		String str = null;

		try {
			int length = str.length();
			System.out.println("The length of string is : " + length);
		}

		catch (NullPointerException e) {
			System.out.println("Exception caught : " + e.getMessage());
			System.out.println("Object is Null");
		}
	}
}
