
//Write a program to input all sides of a triangle and check whether triangle is valid or not

import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter Side 1 :");
      int side1 = input.nextInt();
      
      System.out.println("Enter Side 2 :");
      int side2 = input.nextInt();
      
      System.out.println("Enter Side 3 :");
      int side3 = input.nextInt();
      
      if( (side1 + side2) > side3 && (side2 + side3) > side1 && (side1 + side3) > side2) {       // using triangle inequality law
    	  System.out.println("Triangle is Valid...");
      } else {
    	  System.out.println("Triangle is not Valid...");
      }
      		
	}

}


// Output :


// Enter Side 1 :
// 40
// Enter Side 2 :
// 40
// Enter Side 3 :
// 30
// Triangle is Valid...


