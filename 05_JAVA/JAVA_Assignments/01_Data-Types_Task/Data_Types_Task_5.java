// Addition of Two Number
package Data_Types_Tasks;

import java.util.Scanner;

public class Data_Types_Task_5 {

public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Num 1 : ");
		int num1 = input.nextInt();
		
		System.out.println("Enter Num 2 : ");
		int num2 = input.nextInt();
		
		double add = num1 + num2;
		
		System.out.println("Addition of two number is : "+add);
		
	}
}


// Output :

//Enter Num 1 : 
//10
//Enter Num 2 : 
//20
//Addition of two number is : 30.0


