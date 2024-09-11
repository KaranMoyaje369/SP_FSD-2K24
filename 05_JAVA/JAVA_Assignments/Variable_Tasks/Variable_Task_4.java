// Q-4 :

//Concatenate two strings.
//Write a Java program that concatenates two strings and displays the result. 
//Declare two String variables and assign values to them.
package Variable_Tasks;

import java.util.Scanner;

public class Variable_Task_4 {
	
public static void main(String[] args) {
		
		System.out.println("Concatenate Two strings ....");
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter First Name : ");
		String fname = input.next();
		
		System.out.print("Enter Last Name : ");
		String lname = input.next();
		
		String res = fname + " " + lname;
		
		System.out.println("Full Name is : " +res);
		
		
	}


}

// Output :

//Concatenate Two strings ....
//Enter First Name : Karan
//Enter Last Name : Moyaje
//Full Name is : Karan Moyaje

