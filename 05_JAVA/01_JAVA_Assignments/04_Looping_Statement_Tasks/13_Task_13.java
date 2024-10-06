
//Write a program to print all natural numbers in reverse

import java.util.Scanner;

public class Task_13 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Starting Number : ");
		int startNum = input.nextInt();
		
		System.out.println("Enter Ending Number : ");
		int endNum = input.nextInt();
		
		while(startNum >= endNum) {
			System.out.print(startNum +" ");
			startNum--;
		}

	}

}

// Output :


// Enter Starting Number : 
// 10
// Enter Ending Number : 
// 1
// 10 9 8 7 6 5 4 3 2 1 


