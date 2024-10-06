//Write a program to find first non repeating character in a string

import java.util.Scanner;

public class Task_19 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		
		
		
		System.out.println("Non Repeating character in agiven string : ");
		
		for(int i=0; i < str.length(); i++) {
			
		boolean isTrue = true;
			for(int j = 0; j < str.length(); j++) {
				
				if(i != j && str.charAt(i) == str.charAt(j)) {
					
					isTrue = false;
					break;
				}
			}
			
			if(isTrue) {
				System.out.println(str.charAt(i));
			}
		}
	}

}
