
// Q2. Write a program to count the vowels in the string.
// Input Format
// First line to get the input string S.
// Output Format
// Displays the number of vowels

package Capgemini_Coding_Que;

import java.util.Scanner;

public class Que_2 {

	public static int countVowels(String s) {
		s = s.toLowerCase();
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		
		return count;
	}
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		System.out.println("Type Something words Here...");
		String s = sc.nextLine();
		
		int count = countVowels(s);
		System.out.println(count);


	}

}


// Output :

// Type Something words Here...
// Hello Welcome to Sleeping World
// 10


