package Exception_Handling_Tasks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Exercise 9: Checked and Unchecked Exceptions

//Write a Java program that demonstrates both checked and unchecked exceptions. Handle these exceptions using appropriate try-catch blocks.

public class Exercise_9 {

	public static void main(String[] args) throws IOException {

		try {

			FileInputStream fileInputStream = new FileInputStream("file.txt");
			int data = fileInputStream.read();
			System.out.println("Read data : " + data);

			int numerator = 5;
			int denominator = 0;
			int result = numerator / denominator;
			System.out.println("The result is : " + result);
		}

		catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException caught : " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("ArrithmeticException caught : " + e.getMessage());
		}
	}
}
