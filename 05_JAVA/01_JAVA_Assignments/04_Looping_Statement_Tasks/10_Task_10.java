
//Write a program to find the value of one number raised to the power of another

import java.util.Scanner;

public class Task_10 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Value of Base : ");
		int base = input.nextInt();
		
		System.out.println("Enter the Value of Exponent : ");
	    int exponent = input.nextInt();
	    
	    int res = 1;
	    
	    for(int i = 1; i<=exponent; i++) {
	    	res *= base;
	    }
	    
	    System.out.println("Result : " +res);
	}

}


// Output :


// Enter the Value of Base : 
// 25
// Enter the Value of Exponent : 
// 2
// Result : 625


