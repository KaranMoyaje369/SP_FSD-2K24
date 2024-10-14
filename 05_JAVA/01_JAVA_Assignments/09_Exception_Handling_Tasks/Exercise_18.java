package Exception_Handling_Tasks;

//Custom Unchecked Exception with Parameters

//Write a Java program that defines a custom unchecked exception class called CustomUncheckedException with parameters and throws it within the program.

class CustomUncheckedException extends RuntimeException {
	private String errorDetails;

	public CustomUncheckedException(String message, String errorDetails) {
		super(message);
		this.errorDetails = errorDetails;
	}

	public String getErrorDetails() {
		return errorDetails;
	}
}

public class Exercise_18 {
	public static void main(String[] args) {
		try {
			throw new CustomUncheckedException("Custom unchecked exception", "Additional details: ABC");
		} catch (CustomUncheckedException e) {
			System.out.println("CustomUncheckedException caught: " + e.getMessage());
			System.out.println("Error details: " + e.getErrorDetails());
		}
	}
}
