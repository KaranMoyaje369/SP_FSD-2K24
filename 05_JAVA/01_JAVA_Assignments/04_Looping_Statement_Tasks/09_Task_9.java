
//Write a program to print all odd number between 1 to 100

import java.util.Scanner;

public class Task_9 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Number in Range 1 to 100 ....");
		int num = input.nextInt();
		
		for(int i = 1; i <= num; i = i+2) {
			System.out.print(i +" ");
		}

	}

}


// Output : 


// Enter Number in Range 1 to 100 ....
// 100
// 1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49 51 53 55 57 59 61 63 65 67 69 71 73 75 77 79 81 83 85 87 89 91 93 95 97 99


