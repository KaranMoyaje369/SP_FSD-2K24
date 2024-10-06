
//Write a program to print tables

import java.util.Scanner;

public class Task_20 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Number Here which number of table you want to print...");
		int n = input.nextInt();
		
		int res=0;
		
		for(int i =1; i<=10; i++) {
			
			res = n * i;
			
			System.out.println(n+" * "+ i+" : "+res);
		}
	}

}


// Output :


// Enter Number Here which number of table you want to print...
// 2
// 2 * 1 : 2
// 2 * 2 : 4
// 2 * 3 : 6
// 2 * 4 : 8
// 2 * 5 : 10
// 2 * 6 : 12
// 2 * 7 : 14
// 2 * 8 : 16
// 2 * 9 : 18
// 2 * 10 : 20


