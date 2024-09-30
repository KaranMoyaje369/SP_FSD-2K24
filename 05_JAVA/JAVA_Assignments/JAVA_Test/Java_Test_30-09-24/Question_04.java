package Java_Test;

import java.util.Scanner;

public class Question_04 {

	public static void main(String[] args) {


		int [] arr = {23,34,56,34,57,98};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		
//		
		for(int i : arr) {
			
			if(i == num) {
				System.out.println(+i+" Found in Array");
				break;
			} else {
				System.out.println(" Number Not Found in Array");
				break;
			}
		}
		
		
	}

}

// Output :

// Enter Number : 
// 23
// 23 Found in Array



