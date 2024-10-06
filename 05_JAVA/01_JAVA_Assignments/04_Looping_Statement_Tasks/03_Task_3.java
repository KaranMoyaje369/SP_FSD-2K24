
//write a program to reverse the given Digits

import java.util.Scanner;

public class Task_3 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);        
		System.out.print("Enter the Digits :");
		int num = input.nextInt(); 
		int originalString = num;
		int reverseString = 0;
		int remainder = 0;        
		while(num>0)
		{
			remainder = num % 10;
			reverseString = reverseString * 10 + remainder;
			num /= 10;
		}
		System.out.println("Given Digits :" + originalString);
		System.out.println("Reverse Digits :" + reverseString);
		
		input.close();
	}

	}

// Output : 

// Enter the Digits :1234
// Given Digits :1234
// Reverse Digits :4321




