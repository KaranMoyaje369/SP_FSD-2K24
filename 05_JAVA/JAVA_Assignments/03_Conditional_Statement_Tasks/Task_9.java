
/*
 * Write a program to input basic salary of an employee and 
 * calculate its Gross salary according to following:

Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary <= 20000 : HRA = 25%, DA = 90%
Basic Salary > 20000 : HRA = 30%, DA = 95%
 * */

import java.util.Scanner;

public class Task_9 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Basic Salary : ");
		
		int bs = input.nextInt();
		
		double hra, da, grossSalary;
		
		if(bs <= 10000) {
			hra = bs * 0.2f;
			da = bs * 0.8f;
		} else if (bs <= 20000) {
			hra = bs * 0.25f;
			da = bs * 0.9f;
		} else {
			hra = bs * 0.3f;
			da = bs * 9.5f;
		}
		
		grossSalary = (bs + hra + da);
		
		System.out.println("Gross Salary : " +grossSalary);

	}

}


// Output : 


// Enter Basic Salary : 1000
// Gross Salary : 2000.0



