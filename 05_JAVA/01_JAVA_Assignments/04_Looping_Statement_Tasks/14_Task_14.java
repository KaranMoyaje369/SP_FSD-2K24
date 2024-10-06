
//Write a program to print reverse tables

import java.util.Scanner;

public class Task_14 {

	public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter Number which Table you want to print...");
      int tableNum = input.nextInt();
      
      for(int i = 10; i>=1; i--) {
    	  System.out.println(tableNum*i);
      }

	}

}

// Output :

// Enter Number which Table you want to print...
// 2
// 20
// 18
// 16
// 14
// 12
// 10
// 8
// 6
// 4
// 2



