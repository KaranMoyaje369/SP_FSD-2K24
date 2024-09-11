// Q-6 : 

//Calculate the total cost.
//Write a Java program that calculates the total cost of an item based on its price and quantity. 
//Declare a double variable for the price and an int variable for the quantity, then calculate and display the total cost.
package Variable_Tasks;


import java.util.Scanner;

public class Variable_Task_6 {

public static void main(String[] args) {
		
		System.out.println("Calculate Total cost...");
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter Product Quantity : ");
		int qty = input.nextInt();
		
		double price = 100;
		
		double total = price * qty;
		
		System.out.println("Total Cost is : " +total);
		
		
	}
	
}


// Output : 

//Calculate Total cost...
//Enter Product Quantity : 100
//Total Cost is : 10000.0


