

//Write a program to check whether the triangle is equilateral, isosceles or scalene triangle

import java.util.Scanner;

public class Task_4 {

	public static void main(String[] args) {

  
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Side 1 : ");
		int side1 = input.nextInt();
		
		System.out.println("Enter Side 2 : ");
		int side2 = input.nextInt();
		
		System.out.println("Enter Side 3 : ");
		int side3 = input.nextInt();
		
		if(side1 == side2 && side2 == side3 && side1 == side3) {
			System.out.println("It is a Equilateral Triangle..");
		} else if(side1 == side2 || side2 == side3 || side1 == side3) {
			System.out.println("It is a Isosceles Triangle..");
		} else {
			System.out.println("It is a Scalene Triangle..");
		}	
		
	}

}

// Output : 


// Enter Side 1 : 
// 10
// Enter Side 2 : 
// 10
// Enter Side 3 : 
// 10
// It is a Equilateral Triangle..

