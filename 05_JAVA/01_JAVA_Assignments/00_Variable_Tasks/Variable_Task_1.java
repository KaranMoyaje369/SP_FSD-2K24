// Q-1 : 

// Calculate the area of a circle.
//Write a Java program that calculates the area of a
// circle using the formula area = π * radius * radius. 
// Define the radius as a double variable and assume π is 3.14159.
package Variable_Tasks;

import java.util.Scanner;

public class Variable_Task_1 {

public static void main(String[] args) {
		
		System.out.println("Calculate Area Of Circle : ");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Radius : ");
		int rad = input.nextInt();
		
		double areaOfCircle = 3.14159 * rad * rad;
		
		System.out.println("Area Of Circle : " +areaOfCircle);
	}
}
 

// Output : 

//Calculate Area Of Circle : 
//Enter Radius : 2
//Area Of Circle : 12.56636
