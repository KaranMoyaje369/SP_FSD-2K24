//Write a program to Count words in Given String

import java.util.Scanner;

public class Task_14 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		
		String str = sc.nextLine();
		
		if(str == null || str.isEmpty()) {
			System.out.println("The String is Empty.");
		} else {
			String[] word = str.trim().split("\\s+");
			
			System.out.println("Number Of Words : "+(word.length));
		}

	}

}


// Output :



// Enter String : 
// Hello My Name Is Karan.
// Number Of Words : 5





