//Write a program to find maximum between three numbers

import java.util.Scanner;

public class Task_16 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Number 1 : ");
		int num1 = input.nextInt();
		
		System.out.println("Enter Number 2 : ");
		int num2 = input.nextInt();
		
		System.out.println("Enter Number 3 : ");
		int num3 = input.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println(num1 + " Is Greater than " +num2 +" and " +num3);
		} else if(num2 > num3) {
			System.out.println(num2 + " Is Greater than " +num1 +" and " +num3);
		} else if( num1 == num2 && num2 == num3 && num1 == num3) {
			System.out.println("All Numbers are Equals...");
		} else {
			System.out.println(num3 +" Is Greater than " +num1 +" and " +num2);
		}
	}

}


// Output :


// Enter Number 1 : 
// 30
// Enter Number 2 : 
// 20
// Enter Number 3 : 
// 10
// 30 Is Greater than 20 and 10



