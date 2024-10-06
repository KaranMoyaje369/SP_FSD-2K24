// Q-2 : 

//Calculate the sum of two integers.
//Write a Java program that calculates the sum of two integers. 
//Declare two integer variables and assign values to them.
package Variable_Tasks;

import java.util.Scanner;

public class Variable_Task_2 {
	
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Sum of Two Integer ....");
		
		System.out.print("Enter First Number : ");
		int num1 = input.nextInt();
		
		System.out.print("Enter Second Number : ");
		int num2 = input.nextInt();
		
		int sum = num1 + num2;
		
		System.out.println("Addition of Two Number is : " +sum);
		
	}  



}


// Output : 

//Sum of Two Integer ....
//Enter First Number : 5
//Enter Second Number : 10
//Addition of Two Number is : 15


