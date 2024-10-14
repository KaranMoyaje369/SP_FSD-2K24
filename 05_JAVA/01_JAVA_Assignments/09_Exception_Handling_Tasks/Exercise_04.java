package Exception_Handling_Tasks;

// Exercise 4: Custom Exception

// Write a Java program that defines a custom exception class and throws that exception within the program.

class CustomException extends Exception {

	public CustomException(String msg) {
		super(msg);
	}
}

public class Exercise_4 {

	public static void main(String[] args) {
		try {
			throw new CustomException("This is a custom exception");
		} catch (CustomException e) {

			System.out.println("Exception caught : " + e.getMessage());
		}
	}

}
