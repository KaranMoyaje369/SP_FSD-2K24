

// Q1. Write a program to check whether the given string is a palindrome.
// Input Format
// Input to get a string S.
// Output Format
// Output prints whether the string is palindrome or not


package Capgemini_Coding_Que;

import java.util.Scanner;

public class Que_1 {

	public static boolean isPalindrome(String s) {
		s = s.toLowerCase();

		int start = 0;
		int end = s.length() - 1;

		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Word to Check Palindrome or Not ...");
		String s = sc.nextLine();

		if (isPalindrome(s)) {
			System.out.println(s + " Is Palindrome.");
		} else {
			System.out.println(s + " Is Not Palindrome.");
		}
	}

}


// Output :

// Enter Word to Check Palindrome or Not ...
// kanak
// kanak Is Palindrome.


