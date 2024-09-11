// Q-5 :

//Calculate the area of a rectangle.
//Write a Java program that calculates the area of a rectangle using the formula area = length * width. 
//Declare two double variables for length and width, and calculate the area.
package Variable_Tasks;


import java.util.Scanner;

public class Variable_Task_5 {
	
public static void main(String[] args) {
		
		System.out.println("Calculate The Area Of Rectangle...");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Length of the Rectangle : ");
		double length = input.nextDouble();
		
		System.out.print("Enter Width of the Rectangle : ");
		double width = input.nextDouble();
		
		double area = length * width;
		
		System.out.println("Area Of Rectangle Is : " +area);
	}

}

// Output : 

//Calculate The Area Of Rectangle...
//Enter Length of the Rectangle : 10.5
//Enter Width of the Rectangle : 5.5
//Area Of Rectangle Is : 57.75


