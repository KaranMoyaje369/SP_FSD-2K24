//Write a program to calculate profit or loss

import java.util.Scanner;

public class Task_14 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Cost Price : ");
		double costPrice = input.nextDouble();
		
		System.out.println("Enter Selling Price : ");
		double sellingPrice = input.nextDouble();
		
		double profit,loss;
		
		if(sellingPrice > costPrice) {
			profit = sellingPrice - costPrice;
			System.out.println("Total Profit Is : "+"+"+ +profit);
			
		} else if(sellingPrice < costPrice) {
			loss = costPrice - sellingPrice;
			System.out.println("Total Loss Is : "+"-"+ +loss);
		} else {
			System.out.println("No Profit No Loss...");
		}

	}

}

// Output :

// Enter Cost Price : 
// 100
// Enter Selling Price : 
// 500
// Total Profit Is : +400.0



