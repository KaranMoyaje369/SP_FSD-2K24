

//Write a program to input any character and check whether it is alphabet, digit or special character

import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the values here....");
		
		char ch = input.next().charAt(0);
		
		if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
			System.out.println("It is Alphabet...");
		} else if(ch>= '0' && ch <= '9') {
			System.out.println("It is a Digit...");
		} else {
			System.out.println("It is a Special  Character...");
		}

	}

}

// Output :

// Enter the values here....
// A
// It is Alphabet...
