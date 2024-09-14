//Write a program to print all even numbers between 1 to 100

import java.util.Scanner;

public class Task_4 {

	public static void main(String[] args) {

		System.out.println("Enter Number from 1 to 100...");
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int num = input.nextInt();
		
		for(int i = 1; i<=num; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

}


// Output :


// Enter Number from 1 to 100...
// Enter Number : 
// 10
// 2
// 4
// 6
// 8
// 10


