package Exception_Handling_Tasks;

// Exercise 1: Divide by Zero Exception

// Write a Java program that divides two numbers and handles the "ArithmeticException" that occurs when dividing by zero.

public class Exercise_1 {

	public static void main(String[] args) {
		int numerator = 10;
		int divisor = 0;
		
		try {
			int res = numerator / divisor;
			System.out.println("Result : "+res);
		} catch (Exception e) {
			System.out.println("Exception : "+e.getMessage());
			System.out.println("Number Can't Be Divide By Zero.");
		}
	}
}
