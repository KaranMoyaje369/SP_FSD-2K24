
//Write a program to find sum of all even numbers between 1 to n

import java.util.Scanner;

public class Task_17 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		System.out.println("Enter Value of n : ");
		int n = input.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i<=n; i++) {
			if(i % 2 == 0) {
				sum = sum + i;
			}
		}
		
		System.out.println("Sum of All Even Number Between 1 to " +n+ " Is : " +sum);

	}

}

// Output :

// Enter Value of n : 
// 5
// Sum of All Even Number Between 1 to 5 Is : 6


