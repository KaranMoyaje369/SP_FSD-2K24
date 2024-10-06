
//Write a program to check whether a number is negative, positive or zero

import java.util.Scanner;

public class Task_13 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Number Here ...");
		int num = input.nextInt();
		
		if(num > 0) {
			System.out.println(num + " Is a Positive Number...");
		} else if (num < 0) {
			System.out.println(num + " Is a Negative Number...");
		} else {
			System.out.println("It is a Zero...");
		}
		
	}

}

// Output :

// Enter Number Here ...
// 10
// 10 Is a Positive Number...


