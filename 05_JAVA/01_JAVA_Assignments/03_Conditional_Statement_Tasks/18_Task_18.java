//Write a program to input angles of a triangle and check whether triangle is valid or not

import java.util.Scanner;

public class Task_18 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Angle 1 : ");
		int angle1 = input.nextInt();
		
		System.out.println("Enter Angle 2 : ");
		int angle2 = input.nextInt();
		
		System.out.println("Enter Angle 3 : ");
		int angle3 = input.nextInt();
		
		int sumOfAngle = angle1 + angle2 + angle3;
		
		if(sumOfAngle == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0) {
			System.out.println("Triangle Is Valid.... ");
		} else {
			System.out.println("Triangle is Not Valid...");
		}
	}

}


// Output : 


// Enter Angle 1 : 
// 60
// Enter Angle 2 : 
// 60
// Enter Angle 3 : 
// 60
// Triangle Is Valid.... 


