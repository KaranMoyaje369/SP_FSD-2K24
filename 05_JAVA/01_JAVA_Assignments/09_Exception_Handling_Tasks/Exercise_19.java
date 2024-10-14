package Exception_Handling_Tasks;

//Custom Checked Exception for User Authentication

//Write a Java program that defines a custom checked exception class called AuthenticationException to handle authentication errors (e.g., invalid username or password).

class AuthenticationException extends Exception {
	public AuthenticationException(String message) {
		super(message);
	}
}

class AuthenticationService {
	public void authenticate(String username, String password) throws AuthenticationException {
		if (!isValidCredentials(username, password)) {
			throw new AuthenticationException("Authentication failed. Invalid username or password.");
		}
	}

	private boolean isValidCredentials(String username, String password) {
		// Add your authentication logic here
		// For demonstration, we assume valid credentials
		return true;
	}
}

public class Exercise_19 {
	public static void main(String[] args) {
		AuthenticationService authService = new AuthenticationService();
		try {
			authService.authenticate("user123", "password123");
			System.out.println("Authentication successful.");
		} catch (AuthenticationException e) {
			System.out.println("AuthenticationException caught: " + e.getMessage());
		}
	}
}
