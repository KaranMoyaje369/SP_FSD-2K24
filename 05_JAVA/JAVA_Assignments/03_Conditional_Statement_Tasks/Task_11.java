//Write a program to find maximum between two numbers

import java.util.Scanner;

public class Task_11 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number 1 : ");
		int num1 = input.nextInt();
		
		System.out.print("Enter Number 2 : ");
		int num2 = input.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1+ " is grater than " +num2);
		} else if(num2 > num1) {
			System.out.println(num2+ " is grater than " +num1);
		} else {
			System.out.println("Both Numbers Are Equal.");
		}
	}

}

// Output : 

// Enter Number 1 : 500
// Enter Number 2 : 100
// 500 is grater than 100


