package Exception_Handling_Tasks;

//Exercise 8: Propagating Exceptions

//Write a Java program that propagates an exception up the call stack and handles it at a higher level in the program.

public class Exercise_8 {

	public static void devideByZero() {
		int numerator = 5;
		int denomenator = 0;
		int result = numerator / denomenator;
		System.out.println("The result is : " + result);
	}

	public static void main(String[] args) {

		try {
			devideByZero();
		} catch (ArithmeticException e) {
			System.out.println("Exception caught : " + e.getMessage());
		}

	}

}
