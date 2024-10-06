
//Write a program to find the factorial value of any number

import java.util.Scanner;

public class Task_6 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		
		int num = input.nextInt();
		int fact = 1;
		
		for(int i = 1; i <= num; i++)  {
			fact *= i;
		}
		
		System.out.println("Factorial Is : "+fact);

	}

}


// Output :

// Enter Number : 
// 5
// Factorial Is : 120


