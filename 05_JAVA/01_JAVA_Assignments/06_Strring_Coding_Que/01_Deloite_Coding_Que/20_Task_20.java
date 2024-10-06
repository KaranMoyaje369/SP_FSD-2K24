//Write a program How to check Palindrome String

public class Task_20 {

	
	public static boolean checkPalindrome(String str) {
		
		StringBuilder sb = new StringBuilder(str);
		System.out.println(" Original String : "+sb);
		sb.reverse();
		
		String rev = sb.toString();
		System.out.println("\n Reverse String : "+rev);
		
		if(str.equals(rev)) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {


		Task_20 palindrome = new Task_20();
		System.out.println("\n Is Palindrome or Not : "+palindrome.checkPalindrome("java"));
		System.out.println();
		System.out.println("\n Is Palindrome or Not : "+palindrome.checkPalindrome("kanak"));

	}

}


// Output : 



// Original String : java

// Reverse String : avaj

// Is Palindrome or Not : false

// Original String : kanak

// Reverse String : kanak

// Is Palindrome or Not : true



