package Exception_Handling_Tasks;

//Exercise 1: Create a Custom Checked Exception

//Write a Java program that defines a custom checked exception class called CustomCheckedException and throws it within the program.

class CustomCheckedException extends Exception {
	public CustomCheckedException(String message) {
		super(message);
	}
}

public class Exercise_13 {

	public static void main(String[] args) {
		try {
			throw new CustomCheckedException("This is a custom checked exception.");
		} catch (CustomCheckedException e) {
			System.out.println("CustomCheckedException caught: " + e.getMessage());
		}
	}
}


