// User Info..

package Data_Types_Tasks;

import java.util.Scanner;

public class Data_Types_Task_6 {
	
public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Username : ");
		String uname = input.next();
		
		System.out.println("Enter Password : ");
		String pwd = input.next();
		
		System.out.println("Enter Age : ");
		int age = input.nextInt();
		
		System.out.println("Enter Salary : ");
		double salary = input.nextDouble();
		
		System.out.println(uname +" "+pwd + " "+age + " "+salary);
		
	}

}


// Output : 


//Enter Username : 
//Karan
//Enter Password : 
//Karan@123
//Enter Age : 
//22
//Enter Salary : 
//10000
//Karan Karan@123 22 10000.0


