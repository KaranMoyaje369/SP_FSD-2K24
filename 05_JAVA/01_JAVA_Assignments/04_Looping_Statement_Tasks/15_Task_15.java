

//write a program to sum of its Digits


import java.util.Scanner;


public class Task_15 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);        
		System.out.print("Enter the Digits :");
		int num = input.nextInt(); 
		int a = num;
		int sum = 0;
		int rem = 0;        
		while(num>0)
		{
			rem = num % 10;
			sum = sum + rem;
			num /= 10;
		}
		System.out.println("Given Digits :" + a);
		System.out.println("Sum of Digits :" + sum);
	
		input.close();
	}
}

// Output :

// Enter the Digits :10
// Given Digits :10
// Sum of Digits :1



