
//Write a program to check whether a character is alphabet or not

import java.util.Scanner;

public class Task_3 {
	

	public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the values here....");
		
		char ch = input.next().charAt(0);
		
		if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
			System.out.println("It is a Alphabet...");
		} else {
			System.out.println("It is Not a Alphabet...");
		}


	}

}


//Output :

//Enter the values here....
//A
//It is a Alphabet...