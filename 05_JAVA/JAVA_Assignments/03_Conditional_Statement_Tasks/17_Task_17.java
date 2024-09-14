/*
 * while purchasing certain items, a discount of 10% is offered if the 
 * quantity 
 * purchased is more than 100. If quantity and price per item are 
 * input through 
 * the keyboard, write a program to calculate the total expenses
 * */

import java.util.Scanner;

public class Task_17 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Item's Quantity : ");
	    int qty = input.nextInt();
	    
	    System.out.println("Enter Price Per Item : ");
	    int price = input.nextInt();
	    
	    float exp;
	    
	    if(qty > 100) {
	    	exp = qty * price;
	    	exp = exp - (exp * 0.1f);
	    } else {
	    	exp = qty * price;
	    }
	    
	    System.out.println("Total Expense Is : " +exp);

	}

}


// Output :


// Enter Item's Quantity : 
// 200
// Enter Price Per Item : 
// 10
// Total Expense Is : 1800.0




