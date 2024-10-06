

//write a program to Check Whether a Given Number is Prime or Not

import java.util.Scanner;

public class Task_11 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		boolean isPrime = true;

		if (number < 2) {
			isPrime = false;
		} else {

			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
		}

		if (isPrime) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}

	}
}

// Output :

// Enter a number: 3
// 3 is a prime number.
