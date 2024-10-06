
//Write a program to check whether a number is divisible by 5 and 11 or not

import java.util.Scanner;

public class Task_6 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Number Here...");
		int num = input.nextInt();
		
		if(num % 5 == 0 && num % 11 == 0) {
			System.out.println(num +" Is Divisible By 5 and 11.");
		} else {
			System.out.println(num +" Is Not Divisible By 5 and 11.");
		}

	}

}

// Output :


// Enter Number Here...
// 55
// 55 Is Divisible By 5 and 11.


