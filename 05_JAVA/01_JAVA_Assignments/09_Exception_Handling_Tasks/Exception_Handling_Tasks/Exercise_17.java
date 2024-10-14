package Exception_Handling_Tasks;

//Exercise 5: Custom Checked Exception with Parameters

//Write a Java program that defines a custom checked exception class called CustomCheckedException with additional parameters (such as error codes or details) and throws it within the program.

class CustomCheckedException extends Exception {

	private int errorCode;

	public CustomCheckedException(String message, int errorCode) {

		super(message);
		this.errorCode = errorCode;

	}

	public int geterrorCode() {
		return errorCode;
	}

}

public class Exercise_17 {

	public static void main(String[] args) {

		try {
			throw new CustomCheckedException("Custom Checked Exception With Code",404);
		} catch (CustomCheckedException e) {

			System.err.println("CustomCheckedException caught : " + e.getMessage());
			System.err.println("Error code : " + e.geterrorCode());
		}

	}

}