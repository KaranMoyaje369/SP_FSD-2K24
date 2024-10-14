package Exception_Handling_Tasks;

//Exercise 4: Use Custom Unchecked Exception

//Write a Java program that demonstrates the use of a custom unchecked exception by creating a custom exception class called InvalidInputException for input validation.

class InvalidInputException extends RuntimeException {
	public InvalidInputException(String message) {
		super(message);
	}
}

public class Exercise_16 {

	public static void main(String[] args) {
		String username = "user123";
		if (username.length() < 6) {
			throw new InvalidInputException("Username must be at least 6 characters long.");
		}
		System.out.println("Username: " + username);
	}
}
