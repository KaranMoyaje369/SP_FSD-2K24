package Exception_Handling_Tasks;

//Exercise 12: Custom Checked Exception

//Write a Java program that defines a custom checked exception class and throws that exception within the program.

class CustomCheckedException extends Exception {

	public CustomCheckedException(String message) {
		super(message);
	}

}

public class Exercise_12 {

	public static void main(String[] args) {

		try {
			throw new CustomCheckedException("This is a custom checked exception");
		} catch (CustomCheckedException e) {
			System.out.println("CustomCheckedExcepytion caught : " + e.getMessage());
		}

	}
}
