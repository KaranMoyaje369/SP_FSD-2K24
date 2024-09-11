// Q-3 : 

//Calculate the average of three floating-point numbers.
//Write a Java program that calculates the average of three floating-point numbers 
//(e.g., 2.5, 3.0, 4.5). Declare three double variables and calculate their average.
package Variable_Tasks;

import java.util.Scanner;

public class Variable_Task_3 {

public static void main(String[] args) {
		
		System.out.println("Average Of Three Floating Numbers ....");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter First Number : ");
		double num1 = input.nextDouble();
		
		System.out.println("Enter Second Number : ");
		double num2 = input.nextDouble();
		
		System.out.println("Enter Third Number : ");
		double num3 = input.nextDouble();
		
		double avg = (num1 + num2 + num3) / 3;
		
		System.out.println("The Average of Three Numbers is : " +avg);
	}
}

// Output :

//Average Of Three Floating Numbers ....
//Enter First Number : 2.5
//Enter Second Number : 
//3.0
//Enter Third Number : 
//4.5
//The Average of Three Numbers is : 3.3333333333333335


