// floating number to integer number converter.
package Data_Types_Tasks;

import java.util.Scanner;


public class Data_Types_Task_3 {

public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Floating Value : ");
		
		float num = input.nextFloat();
		
		int res = (int)(num);
		
		System.out.println("Result is : "+res);
	
	}
}


// Output : 

//Enter Floating Value : 
//10.55
//Result is : 10


