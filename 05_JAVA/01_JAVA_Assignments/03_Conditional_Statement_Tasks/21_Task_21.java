
//Write a program to input any alphabet and check whether it is vowel or consonant

import java.util.Scanner;

public class Task_21 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Character Here...");
		char ch = input.next().charAt(0);
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			System.out.println(ch+ " Is a Vowel...");
		} else {
			System.out.println(ch+ " Is a Consonants...");
		}
	}

}

// Output :

// Enter Character Here...
// a
// a Is a Vowel...



