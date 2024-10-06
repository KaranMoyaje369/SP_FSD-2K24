//Write a program to convert all the characters in a string to Lowercase

import java.util.Scanner;

public class Task_16 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		
		String str = sc.nextLine();
		
		System.out.println("Converting to all letters in string to lowercase...");
		System.out.println("\n Original String : "+str);
		System.out.println("\n Lowercase String : "+(str.toLowerCase()));

	}

}


// Output : 


// Enter String : 
// Hello World WELCOME To Java
// Converting to all letters in string to lowercase...

// Original String : Hello World WELCOME To Java

// Lowercase String : hello world welcome to java



