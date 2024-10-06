
//Write Java program to Print Fibonacci Series

import java.util.Scanner;

public class Task_5 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Length of Fibonacci Series : ");
		int length = input.nextInt();
		
		int num[] = new int[length];
		num[0] = 0;
		num[1] = 1;
		
		for(int i = 2; i < length ; i++) {
			num[i] = num[i-1] + num[i-2];
		}
		
		System.out.println("Fibonacci Series : ");
		
		for(int i = 0; i < length; i++) {
			System.out.println(num[i]);
		}
		

	}

}


// Output :


// Enter Length of Fibonacci Series : 
// 10
// Fibonacci Series : 
// 0
// 1
// 1
// 2
// 3
// 5
// 8
// 13
// 21
// 34




