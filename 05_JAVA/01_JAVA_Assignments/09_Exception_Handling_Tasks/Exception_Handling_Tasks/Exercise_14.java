package Exception_Handling_Tasks;

//Exercise 2: Create a Custom Unchecked Exception

//Write a Java program that defines a custom unchecked exception class called CustomUncheckedException (extending RuntimeException) and throws it within the program.

class CustomUncheckedException extends RuntimeException {
	public CustomUncheckedException(String message) {
		super(message);
	}
}

public class Exercise_14 {

	public static void main(String[] args) {
		try {
			throw new CustomUncheckedException("This is a custom unchecked exception.");
		} catch (CustomUncheckedException e) {
			System.out.println("CustomUncheckedException caught: " + e.getMessage());
		}
	}
}
