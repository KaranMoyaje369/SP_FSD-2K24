// Q-7 :

//Perform arithmetic operations.
//Write a Java program that performs various arithmetic operations
// (addition, subtraction, multiplication, division) on two numbers. 
// Declare two int variables and perform these operations.
package Variable_Tasks;


import java.util.Scanner;

public class Variable_Task_7 {
	
public static void main(String[] args) {
		
		System.out.println("Perform Arithmetic Operation....");
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter Number 1 : ");
		int num1 = input.nextInt();
		
		System.out.print("Enter Number 2 : ");
		int num2 = input.nextInt();
		
		int add = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		
		System.out.println("Addition Of Two Number is : " +add);
		System.out.println("Subtraction Of Two Number is : " +sub);
		System.out.println("Multiplication Of Two Number is : " +mul);
		System.out.println("Division Of Two Number is : " +div);
	}

}

// Output : 

//Perform Arithmetic Operation....
//Enter Number 1 : 10
//Enter Number 2 : 5
//Addition Of Two Number is : 15
//Subtraction Of Two Number is : 5
//Multiplication Of Two Number is : 50
//Division Of Two Number is : 2

