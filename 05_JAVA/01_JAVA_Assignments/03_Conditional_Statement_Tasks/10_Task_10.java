

//Write a program to check whether a year is leap year or not

import java.util.Scanner;

public class Task_10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Year Here....");
		
		int year = input.nextInt();
		
		if (year % 4 == 0) {
		    if (year % 100 == 0) {
		        if (year % 400 == 0) {
		            System.out.println(year + " is a leap year.");
		        } else {
		            System.out.println(year + " is not a leap year.");
		        }
		    } else {
		        System.out.println(year + " is a leap year.");
		    }
		} else {
		    System.out.println(year + " is not a leap year.");
		}


	}

}

// Output : 

// Enter Year Here....
// 2024
// 2024 is a leap year.


