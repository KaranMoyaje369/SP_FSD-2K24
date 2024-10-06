
//write a java program to remove all starting and ending spaces from a string
package Wipro_Coding_Que;

import java.util.Scanner;

public class Task_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type Something Here...");
		String str = sc.nextLine();
		
		System.out.println("Input String : "+str);
		System.out.println("After Removing Spaces from Start and End : "+str.trim());
	}
}


// Output :

// Type Something Here...
// I am Back.    
// Input String :      I am Back.    
// After Removing Spaces from Start and End : I am Back.


