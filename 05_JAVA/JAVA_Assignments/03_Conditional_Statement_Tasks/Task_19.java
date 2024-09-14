/*
 * Write a program to input electricity unit charges and calculate total electricity bill according to the given condition:

For first 50 units Rs. 0.50/unit
For next 150 units Rs. 0.75/unit
For next 250 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill
 * */

import java.util.Scanner;

public class Task_19 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Electricity Units : ");
		int voltage = input.nextInt();
		
		float amount = 0, surcharge, totalBillAmt;
		
		if( voltage <= 50) {
			amount = voltage * 0.50f;
		} else if(voltage <= 150) {
			amount = voltage * 0.75f;
		} else if(voltage <=250) {
			amount = voltage * 1.20f;
		} else {
			amount = voltage * 1.50f;
		}
		
		surcharge = amount * 0.20f;
		totalBillAmt = amount + surcharge;
		
		System.out.println("Total Bill Amount : " +totalBillAmt);
	}

}


// Output :

// Enter Electricity Units : 
// 1000
// Total Bill Amount : 1800.0


