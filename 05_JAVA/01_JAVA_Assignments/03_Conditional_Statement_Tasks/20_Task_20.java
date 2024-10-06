

//Write a program to check whether a character is uppercase or lowercase alphabet

import java.util.Scanner;

public class Task_20 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Charecter Here : ");
		char ch = input.next().charAt(0);
		
		if(ch >= 'a' && ch <= 'z' ) {
			System.out.println(ch+ " Is a Lowercase Character.");
		} else if(ch >= 'A' && ch <= 'Z') {
			System.out.println(ch+ " Is a Uppercase Character.");
		} else {
			System.out.println("Enter Valid Character...");
		}

	}

}

// Output : 


// Enter Charecter Here : 
// A
// A Is a Uppercase Character.




