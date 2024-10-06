

//Write a program to count total number of notes in given amount

import java.util.Scanner;

public class Task_5 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Amount Here..");
		
		int amount = input.nextInt();
		
		int n500, n200, n100, n50, n20, n10, n5, n2, n1;
		
		 n500 = n200 = n100 = n50 = n20 = n10 = n5 = n2 = n1 = 0;
		
		if(amount >= 500) {
			n500 = amount / 500;
			amount -= n500 * 500;
		}
		if(amount >= 200) {
			n200 = amount / 200;
			amount -= n200 * 200;
		}
		if(amount >= 100) {
			n100 = amount / 100;
			amount -= n100 * 100;
		}
		if(amount >= 50) {
			n50 = amount / 50;
			amount -= n50 * 50;
		}
		if(amount >= 20) {
			n20 = amount / 20;
			amount -= n20 * 20;
		}
		if(amount >= 10) {
			n10 = amount / 10;
			amount -= n10 * 10;
		}
		if(amount >= 5) {
			n5 = amount / 5;
			amount -= n5 * 5;
		}
		if(amount >= 2) {
			n2 = amount / 2;
			amount -= n2 * 2;
		}
		if(amount >= 1) {
			n1 = amount / 1;
			amount -= n1 * 1;
		} 
		
		
		System.out.println("Total  |  Number of Notes");
		System.out.println("500    = "  + n500);
		System.out.println("200    = "  + n200);
		System.out.println("100    = "  + n100);
		System.out.println("50     = "  + n50);
		System.out.println("20     = "  + n20);
		System.out.println("10     = "  + n10);
		System.out.println("5      = "  + n5);
		System.out.println("2      = "  + n2);
		System.out.println("1      = "  + n1);
		
		
		
		
	}

}

// Output : 

//Enter Amount Here..
//800
//Total  |  Number of Notes
//500    = 1
//200    = 1
//100    = 1
//50     = 0
//20     = 0
//10     = 0
//5      = 0
//2      = 0
//1      = 0

