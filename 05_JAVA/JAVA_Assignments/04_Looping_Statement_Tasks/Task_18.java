//Write a program to find sum of all natural numbers between 1 to n

import java.util.Scanner;

public class Task_18 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Number Here...");
		int n = input.nextInt();
		
		int sum  = 0;
		
		for(int i = 1; i<=n; i++) {
			sum = sum + i;
		}
		
		System.out.println("Sum of All Natural Number Between 1 to "+n+" Is :"+sum);

	}

}

// Output :

// Enter Number Here...
// 5
// Sum of All Natural Number Between 1 to 5 Is :15



