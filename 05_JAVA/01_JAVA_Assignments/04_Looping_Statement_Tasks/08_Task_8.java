//Write a program to print all natural numbers from 1 to n

import java.util.Scanner;

public class Task_8 {

	public static void main(String[] args) {


		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter The value of n :");
		int n = ip.nextInt();
		
		System.out.println("The Natural Number Upto " +n);
		for(int i=1; i<=n; i++) {
			System.out.println(i);
		}
	}

}


// Output :

// Enter The value of n :
// 10
// The Natural Number Upto 10
// 1
// 2
// 3
// 4 
// 5
// 6
// 7
// 8
// 9
// 10



