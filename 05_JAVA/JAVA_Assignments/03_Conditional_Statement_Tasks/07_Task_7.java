
//Write a program to check whether a number is even or odd

import java.util.Scanner;

public class Task_7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Number Here...");
		int num = input.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + " Is a Even Number.");
		} else {
			System.out.println(num + " Is a Odd Number.");
		}

	}

}

// Output : 


// Enter Number Here...
// 2
// 2 Is a Even Number.


