//Write a program to input month number and print month Name

import java.util.Scanner;

public class Task_12 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		System.out.println("Enter Months (1 - 12) Here...");
		System.out.println();
		
		System.out.print("Enter Month :  ");
		int month = input.nextInt();
		
		if(month == 1) {
			System.out.println("January.");
		} else if(month == 2) {
			System.out.println("February.");
		} else if(month == 3) {
			System.out.println("March.");
		} else if(month == 4) {
			System.out.println("April.");
		} else if(month == 5) {
			System.out.println("May.");
		} else if(month == 6) {
			System.out.println("June.");
		} else if(month == 7) {
			System.out.println("July.");
		} else if(month == 8) {
			System.out.println("August.");
		} else if(month == 9) {
			System.out.println("September.");
		} else if(month == 10) {
			System.out.println("Octomber.");
		} else if(month == 11) {
			System.out.println("November.");
		} else if(month == 12) {
			System.out.println("December.");
		} else {
			System.out.println("Enter Valid Month between (1 - 12)....");
		}

	}

}

// Output : 


// Enter Months (1 - 12) Here...
//
// Enter Month :  1
// January.


