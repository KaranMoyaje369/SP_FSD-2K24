//Write a program to find maximum between two string

import java.util.Scanner;

public class Task_18 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1 : ");
		String str1 = sc.nextLine();
		System.out.println("Enter String 2 : ");
		String str2 = sc.nextLine();
		
		System.out.println("String 1 : "+str1);
		System.out.println("String 2 : "+str2);
		
		int lengthOfStr1 = str1.length();
		int lengthOfStr2 = str2.length();
		
		if(lengthOfStr1 > lengthOfStr2) {
			System.out.println("String 1 is Greater than String 2.");
		} else if(lengthOfStr1 < lengthOfStr2) {
			System.out.println("String 2 is greater than String 1.");
		} else {
			System.out.println("Both Strings Are Equal.");
		}

	}

}


// Output :


// Enter String 1 : 
// Social
// Enter String 2 : 
// Prachar
// String 1 : Social
// String 2 : Prachar
// String 2 is greater than String 1.



